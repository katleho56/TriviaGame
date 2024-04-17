package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class GameController {
    @FXML
    private Label questionLabel;

    @FXML
    private ImageView mediaImageView;

    @FXML
    private Button optionButton1;

    @FXML
    private Button optionButton2;

    @FXML
    private Button optionButton3;

    @FXML
    private Button optionButton4;

    private TriviaQuestion currentQuestion;
    private int score = 0;
    private int questionIndex = 0;

    private final TriviaQuestion[] triviaQuestions = {
            // Define your trivia questions here
        new TriviaQuestion("What is the Capital City of Lesotho?",
                new String[]{"Maputsoe", "Maseru", "Botha-Bothe", "Mafeteng"},
                1,
                "C:/Users/katle/Desktop/Assignment2KatlehoMabethoane901015173/demo/src/main/resources/images/Maseru.jpg"
                ),
            new TriviaQuestion("What is the Language of Lesotho?",
                    new String[]{"English", "French", "Afrikaans", "Sesotho"},
                    3,
                    "C:/Users/katle/Desktop/Assignment2KatlehoMabethoane901015173/demo/src/main/resources/images/lang.jpg"
            ),
            new TriviaQuestion("What is the Biggest Dam in Lesotho?",
                    new String[]{"Maletsunyane", "Mohale", "Katse", "Metolong"},
                    2,
                    "C:/Users/katle/Desktop/Assignment2KatlehoMabethoane901015173/demo/src/main/resources/images/Katse.jpg"
            ),
            new TriviaQuestion("What is the highest peak in Lesotho?",
                    new String[]{"Thabana Ntlenyana", "Mount Qiloane", "Thaba Bosiu", "Sani Pass"},
                    0,
                    "C:/Users/katle/Desktop/Assignment2KatlehoMabethoane901015173/demo/src/main/resources/images/mount.jpg"
            )
};



    public void initialize() {
        showNextQuestion();
    }

    private void showNextQuestion() {
        if (questionIndex < triviaQuestions.length) {
            currentQuestion = triviaQuestions[questionIndex];

            questionLabel.setText(currentQuestion.getQuestion());
            Image image = new Image(currentQuestion.getMediaURL());
            mediaImageView.setImage(image);

            String[] options = currentQuestion.getOptions();


            optionButton1.setText(options[0]);
            optionButton2.setText(options[1]);
            optionButton3.setText(options[2]);
            optionButton4.setText(options[3]);

            questionIndex++;
        } else {
            // Display final score and game completion message
            displayFinalScore();
        }
    }

    @FXML
    private void handleAnswerButtonAction(javafx.event.ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        int selectedOptionIndex = Integer.parseInt(clickedButton.getId().substring(11)) - 1;

        if (currentQuestion.isCorrectOption(selectedOptionIndex)) {
            score++;
        }
        showNextQuestion();
    }

    private void displayFinalScore(){
        questionLabel.setText("Game Over!");

            optionButton1.setVisible(false);
        optionButton2.setVisible(false);
        optionButton3.setVisible(false);
        optionButton4.setVisible(false);

    }

}
