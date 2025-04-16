package com.ide.utils;

import javafx.scene.control.TextArea;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class FileRunner {
    private static final String JAVA_HOME = System.getenv("JAVA_HOME");
    private static final String PYTHON_PATH = "python";
    private static final String GCC_PATH = "gcc";
    private static final String GPP_PATH = "g++";

    public static CompletableFuture<String> runFile(File file, TextArea outputArea) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                String fileName = file.getName().toLowerCase();
                String filePath = file.getAbsolutePath();
                ProcessBuilder processBuilder;
                Process process;

                if (fileName.endsWith(".java")) {
                    // Compile and run Java file
                    String className = file.getName().substring(0, file.getName().length() - 5);
                    String javacPath = JAVA_HOME + "\\bin\\javac.exe";
                    String javaPath = JAVA_HOME + "\\bin\\java.exe";
                    
                    processBuilder = new ProcessBuilder(
                        javacPath,
                        filePath
                    );
                    process = processBuilder.start();
                    process.waitFor();

                    if (process.exitValue() == 0) {
                        processBuilder = new ProcessBuilder(
                            javaPath,
                            "-cp",
                            file.getParent(),
                            className
                        );
                        process = processBuilder.start();
                    }
                } else if (fileName.endsWith(".py")) {
                    // Run Python file
                    processBuilder = new ProcessBuilder(
                        PYTHON_PATH,
                        filePath
                    );
                    process = processBuilder.start();
                } else if (fileName.endsWith(".c")) {
                    // Compile and run C file
                    String outputPath = filePath.substring(0, filePath.length() - 2) + ".exe";
                    processBuilder = new ProcessBuilder(
                        GCC_PATH,
                        filePath,
                        "-o",
                        outputPath
                    );
                    process = processBuilder.start();
                    process.waitFor();

                    if (process.exitValue() == 0) {
                        processBuilder = new ProcessBuilder(outputPath);
                        process = processBuilder.start();
                    }
                } else if (fileName.endsWith(".cpp")) {
                    // Compile and run C++ file
                    String outputPath = filePath.substring(0, filePath.length() - 4) + ".exe";
                    processBuilder = new ProcessBuilder(
                        GPP_PATH,
                        filePath,
                        "-o",
                        outputPath
                    );
                    process = processBuilder.start();
                    process.waitFor();

                    if (process.exitValue() == 0) {
                        processBuilder = new ProcessBuilder(outputPath);
                        process = processBuilder.start();
                    }
                } else {
                    return "Unsupported file type: " + fileName;
                }

                // Read the output
                java.util.Scanner scanner = new java.util.Scanner(process.getInputStream()).useDelimiter("\\A");
                String output = scanner.hasNext() ? scanner.next() : "";
                
                // Read any errors
                scanner = new java.util.Scanner(process.getErrorStream()).useDelimiter("\\A");
                String error = scanner.hasNext() ? scanner.next() : "";
                
                process.waitFor();
                
                if (!error.isEmpty()) {
                    output = "Error:\n" + error + "\nOutput:\n" + output;
                }
                
                return output;
            } catch (IOException | InterruptedException e) {
                return "Error running file: " + e.getMessage();
            }
        });
    }
} 