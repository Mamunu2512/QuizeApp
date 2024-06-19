package Quize;

import java.util.Arrays;

public class QuizApp {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        // Add some questions
        quiz.addQuestion(new MultipleChoiceQuestion(
                "What is the capital of France?",
                Arrays.asList("Berlin", "Madrid", "Paris", "Rome"),
                "C"
        ));

        quiz.addQuestion(new TrueFalseQuestion(
                "The Earth is flat.",
                false
        ));

        quiz.addQuestion(new MultipleChoiceQuestion(
                "Which planet is known as the Red Planet?",
                Arrays.asList("Earth", "Mars", "Jupiter", "Saturn"),
                "B"
        ));
        quiz.addQuestion(new MultipleChoiceQuestion(
                "chiropterephily refers to pollination by ?",
                Arrays.asList("bats", "instects", "snail", "birds"),
                "A"
        ));

        quiz.start();
    }
}
