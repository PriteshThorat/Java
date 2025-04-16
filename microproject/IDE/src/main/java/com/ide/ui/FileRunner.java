package com.ide.ui;

import javafx.scene.control.TextArea;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class FileRunner {
    public static CompletableFuture<String> runFile(File file, TextArea outputArea) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                ProcessBuilder processBuilder = new ProcessBuilder();
                String extension = getFileExtension(file.getName());
                
                switch (extension.toLowerCase()) {
                    case "java":
                        // Compile and run Java file
                        processBuilder.command("javac", file.getAbsolutePath());
                        Process compileProcess = processBuilder.start();
                        compileProcess.waitFor();
                        
                        if (compileProcess.exitValue() == 0) {
                            String className = file.getName().replace(".java", "");
                            processBuilder.command("java", "-cp", file.getParent(), className);
                            Process runProcess = processBuilder.start();
                            return new String(runProcess.getInputStream().readAllBytes());
                        } else {
                            return "Compilation failed:\n" + new String(compileProcess.getErrorStream().readAllBytes());
                        }
                        
                    case "py":
                        // Run Python file
                        processBuilder.command("python", file.getAbsolutePath());
                        Process process = processBuilder.start();
                        String output = new String(process.getInputStream().readAllBytes());
                        String error = new String(process.getErrorStream().readAllBytes());
                        process.waitFor();
                        if (process.exitValue() != 0) {
                            return "Error:\n" + error;
                        }
                        return output;
                        
                    case "js":
                        // Run JavaScript file with Node.js
                        processBuilder.command("node", file.getAbsolutePath());
                        Process jsProcess = processBuilder.start();
                        String jsOutput = new String(jsProcess.getInputStream().readAllBytes());
                        String jsError = new String(jsProcess.getErrorStream().readAllBytes());
                        jsProcess.waitFor();
                        if (jsProcess.exitValue() != 0) {
                            return "Error:\n" + jsError;
                        }
                        return jsOutput;
                        
                    case "html":
                        // Open HTML file in default browser
                        String htmlPath = file.getAbsolutePath();
                        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
                            processBuilder.command("cmd", "/c", "start", htmlPath);
                        } else if (System.getProperty("os.name").toLowerCase().contains("mac")) {
                            processBuilder.command("open", htmlPath);
                        } else {
                            processBuilder.command("xdg-open", htmlPath);
                        }
                        processBuilder.start();
                        return "HTML file opened in browser";
                        
                    case "css":
                        // CSS files can't be run directly
                        return "CSS files cannot be executed directly. They are used for styling web pages.";
                        
                    case "php":
                        // Run PHP file
                        processBuilder.command("php", file.getAbsolutePath());
                        Process phpProcess = processBuilder.start();
                        String phpOutput = new String(phpProcess.getInputStream().readAllBytes());
                        String phpError = new String(phpProcess.getErrorStream().readAllBytes());
                        phpProcess.waitFor();
                        if (phpProcess.exitValue() != 0) {
                            return "Error:\n" + phpError;
                        }
                        return phpOutput;
                        
                    case "rb":
                        // Run Ruby file
                        processBuilder.command("ruby", file.getAbsolutePath());
                        Process rubyProcess = processBuilder.start();
                        String rubyOutput = new String(rubyProcess.getInputStream().readAllBytes());
                        String rubyError = new String(rubyProcess.getErrorStream().readAllBytes());
                        rubyProcess.waitFor();
                        if (rubyProcess.exitValue() != 0) {
                            return "Error:\n" + rubyError;
                        }
                        return rubyOutput;
                        
                    case "go":
                        // Run Go file
                        processBuilder.command("go", "run", file.getAbsolutePath());
                        Process goProcess = processBuilder.start();
                        String goOutput = new String(goProcess.getInputStream().readAllBytes());
                        String goError = new String(goProcess.getErrorStream().readAllBytes());
                        goProcess.waitFor();
                        if (goProcess.exitValue() != 0) {
                            return "Error:\n" + goError;
                        }
                        return goOutput;
                        
                    case "rs":
                        // Compile and run Rust file
                        processBuilder.command("rustc", file.getAbsolutePath());
                        Process rustCompileProcess = processBuilder.start();
                        rustCompileProcess.waitFor();
                        
                        if (rustCompileProcess.exitValue() == 0) {
                            String executableName = file.getName().replace(".rs", "");
                            if (System.getProperty("os.name").toLowerCase().contains("windows")) {
                                executableName += ".exe";
                            }
                            processBuilder.command("./" + executableName);
                            Process rustRunProcess = processBuilder.start();
                            return new String(rustRunProcess.getInputStream().readAllBytes());
                        } else {
                            return "Compilation failed:\n" + new String(rustCompileProcess.getErrorStream().readAllBytes());
                        }
                        
                    case "c":
                    case "cpp":
                        // Check if compiler is installed
                        String compiler = extension.equals("c") ? "gcc" : "g++";
                        try {
                            Process checkProcess = new ProcessBuilder(compiler, "--version").start();
                            checkProcess.waitFor();
                            if (checkProcess.exitValue() != 0) {
                                return "Error: " + compiler + " compiler is not installed. Please install it to compile " + extension.toUpperCase() + " files.\n" +
                                       "For Windows: Install MinGW or MSYS2\n" +
                                       "For Linux: Use package manager (e.g., sudo apt-get install gcc/g++)\n" +
                                       "For macOS: Install Xcode Command Line Tools";
                            }
                        } catch (IOException | InterruptedException e) {
                            return "Error: " + compiler + " compiler is not installed. Please install it to compile " + extension.toUpperCase() + " files.\n" +
                                   "For Windows: Install MinGW or MSYS2\n" +
                                   "For Linux: Use package manager (e.g., sudo apt-get install gcc/g++)\n" +
                                   "For macOS: Install Xcode Command Line Tools";
                        }
                        
                        // Compile and run C/C++ file
                        processBuilder.command(compiler, file.getAbsolutePath(), "-o", file.getName().replace("." + extension, ""));
                        Process cCompileProcess = processBuilder.start();
                        cCompileProcess.waitFor();
                        
                        if (cCompileProcess.exitValue() == 0) {
                            String executableName = file.getName().replace("." + extension, "");
                            if (System.getProperty("os.name").toLowerCase().contains("windows")) {
                                executableName += ".exe";
                            }
                            processBuilder.command("./" + executableName);
                            Process cRunProcess = processBuilder.start();
                            return new String(cRunProcess.getInputStream().readAllBytes());
                        } else {
                            return "Compilation failed:\n" + new String(cCompileProcess.getErrorStream().readAllBytes());
                        }
                        
                    default:
                        return "Unsupported file type: " + extension + "\nSupported languages: Java, Python, JavaScript, HTML, CSS, PHP, Ruby, Go, Rust, C, C++";
                }
            } catch (IOException | InterruptedException e) {
                return "Error running file: " + e.getMessage();
            }
        });
    }
    
    private static String getFileExtension(String fileName) {
        int lastDotIndex = fileName.lastIndexOf('.');
        if (lastDotIndex > 0) {
            return fileName.substring(lastDotIndex + 1);
        }
        return "";
    }
} 