package com.example.demo;

public class TriviaQuestion {
    private final String question;
    private final String[] options;
    private final int correctOptionIndex;
    private final String mediaURL; // URL to image or video

    // Constructor
    public TriviaQuestion(String question, String[] options, int correctOptionIndex, String mediaURL) {
        this.question = question;
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
        this.mediaURL = mediaURL;
    }

    // Getters
    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public String getMediaURL() {
        return mediaURL;
    }

    public boolean isCorrectOption(int index) {
        return index == correctOptionIndex;
    }
}


