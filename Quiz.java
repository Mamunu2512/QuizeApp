package Quize;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Quiz {
    private List<Question> questions;

    public Quiz() {
        questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (Question question : questions) {
            question.display();
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();
            if (question.checkAnswer(answer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect.");
            }
        }

        System.out.println("You scored " + score + " out of " + questions.size());
    }
}
