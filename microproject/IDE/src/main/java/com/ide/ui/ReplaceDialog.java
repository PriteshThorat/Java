package com.ide.ui;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.regex.Pattern;

public class ReplaceDialog {
    private final Stage stage;
    private final TextArea textArea;
    private String lastFindText = "";
    private final TextField searchField;
    private final TextField replaceField;
    private final CheckBox caseSensitive;
    private final CheckBox regex;
    private final Label statusLabel;

    public ReplaceDialog(Stage owner, TextArea textArea) {
        this.stage = new Stage();
        this.textArea = textArea;
        this.stage.initOwner(owner);

        VBox root = new VBox(10);
        root.setPadding(new Insets(10));

        HBox searchBox = new HBox(10);
        searchField = new TextField();
        searchField.setPromptText("Find");
        searchField.setPrefWidth(300);

        caseSensitive = new CheckBox("Case Sensitive");
        regex = new CheckBox("Regex");

        searchBox.getChildren().addAll(searchField, caseSensitive, regex);

        HBox replaceBox = new HBox(10);
        replaceField = new TextField();
        replaceField.setPromptText("Replace with");
        replaceField.setPrefWidth(300);
        replaceBox.getChildren().add(replaceField);

        HBox buttonBox = new HBox(10);
        Button findNext = new Button("Find Next");
        Button replace = new Button("Replace");
        Button replaceAll = new Button("Replace All");
        Button close = new Button("Close");

        buttonBox.getChildren().addAll(findNext, replace, replaceAll, close);

        statusLabel = new Label("");

        root.getChildren().addAll(searchBox, replaceBox, buttonBox, statusLabel);

        findNext.setOnAction(e -> findNext());
        replace.setOnAction(e -> replace());
        replaceAll.setOnAction(e -> replaceAll());
        close.setOnAction(e -> stage.close());

        Scene scene = new Scene(root);
        stage.setTitle("Replace");
        stage.setScene(scene);
    }

    public void show() {
        if (textArea == null) return;
        stage.show();
    }

    private void findNext() {
        String searchText = searchField.getText();
        if (searchText.isEmpty()) return;

        lastFindText = searchText;
        boolean useRegex = regex.isSelected();
        boolean caseSensitiveSearch = caseSensitive.isSelected();

        String content = textArea.getText();
        String searchContent = caseSensitiveSearch ? content : content.toLowerCase();
        String searchPattern = caseSensitiveSearch ? searchText : searchText.toLowerCase();

        int caretPosition = textArea.getCaretPosition();

        if (useRegex) {
            try {
                Pattern pattern = Pattern.compile(searchPattern, caseSensitiveSearch ? 0 : Pattern.CASE_INSENSITIVE);
                java.util.regex.Matcher matcher = pattern.matcher(content);

                if (matcher.find(caretPosition)) {
                    textArea.selectRange(matcher.start(), matcher.end());
                    statusLabel.setText("Found match at position " + matcher.start());
                } else if (matcher.find(0)) {
                    textArea.selectRange(matcher.start(), matcher.end());
                    statusLabel.setText("Found match at position " + matcher.start() + " (wrapped)");
                } else {
                    statusLabel.setText("No matches found");
                }
            } catch (Exception ex) {
                statusLabel.setText("Invalid regex pattern: " + ex.getMessage());
            }
        } else {
            int index = searchContent.indexOf(searchPattern, caretPosition);
            if (index >= 0) {
                textArea.selectRange(index, index + searchText.length());
                statusLabel.setText("Found match at position " + index);
            } else {
                index = searchContent.indexOf(searchPattern, 0);
                if (index >= 0) {
                    textArea.selectRange(index, index + searchText.length());
                    statusLabel.setText("Found match at position " + index + " (wrapped)");
                } else {
                    statusLabel.setText("No matches found");
                }
            }
        }
    }

    private void replace() {
        String searchText = searchField.getText();
        String replaceText = replaceField.getText();
        if (searchText.isEmpty()) return;

        if (textArea.getSelectedText().isEmpty()) {
            findNext();
            return;
        }

        String selectedText = textArea.getSelectedText();
        boolean useRegex = regex.isSelected();
        boolean caseSensitiveSearch = caseSensitive.isSelected();

        if (useRegex) {
            try {
                Pattern pattern = Pattern.compile(searchText, caseSensitiveSearch ? 0 : Pattern.CASE_INSENSITIVE);
                if (pattern.matcher(selectedText).matches()) {
                    textArea.replaceSelection(replaceText);
                    findNext();
                }
            } catch (Exception ex) {
                statusLabel.setText("Invalid regex pattern: " + ex.getMessage());
            }
        } else {
            if (caseSensitiveSearch ? selectedText.equals(searchText) : 
                selectedText.toLowerCase().equals(searchText.toLowerCase())) {
                textArea.replaceSelection(replaceText);
                findNext();
            }
        }
    }

    private void replaceAll() {
        String searchText = searchField.getText();
        String replaceText = replaceField.getText();
        if (searchText.isEmpty()) return;

        String content = textArea.getText();
        boolean useRegex = regex.isSelected();
        boolean caseSensitiveSearch = caseSensitive.isSelected();

        if (useRegex) {
            try {
                Pattern pattern = Pattern.compile(searchText, caseSensitiveSearch ? 0 : Pattern.CASE_INSENSITIVE);
                java.util.regex.Matcher matcher = pattern.matcher(content);
                StringBuffer result = new StringBuffer();
                int count = 0;

                while (matcher.find()) {
                    matcher.appendReplacement(result, replaceText);
                    count++;
                }
                matcher.appendTail(result);

                textArea.setText(result.toString());
                statusLabel.setText("Replaced " + count + " occurrences");
            } catch (Exception ex) {
                statusLabel.setText("Invalid regex pattern: " + ex.getMessage());
            }
        } else {
            String searchContent = caseSensitiveSearch ? content : content.toLowerCase();
            String searchPattern = caseSensitiveSearch ? searchText : searchText.toLowerCase();
            int count = 0;
            int index = 0;
            StringBuilder result = new StringBuilder();

            while (index < content.length()) {
                int matchIndex = searchContent.indexOf(searchPattern, index);
                if (matchIndex == -1) {
                    result.append(content.substring(index));
                    break;
                }
                result.append(content.substring(index, matchIndex));
                result.append(replaceText);
                index = matchIndex + searchText.length();
                count++;
            }

            textArea.setText(result.toString());
            statusLabel.setText("Replaced " + count + " occurrences");
        }
    }
} 