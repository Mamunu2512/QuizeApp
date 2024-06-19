package Quize;

import java.util.List;

abstract class Question {
    protected String questionText;

    public Question(String questionText) {
        this.questionText = questionText;
    }

    public abstract boolean checkAnswer(String answer);
    public abstract void display();
}

class MultipleChoiceQuestion extends Question {
    private List<String> options;
    private String correctAnswer;

    public MultipleChoiceQuestion(String questionText, List<String> options, String correctAnswer) {
        super(questionText);
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    @Override
    public boolean checkAnswer(String answer) {
        return correctAnswer.equalsIgnoreCase(answer.trim());
    }

    @Override
    public void display() {
        System.out.println(questionText);
        for (int i = 0; i < options.size(); i++) {
            System.out.println((char)('A' + i) + ": " + options.get(i));
        }
    }
}

class TrueFalseQuestion extends Question {
    private boolean correctAnswer;

    public TrueFalseQuestion(String questionText, boolean correctAnswer) {
        super(questionText);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public boolean checkAnswer(String answer) {
        return (correctAnswer && answer.equalsIgnoreCase("true")) ||
               (!correctAnswer && answer.equalsIgnoreCase("false"));
    }

    @Override
    public void display() {
        System.out.println(questionText + " (true/false)");
    }
}
