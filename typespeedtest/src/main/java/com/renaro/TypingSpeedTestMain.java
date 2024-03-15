package com.renaro;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TypingSpeedTestMain extends Application{

    @Override
    public void start(Stage primaryStage){
        TypingTest typingTest = new TypingTest();

        VBox root = new VBox(10);
        root.setPadding(new javafx.geometry.Insets(20));

        TypingPrompt typingPrompt = new TypingPrompt(typingTest);
        TypingInput typingInput = new TypingInput(typingTest);
        TypingResult typingResult = new TypingResult(typingTest);

        root.getChildren().addAll(typingPrompt.getNode(), typingInput.getnode(), typingResult.getNode());

        Scene scene = new Scene(root, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Typing Speed Test");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
