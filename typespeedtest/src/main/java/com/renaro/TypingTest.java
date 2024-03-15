package com.renaro;

import java.util.Random;

public class TypingTest {

    private String[] sentence = {
        "The quick brown fox jumps over the lazy dog.",
        "Pack my box with five dozen liquor jugs.",
        "How razorback-jumping frogs can level six piqued gymnasts!",
        "Sphinx of black quartz, judge my vow.",
        "The five boxing wizards jump quickly."
    };

    private String currentSentence;
    private long startTime;

    public TypingTest(){
        generateRandomSentence();
    }

    public String getCurrentSentence(){
        return currentSentence;
    }

    public void startTest(){
        startTime = System.currentTimeMillis();
    }

    public void endTest(String typedText){
        long endTime = System.currentTimeMillis();
        double accuracy = calculateAccuracy(currentSentence, typedText);
        long elapseTime = endTime - startTime;
        double typingSpeed = calculateTypingSpeed(currentSentence, elapseTime);
        System.out.println(String.format("Accuracy: %.2f%% / Typing speed: %.2f characters per minute", accuracy * 100, typingSpeed));
    }

    private void generateRandomSentence(){
        Random random = new Random();
        int index = random.nextInt(sentence.length);
        currentSentence = sentence[index];
    }

    private double calculateAccuracy(String original, String typed){
        int correctChars = 0;
        for(int i = 0; i < Math.min(original.length(), typed.length()); i++){
            if(original.charAt(i) == typed.charAt(i)){
                correctChars++;
            }
        }
        return (double) correctChars / original.length();
    }

    private double calculateTypingSpeed(String sentence, long elapseTime){
        int charactersTyped = sentence.length();
        double minutes = elapseTime / 60000.0;
        return charactersTyped / minutes;
    }
    
}