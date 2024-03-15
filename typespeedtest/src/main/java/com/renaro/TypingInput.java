package com.renaro;

import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class TypingInput {
    private TypingTest typingTest;
    private TextField textField;

    public TypingInput(TypingTest typingTest){
        this.typingTest = typingTest;
        textField = new TextField();
        textField.setOnMouseClicked(event -> typingTest.startTest());
        textField.setOnAction(event -> {
            typingTest.endTest(textField.getText());
        });
    }

    public VBox getnode(){
        VBox vBox = new VBox();
        vBox.getChildren().add(textField);
        return vBox;
    }
}
