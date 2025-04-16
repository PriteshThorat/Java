@echo off
"C:\Program Files\Java\jdk-24\bin\java" --module-path "C:\Program Files\Java\javafx-sdk-21.0.6\lib" --add-modules javafx.controls,javafx.fxml --enable-native-access=javafx.graphics -cp bin com.ide.Main
pause 