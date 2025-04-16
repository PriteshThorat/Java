@echo off
echo Compiling Java files...
if not exist bin mkdir bin
javac -d bin src\main\java\com\ide\Main.java src\main\java\com\ide\ui\MainWindow.java src\main\java\com\ide\ui\FindDialog.java src\main\java\com\ide\ui\ReplaceDialog.java
if %ERRORLEVEL% NEQ 0 (
    echo Compilation failed!
    pause
    exit /b %ERRORLEVEL%
)
echo Compilation successful!
echo Running the application...
java -cp bin com.ide.Main
pause 