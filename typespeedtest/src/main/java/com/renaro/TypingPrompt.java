package com.renaro;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class TypingPrompt {
    private TypingTest typingTest;
    private Label sentencLabel;

    public TypingPrompt(TypingTest typingTest){
        this.typingTest = typingTest;
        sentencLabel = new Label(typingTest.getCurrentSentence());
    }

    public VBox getNode(){
        VBox vBox = new VBox();
        vBox.getChildren().add(new Label("Type the following sentence: "));
        vBox.getChildren().add(sentencLabel);
        return vBox;
    }
}
