# Simple IDE

A lightweight IDE built with Java and JavaFX, inspired by VS Code.

## Features

- File tree navigation
- Multi-tab editing
- Line numbers
- Basic file operations (New, Open, Save)
- Modern UI with JavaFX

## Requirements

- Java 17 or higher
- Maven 3.6 or higher

## Building and Running

1. Clone the repository
2. Navigate to the project directory
3. Build the project:
   ```
   mvn clean install
   ```
4. Run the application:
   ```
   mvn javafx:run
   ```

## Keyboard Shortcuts

- Ctrl+N: New File
- Ctrl+O: Open File
- Ctrl+S: Save File
- Ctrl+Q: Quit

## Project Structure

- `src/main/java/com/ide/Main.java`: Application entry point
- `src/main/java/com/ide/ui/MainWindow.java`: Main IDE window and UI components

## Contributing

Feel free to submit issues and enhancement requests! 

For javac - .\compile.bat

For java - .\run.bat