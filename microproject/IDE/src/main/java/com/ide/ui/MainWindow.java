package com.ide.ui;

import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.Scene;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class MainWindow extends BorderPane {
    private TreeView<File> fileTree;
    private TabPane tabPane;
    private Map<Tab, File> tabFileMap = new HashMap<>();
    private Map<Tab, TextArea> tabTextAreaMap = new HashMap<>();
    private Stage stage;
    private boolean fileTreeVisible = true;
    private boolean lineNumbersVisible = true;
    private int currentFindPosition = 0;
    private String lastFindText = "";
    private boolean isDarkTheme = false;
    private VBox lineRuler;
    private TextArea currentTextArea;

    public MainWindow(Stage stage) {
        this.stage = stage;
        initializeComponents();
        createMenuBar();
        setupLayout();
        applyTheme();
    }

    private void initializeComponents() {
        // Initialize file tree
        fileTree = new TreeView<>();
        TreeItem<File> root = new TreeItem<>(new File(System.getProperty("user.dir")));
        fileTree.setRoot(root);
        fileTree.setShowRoot(true);
        populateFileTree(root);
        
        // Add double-click handler for file tree
        fileTree.setOnMouseClicked(event -> {
            if (event.getClickCount() == 2) {
                TreeItem<File> item = fileTree.getSelectionModel().getSelectedItem();
                if (item != null && item.getValue().isFile()) {
                    openFile(item.getValue());
                }
            }
        });

        // Initialize TabPane
        tabPane = new TabPane();
        tabPane.setTabClosingPolicy(TabPane.TabClosingPolicy.ALL_TABS);
        tabPane.getSelectionModel().selectedItemProperty().addListener((obs, oldTab, newTab) -> {
            if (newTab != null) {
                stage.setTitle(newTab.getText() + " - Simple IDE");
                updateLineRuler();
            }
        });

        // Add tab close handler
        tabPane.getTabs().addListener((javafx.collections.ListChangeListener.Change<? extends Tab> c) -> {
            while (c.next()) {
                if (c.wasRemoved()) {
                    for (Tab tab : c.getRemoved()) {
                        if (isFileModified(tab)) {
                            ButtonType result = new Alert(Alert.AlertType.CONFIRMATION,
                                    "Do you want to save changes to " + tab.getText() + "?",
                                    ButtonType.YES, ButtonType.NO, ButtonType.CANCEL).showAndWait().orElse(ButtonType.CANCEL);

                            if (result == ButtonType.YES) {
                                saveFile(tab);
                            } else if (result == ButtonType.CANCEL) {
                                tabPane.getTabs().add(tab);
                            }
                        }
                        tabFileMap.remove(tab);
                        tabTextAreaMap.remove(tab);
                    }
                }
            }
        });

        // Initialize line ruler
        lineRuler = new VBox();
        lineRuler.setPadding(new Insets(5, 5, 5, 5));
        lineRuler.setStyle("-fx-background-color: #f0f0f0; -fx-border-color: #cccccc; -fx-border-width: 0 1 0 0;");
        lineRuler.setPrefWidth(50);
        lineRuler.setMinWidth(50);
        updateLineRuler();
    }

    private void createMenuBar() {
        MenuBar menuBar = new MenuBar();

        // File Menu
        Menu fileMenu = new Menu("File");
        MenuItem newFile = new MenuItem("New");
        MenuItem openFile = new MenuItem("Open");
        MenuItem saveFile = new MenuItem("Save");
        MenuItem saveAsFile = new MenuItem("Save As");
        MenuItem exit = new MenuItem("Exit");

        newFile.setAccelerator(new KeyCodeCombination(KeyCode.N, KeyCombination.CONTROL_DOWN));
        openFile.setAccelerator(new KeyCodeCombination(KeyCode.O, KeyCombination.CONTROL_DOWN));
        saveFile.setAccelerator(new KeyCodeCombination(KeyCode.S, KeyCombination.CONTROL_DOWN));
        saveAsFile.setAccelerator(new KeyCodeCombination(KeyCode.S, KeyCombination.CONTROL_DOWN, KeyCombination.SHIFT_DOWN));
        exit.setAccelerator(new KeyCodeCombination(KeyCode.F4, KeyCombination.ALT_DOWN));

        newFile.setOnAction(e -> createNewFile());
        openFile.setOnAction(e -> openFileDialog());
        saveFile.setOnAction(e -> saveFile(getCurrentTab()));
        saveAsFile.setOnAction(e -> saveFileAs(getCurrentTab()));
        exit.setOnAction(e -> Platform.exit());

        fileMenu.getItems().addAll(newFile, openFile, new SeparatorMenuItem(), saveFile, saveAsFile, new SeparatorMenuItem(), exit);

        // Edit Menu
        Menu editMenu = new Menu("Edit");
        MenuItem find = new MenuItem("Find");
        MenuItem replace = new MenuItem("Replace");
        MenuItem runFile = new MenuItem("Run File");
        MenuItem toggleTheme = new MenuItem("Toggle Theme");

        find.setAccelerator(new KeyCodeCombination(KeyCode.F, KeyCombination.CONTROL_DOWN));
        replace.setAccelerator(new KeyCodeCombination(KeyCode.H, KeyCombination.CONTROL_DOWN));
        runFile.setAccelerator(new KeyCodeCombination(KeyCode.R, KeyCombination.CONTROL_DOWN));
        toggleTheme.setAccelerator(new KeyCodeCombination(KeyCode.T, KeyCombination.CONTROL_DOWN));

        find.setOnAction(e -> showFindDialog());
        replace.setOnAction(e -> showReplaceDialog());
        runFile.setOnAction(e -> runCurrentFile());
        toggleTheme.setOnAction(e -> toggleTheme());

        editMenu.getItems().addAll(find, replace, new SeparatorMenuItem(), runFile, toggleTheme);

        // View Menu
        Menu viewMenu = new Menu("View");
        MenuItem toggleFileTree = new MenuItem("Toggle File Tree");
        MenuItem toggleLineNumbers = new MenuItem("Toggle Line Numbers");

        toggleFileTree.setAccelerator(new KeyCodeCombination(KeyCode.B, KeyCombination.CONTROL_DOWN));
        toggleLineNumbers.setAccelerator(new KeyCodeCombination(KeyCode.L, KeyCombination.CONTROL_DOWN));

        toggleFileTree.setOnAction(e -> toggleFileTree());
        toggleLineNumbers.setOnAction(e -> toggleLineNumbers());

        viewMenu.getItems().addAll(toggleFileTree, toggleLineNumbers);

        menuBar.getMenus().addAll(fileMenu, editMenu, viewMenu);
        setTop(menuBar);
    }

    private void setupLayout() {
        // Create toolbar
        ToolBar toolBar = new ToolBar();
        Button runButton = new Button("Run");
        runButton.setOnAction(e -> runCurrentFile());
        runButton.setStyle("-fx-base: #4CAF50; -fx-text-fill: white; -fx-font-weight: bold; -fx-padding: 5 10 5 10;");
        toolBar.getItems().add(runButton);
        toolBar.setStyle("-fx-background-color: " + (isDarkTheme ? "#3c3f41" : "#f0f0f0") + ";");

        // Create top container for menu and toolbar
        VBox topContainer = new VBox();
        MenuBar menuBar = (MenuBar) getTop();
        topContainer.getChildren().addAll(menuBar, toolBar);
        setTop(topContainer);

        // Create main split pane
        SplitPane splitPane = new SplitPane();
        splitPane.getItems().addAll(fileTree, createEditorPane());
        splitPane.setDividerPositions(0.2);
        setCenter(splitPane);
        
        // Create initial text area
        createTextArea();
    }

    private HBox createEditorPane() {
        HBox editorPane = new HBox();
        editorPane.getChildren().addAll(lineRuler, tabPane);
        HBox.setHgrow(tabPane, Priority.ALWAYS);
        VBox.setVgrow(editorPane, Priority.ALWAYS);
        
        // Make tabPane fill the available space
        tabPane.setMaxWidth(Double.MAX_VALUE);
        tabPane.setMaxHeight(Double.MAX_VALUE);
        
        return editorPane;
    }

    private TextArea createTextArea() {
        TextArea textArea = new TextArea();
        textArea.setWrapText(true);
        textArea.setPrefRowCount(20);
        textArea.setPrefColumnCount(80);
        textArea.setFont(Font.font("Consolas", 14));
        
        // Make text area fill its container
        textArea.setMaxWidth(Double.MAX_VALUE);
        textArea.setMaxHeight(Double.MAX_VALUE);
        VBox.setVgrow(textArea, Priority.ALWAYS);
        HBox.setHgrow(textArea, Priority.ALWAYS);
        
        // Add line numbers
        textArea.textProperty().addListener((observable, oldValue, newValue) -> {
            updateLineRuler();
        });
        
        ScrollPane scrollPane = new ScrollPane(textArea);
        scrollPane.setFitToWidth(true);
        scrollPane.setFitToHeight(true);
        
        // Make scroll pane fill its container
        scrollPane.setMaxWidth(Double.MAX_VALUE);
        scrollPane.setMaxHeight(Double.MAX_VALUE);
        VBox.setVgrow(scrollPane, Priority.ALWAYS);
        HBox.setHgrow(scrollPane, Priority.ALWAYS);
        
        Tab tab = new Tab("Untitled", scrollPane);
        tab.setClosable(true);
        tabPane.getTabs().add(tab);
        tabPane.getSelectionModel().select(tab);
        
        // Store the text area reference
        currentTextArea = textArea;
        tabTextAreaMap.put(tab, textArea);
        
        return textArea;
    }

    private void updateLineRuler() {
        TextArea textArea = getCurrentTextArea();
        if (textArea == null) return;
        
        String text = textArea.getText();
        String[] lines = text.split("\n", -1);
        
        // Create a VBox to hold the line numbers
        VBox lineNumbers = new VBox();
        lineNumbers.setStyle("-fx-background-color: #f0f0f0; -fx-border-color: #cccccc; -fx-border-width: 0 1 0 0;");
        lineNumbers.setPrefWidth(50);
        lineNumbers.setMinWidth(50);
        
        // Add line numbers
        for (int i = 0; i < lines.length; i++) {
            Text lineNumber = new Text(String.format("%4d", i + 1));
            lineNumber.setFont(Font.font("Consolas", 14));
            lineNumber.setFill(Color.GRAY);
            
            // Create a container for each line number
            HBox lineContainer = new HBox();
            lineContainer.setAlignment(Pos.CENTER_RIGHT);
            lineContainer.setPadding(new Insets(0, 5, 0, 0));
            lineContainer.getChildren().add(lineNumber);
            
            lineNumbers.getChildren().add(lineContainer);
        }
        
        // Create a HBox to hold both the line numbers and the text area
        HBox editorBox = new HBox();
        editorBox.getChildren().addAll(lineNumbers, textArea);
        HBox.setHgrow(textArea, Priority.ALWAYS);
        
        // Get the current tab and replace its content
        Tab currentTab = tabPane.getSelectionModel().getSelectedItem();
        if (currentTab != null) {
            currentTab.setContent(editorBox);
        }
    }

    private void highlightCurrentLine(TextArea textArea) {
        if (textArea == null) return;
        
        int caretPosition = textArea.getCaretPosition();
        String text = textArea.getText();
        int lineStart = text.lastIndexOf("\n", caretPosition) + 1;
        int lineEnd = text.indexOf("\n", caretPosition);
        if (lineEnd == -1) lineEnd = text.length();
        
        textArea.selectRange(lineStart, lineEnd);
        textArea.setStyle("-fx-highlight-fill: #e6e6e6;");
    }

    private void toggleTheme() {
        isDarkTheme = !isDarkTheme;
        applyTheme();
    }

    private void applyTheme() {
        String baseStyle = isDarkTheme ? 
            "-fx-background-color: #2b2b2b; -fx-text-fill: #ffffff; -fx-control-inner-background: #3c3f41;" :
            "-fx-background-color: #ffffff; -fx-text-fill: #000000; -fx-control-inner-background: #ffffff;";
        
        String menuStyle = isDarkTheme ?
            "-fx-background-color: #3c3f41; -fx-text-fill: #ffffff;" :
            "-fx-background-color: #f0f0f0; -fx-text-fill: #000000;";
        
        String rulerStyle = isDarkTheme ?
            "-fx-background-color: #3c3f41; -fx-text-fill: #808080;" :
            "-fx-background-color: #f0f0f0; -fx-text-fill: #808080;";

        String toolbarStyle = isDarkTheme ?
            "-fx-background-color: #3c3f41;" :
            "-fx-background-color: #f0f0f0;";

        setStyle(baseStyle);
        ((VBox)getTop()).getChildren().get(0).setStyle(menuStyle); // Menu bar
        ((VBox)getTop()).getChildren().get(1).setStyle(toolbarStyle); // Toolbar
        lineRuler.setStyle(rulerStyle);

        // Apply theme to all text areas
        for (Tab tab : tabPane.getTabs()) {
            TextArea textArea = tabTextAreaMap.get(tab);
            if (textArea != null) {
                textArea.setStyle(baseStyle);
            }
        }
    }

    private void populateFileTree(TreeItem<File> root) {
        File[] files = root.getValue().listFiles();
        if (files != null) {
            for (File file : files) {
                TreeItem<File> item = new TreeItem<>(file);
                root.getChildren().add(item);
                if (file.isDirectory()) {
                    populateFileTree(item);
                }
            }
        }
    }

    private void createNewFile() {
        TextArea textArea = new TextArea();
        textArea.setWrapText(true);
        textArea.setPrefRowCount(20);
        textArea.setPrefColumnCount(80);
        textArea.setFont(Font.font("Consolas", 14));
        
        // Add line numbers
        textArea.textProperty().addListener((observable, oldValue, newValue) -> {
            updateLineRuler();
            // Apply syntax highlighting when text changes
            Tab currentTab = getCurrentTab();
            if (currentTab != null) {
                SyntaxHighlighter.applyHighlighting(textArea, currentTab.getText());
            }
        });
        
        ScrollPane scrollPane = new ScrollPane(textArea);
        scrollPane.setFitToWidth(true);
        scrollPane.setFitToHeight(true);
        
        Tab tab = new Tab("Untitled", scrollPane);
        tab.setClosable(true);
        tabPane.getTabs().add(tab);
        tabPane.getSelectionModel().select(tab);
        
        // Store the text area reference
        currentTextArea = textArea;
        tabTextAreaMap.put(tab, textArea);
        
        // Apply dark theme if active
        if (isDarkTheme) {
            textArea.setStyle("-fx-text-fill: white; -fx-control-inner-background: #2b2b2b;");
        }
    }

    private void openFileDialog() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open File");
        fileChooser.getExtensionFilters().addAll(
            new FileChooser.ExtensionFilter("All Files", "*.*"),
            new FileChooser.ExtensionFilter("Java Files", "*.java"),
            new FileChooser.ExtensionFilter("Python Files", "*.py"),
            new FileChooser.ExtensionFilter("JavaScript Files", "*.js"),
            new FileChooser.ExtensionFilter("HTML Files", "*.html"),
            new FileChooser.ExtensionFilter("CSS Files", "*.css"),
            new FileChooser.ExtensionFilter("PHP Files", "*.php"),
            new FileChooser.ExtensionFilter("Ruby Files", "*.rb"),
            new FileChooser.ExtensionFilter("Go Files", "*.go"),
            new FileChooser.ExtensionFilter("Rust Files", "*.rs"),
            new FileChooser.ExtensionFilter("C Files", "*.c"),
            new FileChooser.ExtensionFilter("C++ Files", "*.cpp"),
            new FileChooser.ExtensionFilter("Text Files", "*.txt")
        );
        
        File file = fileChooser.showOpenDialog(stage);
        if (file != null) {
            openFile(file);
        }
    }

    private void openFile(File file) {
        try {
            String content = new String(Files.readAllBytes(file.toPath()));
            TextArea textArea = new TextArea(content);
            textArea.setWrapText(true);
            textArea.setPrefRowCount(20);
            textArea.setPrefColumnCount(80);
            textArea.setFont(Font.font("Consolas", 14));
            
            // Add line numbers
            textArea.textProperty().addListener((observable, oldValue, newValue) -> {
                updateLineRuler();
                // Apply syntax highlighting when text changes
                SyntaxHighlighter.applyHighlighting(textArea, file.getName());
            });
            
            ScrollPane scrollPane = new ScrollPane(textArea);
            scrollPane.setFitToWidth(true);
            scrollPane.setFitToHeight(true);
            
            Tab tab = new Tab(file.getName(), scrollPane);
            tab.setClosable(true);
            tabPane.getTabs().add(tab);
            tabPane.getSelectionModel().select(tab);
            
            // Store references
            currentTextArea = textArea;
            tabTextAreaMap.put(tab, textArea);
            tabFileMap.put(tab, file);
            
            // Apply dark theme if active
            if (isDarkTheme) {
                textArea.setStyle("-fx-text-fill: white; -fx-control-inner-background: #2b2b2b;");
            }
            
            // Apply initial syntax highlighting
            SyntaxHighlighter.applyHighlighting(textArea, file.getName());
        } catch (IOException e) {
            showError("Error", "Could not open file: " + e.getMessage());
        }
    }

    private void saveFile(Tab tab) {
        if (tab == null) return;
        
        TextArea textArea = tabTextAreaMap.get(tab);
        if (textArea == null) return;

        File file = tabFileMap.get(tab);
        if (file == null) {
            // This is a new file, show save dialog
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Save File");
            fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("All Files", "*.*"),
                new FileChooser.ExtensionFilter("Java Files", "*.java"),
                new FileChooser.ExtensionFilter("Python Files", "*.py"),
                new FileChooser.ExtensionFilter("JavaScript Files", "*.js"),
                new FileChooser.ExtensionFilter("HTML Files", "*.html"),
                new FileChooser.ExtensionFilter("CSS Files", "*.css"),
                new FileChooser.ExtensionFilter("PHP Files", "*.php"),
                new FileChooser.ExtensionFilter("Ruby Files", "*.rb"),
                new FileChooser.ExtensionFilter("Go Files", "*.go"),
                new FileChooser.ExtensionFilter("Rust Files", "*.rs"),
                new FileChooser.ExtensionFilter("C Files", "*.c"),
                new FileChooser.ExtensionFilter("C++ Files", "*.cpp"),
                new FileChooser.ExtensionFilter("Text Files", "*.txt")
            );
            
            file = fileChooser.showSaveDialog(stage);
            if (file == null) return;
            
            tabFileMap.put(tab, file);
            tab.setText(file.getName());
            
            // Apply syntax highlighting after saving with new extension
            SyntaxHighlighter.applyHighlighting(textArea, file.getName());
        }
        
        try {
            Files.write(file.toPath(), textArea.getText().getBytes());
            refreshFileTree();
        } catch (IOException e) {
            showError("Error saving file", e.getMessage());
        }
    }

    private void saveFileAs(Tab tab) {
        if (tab == null) return;
        
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save File As");
        fileChooser.getExtensionFilters().addAll(
            new FileChooser.ExtensionFilter("All Files", "*.*"),
            new FileChooser.ExtensionFilter("Java Files", "*.java"),
            new FileChooser.ExtensionFilter("Python Files", "*.py"),
            new FileChooser.ExtensionFilter("JavaScript Files", "*.js"),
            new FileChooser.ExtensionFilter("HTML Files", "*.html"),
            new FileChooser.ExtensionFilter("CSS Files", "*.css"),
            new FileChooser.ExtensionFilter("PHP Files", "*.php"),
            new FileChooser.ExtensionFilter("Ruby Files", "*.rb"),
            new FileChooser.ExtensionFilter("Go Files", "*.go"),
            new FileChooser.ExtensionFilter("Rust Files", "*.rs"),
            new FileChooser.ExtensionFilter("C Files", "*.c"),
            new FileChooser.ExtensionFilter("C++ Files", "*.cpp"),
            new FileChooser.ExtensionFilter("Text Files", "*.txt")
        );
        
        File file = fileChooser.showSaveDialog(stage);
        if (file != null) {
            try {
                TextArea textArea = getCurrentTextArea();
                if (textArea != null) {
                    Files.write(file.toPath(), textArea.getText().getBytes());
                    tabFileMap.put(tab, file);
                    tab.setUserData(file);  // Store the file in the tab's user data
                    tab.setText(file.getName());
                    refreshFileTree();
                }
            } catch (IOException e) {
                showError("Error saving file", e.getMessage());
            }
        }
    }

    private boolean isFileModified(Tab tab) {
        if (tab == null || !tabFileMap.containsKey(tab)) return false;
        
        try {
            File file = tabFileMap.get(tab);
            String fileContent = new String(Files.readAllBytes(file.toPath()));
            TextArea textArea = getCurrentTextArea();
            return textArea != null && !fileContent.equals(textArea.getText());
        } catch (IOException e) {
            return true;
        }
    }

    private void refreshFileTree() {
        TreeItem<File> root = fileTree.getRoot();
        root.getChildren().clear();
        populateFileTree(root);
    }

    private Tab getCurrentTab() {
        return tabPane.getSelectionModel().getSelectedItem();
    }

    private TextArea getCurrentTextArea() {
        Tab currentTab = tabPane.getSelectionModel().getSelectedItem();
        if (currentTab != null) {
            return tabTextAreaMap.get(currentTab);
        }
        return null;
    }

    private void showError(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void showFindDialog() {
        FindDialog findDialog = new FindDialog((Stage) getScene().getWindow(), getCurrentTextArea());
        findDialog.show();
    }

    private void showReplaceDialog() {
        ReplaceDialog replaceDialog = new ReplaceDialog((Stage) getScene().getWindow(), getCurrentTextArea());
        replaceDialog.show();
    }

    private void toggleFileTree() {
        fileTreeVisible = !fileTreeVisible;
        SplitPane splitPane = (SplitPane) getCenter();
        
        if (fileTreeVisible) {
            if (!splitPane.getItems().contains(fileTree)) {
                splitPane.getItems().add(0, fileTree);
            }
            splitPane.setDividerPositions(0.2);
        } else {
            splitPane.getItems().remove(fileTree);
        }
    }

    private void toggleLineNumbers() {
        lineNumbersVisible = !lineNumbersVisible;
        
        for (Tab tab : tabPane.getTabs()) {
            TextArea textArea = tabTextAreaMap.get(tab);
            if (textArea != null) {
                if (lineNumbersVisible) {
                    textArea.setStyle("-fx-font-family: 'Consolas', 'Courier New', monospace; -fx-font-size: 14px; -fx-background-color: #f5f5f5;");
                    // In a real IDE, we would implement line numbers here
                    // For this simple version, we'll just change the background color
                } else {
                    textArea.setStyle("-fx-font-family: 'Consolas', 'Courier New', monospace; -fx-font-size: 14px;");
                }
            }
        }
    }

    private void runCurrentFile() {
        Tab currentTab = tabPane.getSelectionModel().getSelectedItem();
        if (currentTab != null) {
            File file = tabFileMap.get(currentTab);
            if (file != null) {
                TextArea outputArea = new TextArea();
                outputArea.setEditable(false);
                outputArea.setPrefRowCount(10);
                
                Stage outputStage = new Stage();
                outputStage.setTitle("Output - " + file.getName());
                Scene scene = new Scene(new VBox(outputArea), 600, 400);
                outputStage.setScene(scene);
                outputStage.show();
                
                FileRunner.runFile(file, outputArea).thenAccept(output -> {
                    Platform.runLater(() -> {
                        outputArea.setText(output);
                    });
                });
            }
        }
    }
} 