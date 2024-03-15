package com.renaro;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class TypingResult {
    private TypingTest typingTest;
    private Label resultLabel;

    public TypingResult(TypingTest typingTest){
        this.typingTest = typingTest;
        resultLabel = new Label();
    }

    public VBox getNode(){
        VBox vBox = new VBox();
        vBox.getChildren().add(resultLabel);
        return vBox;
    }
}
