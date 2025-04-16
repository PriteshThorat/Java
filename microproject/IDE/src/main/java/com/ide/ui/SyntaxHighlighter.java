package com.ide.ui;

import javafx.scene.control.TextArea;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SyntaxHighlighter {
    private static final Map<String, Map<String, Pattern>> languagePatterns = new HashMap<>();
    private static final Map<String, Map<String, Color>> languageColors = new HashMap<>();
    
    static {
        // Java syntax highlighting
        Map<String, Pattern> javaPatterns = new HashMap<>();
        Map<String, Color> javaColors = new HashMap<>();
        
        javaPatterns.put("keywords", Pattern.compile("\\b(abstract|assert|boolean|break|byte|case|catch|char|class|const|continue|default|do|double|else|enum|extends|final|finally|float|for|if|implements|import|instanceof|int|interface|long|native|new|package|private|protected|public|return|short|static|strictfp|super|switch|synchronized|this|throw|throws|transient|try|void|volatile|while)\\b"));
        javaPatterns.put("types", Pattern.compile("\\b(String|Integer|Double|Float|Long|Boolean|Byte|Character|Short|Void|Object|Exception|Error|Thread|Runnable|Collection|List|Map|Set|ArrayList|HashMap|HashSet)\\b"));
        javaPatterns.put("strings", Pattern.compile("\"[^\"\\\\]*(\\\\.[^\"\\\\]*)*\""));
        javaPatterns.put("comments", Pattern.compile("//.*|/\\*[\\s\\S]*?\\*/"));
        javaPatterns.put("numbers", Pattern.compile("\\b\\d+(\\.\\d+)?\\b"));
        
        javaColors.put("keywords", Color.rgb(86, 156, 214)); // Blue
        javaColors.put("types", Color.rgb(78, 201, 176)); // Teal
        javaColors.put("strings", Color.rgb(214, 157, 133)); // Orange
        javaColors.put("comments", Color.rgb(87, 166, 74)); // Green
        javaColors.put("numbers", Color.rgb(104, 151, 187)); // Light blue
        
        languagePatterns.put("java", javaPatterns);
        languageColors.put("java", javaColors);
        
        // Python syntax highlighting
        Map<String, Pattern> pythonPatterns = new HashMap<>();
        Map<String, Color> pythonColors = new HashMap<>();
        
        pythonPatterns.put("keywords", Pattern.compile("\\b(and|as|assert|break|class|continue|def|del|elif|else|except|exec|finally|for|from|global|if|import|in|is|lambda|None|not|or|pass|raise|return|try|while|with|yield|True|False|print|len|range|list|dict|set|tuple|str|int|float|bool|open|close|read|write|append|remove|pop|clear|copy|keys|values|items|get|update|add|discard|union|intersection|difference|symmetric_difference|issubset|issuperset|isdisjoint|count|index|insert|extend|reverse|sort|split|join|strip|upper|lower|capitalize|title|replace|find|startswith|endswith|isalpha|isdigit|isalnum|isspace|islower|isupper|istitle|format|encode|decode)\\b"));
        pythonPatterns.put("types", Pattern.compile("\\b(str|int|float|list|dict|set|tuple|bool|None|True|False)\\b"));
        pythonPatterns.put("strings", Pattern.compile("(\"[^\"\\\\]*(\\\\.[^\"\\\\]*)*\")|('[^'\\\\]*(\\\\.[^'\\\\]*)*')"));
        pythonPatterns.put("comments", Pattern.compile("#.*"));
        pythonPatterns.put("numbers", Pattern.compile("\\b\\d+(\\.\\d+)?\\b"));
        
        pythonColors.put("keywords", Color.rgb(86, 156, 214)); // Blue
        pythonColors.put("types", Color.rgb(78, 201, 176)); // Teal
        pythonColors.put("strings", Color.rgb(214, 157, 133)); // Orange
        pythonColors.put("comments", Color.rgb(87, 166, 74)); // Green
        pythonColors.put("numbers", Color.rgb(104, 151, 187)); // Light blue
        
        languagePatterns.put("py", pythonPatterns);
        languageColors.put("py", pythonColors);
        
        // JavaScript syntax highlighting
        Map<String, Pattern> jsPatterns = new HashMap<>();
        Map<String, Color> jsColors = new HashMap<>();
        
        jsPatterns.put("keywords", Pattern.compile("\\b(var|let|const|function|return|if|else|for|while|do|switch|case|break|continue|try|catch|throw|new|this|class|extends|super|import|export|default|async|await)\\b"));
        jsPatterns.put("types", Pattern.compile("\\b(String|Number|Boolean|Object|Array|Function|Symbol|undefined|null|NaN|Infinity)\\b"));
        jsPatterns.put("strings", Pattern.compile("(\"[^\"\\\\]*(\\\\.[^\"\\\\]*)*\")|('[^'\\\\]*(\\\\.[^'\\\\]*)*')|(`[^`\\\\]*(\\\\.[^`\\\\]*)*`)"));
        jsPatterns.put("comments", Pattern.compile("//.*|/\\*[\\s\\S]*?\\*/"));
        jsPatterns.put("numbers", Pattern.compile("\\b\\d+(\\.\\d+)?\\b"));
        
        jsColors.put("keywords", Color.rgb(86, 156, 214)); // Blue
        jsColors.put("types", Color.rgb(78, 201, 176)); // Teal
        jsColors.put("strings", Color.rgb(214, 157, 133)); // Orange
        jsColors.put("comments", Color.rgb(87, 166, 74)); // Green
        jsColors.put("numbers", Color.rgb(104, 151, 187)); // Light blue
        
        languagePatterns.put("js", jsPatterns);
        languageColors.put("js", jsColors);
        
        // HTML syntax highlighting
        Map<String, Pattern> htmlPatterns = new HashMap<>();
        Map<String, Color> htmlColors = new HashMap<>();
        
        htmlPatterns.put("tags", Pattern.compile("</?[a-zA-Z0-9]+(\\s+[a-zA-Z0-9-]+(\\s*=\\s*(\"[^\"]*\"|'[^']*'))?)*\\s*>"));
        htmlPatterns.put("attributes", Pattern.compile("\\s+([a-zA-Z0-9-]+)\\s*=\\s*(\"[^\"]*\"|'[^']*')"));
        htmlPatterns.put("comments", Pattern.compile("<!--[\\s\\S]*?-->"));
        
        htmlColors.put("tags", Color.rgb(86, 156, 214)); // Blue
        htmlColors.put("attributes", Color.rgb(156, 220, 254)); // Light blue
        htmlColors.put("comments", Color.rgb(87, 166, 74)); // Green
        
        languagePatterns.put("html", htmlPatterns);
        languageColors.put("html", htmlColors);
        
        // CSS syntax highlighting
        Map<String, Pattern> cssPatterns = new HashMap<>();
        Map<String, Color> cssColors = new HashMap<>();
        
        cssPatterns.put("selectors", Pattern.compile("[a-zA-Z0-9_\\-]+\\s*\\{|#[a-zA-Z0-9_\\-]+\\s*\\{|\\.[a-zA-Z0-9_\\-]+\\s*\\{|@[a-zA-Z0-9_\\-]+\\s*\\{"));
        cssPatterns.put("properties", Pattern.compile("\\s*([a-zA-Z0-9_\\-]+)\\s*:"));
        cssPatterns.put("values", Pattern.compile(":\\s*([^;]+);"));
        cssPatterns.put("comments", Pattern.compile("/\\*[\\s\\S]*?\\*/"));
        
        cssColors.put("selectors", Color.rgb(86, 156, 214)); // Blue
        cssColors.put("properties", Color.rgb(156, 220, 254)); // Light blue
        cssColors.put("values", Color.rgb(214, 157, 133)); // Orange
        cssColors.put("comments", Color.rgb(87, 166, 74)); // Green
        
        languagePatterns.put("css", cssPatterns);
        languageColors.put("css", cssColors);
    }
    
    public static void applyHighlighting(TextArea textArea, String language) {
        if (textArea == null || language == null) return;
        
        String text = textArea.getText();
        String extension = getFileExtension(language);
        
        if (!languagePatterns.containsKey(extension)) {
            return; // No highlighting for this language
        }
        
        Map<String, Pattern> patterns = languagePatterns.get(extension);
        Map<String, Color> colors = languageColors.get(extension);
        
        // Create a TextFlow to hold the highlighted text
        TextFlow textFlow = new TextFlow();
        textFlow.setStyle("-fx-font-family: 'Consolas', 'Courier New', monospace; -fx-font-size: 14px;");
        
        // Apply highlighting
        int lastEnd = 0;
        for (Map.Entry<String, Pattern> entry : patterns.entrySet()) {
            String category = entry.getKey();
            Pattern pattern = entry.getValue();
            Color color = colors.get(category);
            
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                
                // Add text before the match
                if (start > lastEnd) {
                    Text beforeText = new Text(text.substring(lastEnd, start));
                    beforeText.setFont(Font.font("Consolas", 14));
                    textFlow.getChildren().add(beforeText);
                }
                
                // Add the highlighted match
                Text highlightedText = new Text(text.substring(start, end));
                highlightedText.setFont(Font.font("Consolas", 14));
                highlightedText.setFill(color);
                textFlow.getChildren().add(highlightedText);
                
                lastEnd = end;
            }
        }
        
        // Add any remaining text
        if (lastEnd < text.length()) {
            Text remainingText = new Text(text.substring(lastEnd));
            remainingText.setFont(Font.font("Consolas", 14));
            textFlow.getChildren().add(remainingText);
        }
        
        // Replace the text area's content with the highlighted text
        textArea.setText(text);
        textArea.setStyle("-fx-font-family: 'Consolas', 'Courier New', monospace; -fx-font-size: 14px;");
    }
    
    private static String getFileExtension(String fileName) {
        int lastDotIndex = fileName.lastIndexOf('.');
        if (lastDotIndex > 0) {
            return fileName.substring(lastDotIndex + 1).toLowerCase();
        }
        return fileName.toLowerCase();
    }
} 