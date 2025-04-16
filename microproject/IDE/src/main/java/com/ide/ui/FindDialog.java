package com.ide.ui;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.regex.Pattern;

public class FindDialog {
    private final Stage stage;
    private final TextArea textArea;
    private String lastFindText = "";
    private final TextField searchField;
    private final CheckBox caseSensitive;
    private final CheckBox regex;
    private final Label statusLabel;

    public FindDialog(Stage owner, TextArea textArea) {
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

        Button findNext = new Button("Find Next");
        Button findPrevious = new Button("Find Previous");
        Button close = new Button("Close");

        searchBox.getChildren().addAll(searchField, caseSensitive, regex);

        HBox buttonBox = new HBox(10);
        buttonBox.getChildren().addAll(findNext, findPrevious, close);

        statusLabel = new Label("");

        root.getChildren().addAll(searchBox, buttonBox, statusLabel);

        findNext.setOnAction(e -> findNext());
        findPrevious.setOnAction(e -> findPrevious());
        close.setOnAction(e -> stage.close());

        Scene scene = new Scene(root);
        stage.setTitle("Find");
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

    private void findPrevious() {
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

                int lastMatch = -1;
                int lastMatchEnd = -1;

                while (matcher.find()) {
                    if (matcher.start() >= caretPosition) break;
                    lastMatch = matcher.start();
                    lastMatchEnd = matcher.end();
                }

                if (lastMatch >= 0) {
                    textArea.selectRange(lastMatch, lastMatchEnd);
                    statusLabel.setText("Found match at position " + lastMatch);
                } else {
                    // Search from the end
                    matcher.reset();
                    while (matcher.find()) {
                        lastMatch = matcher.start();
                        lastMatchEnd = matcher.end();
                    }

                    if (lastMatch >= 0) {
                        textArea.selectRange(lastMatch, lastMatchEnd);
                        statusLabel.setText("Found match at position " + lastMatch + " (wrapped)");
                    } else {
                        statusLabel.setText("No matches found");
                    }
                }
            } catch (Exception ex) {
                statusLabel.setText("Invalid regex pattern: " + ex.getMessage());
            }
        } else {
            int lastIndex = -1;
            int currentIndex = searchContent.indexOf(searchPattern, 0);

            while (currentIndex >= 0 && currentIndex < caretPosition) {
                lastIndex = currentIndex;
                currentIndex = searchContent.indexOf(searchPattern, currentIndex + 1);
            }

            if (lastIndex >= 0) {
                textArea.selectRange(lastIndex, lastIndex + searchText.length());
                statusLabel.setText("Found match at position " + lastIndex);
            } else {
                // Search from the end
                currentIndex = searchContent.lastIndexOf(searchPattern);
                if (currentIndex >= 0) {
                    textArea.selectRange(currentIndex, currentIndex + searchText.length());
                    statusLabel.setText("Found match at position " + currentIndex + " (wrapped)");
                } else {
                    statusLabel.setText("No matches found");
                }
            }
        }
    }
} 