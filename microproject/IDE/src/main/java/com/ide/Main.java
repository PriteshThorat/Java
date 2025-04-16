package com.ide;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.ide.ui.MainWindow;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        MainWindow mainWindow = new MainWindow(primaryStage);
        Scene scene = new Scene(mainWindow, 1200, 800);
        primaryStage.setTitle("Simple IDE");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
} 