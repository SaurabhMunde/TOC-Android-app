package com.example.toc;

public class Questions {

    public String mQuestions[] = {
            "The Finite Set of Symbols",
            "The language accepted by DFA is a ",
            "The language accepted by TM is a "
    };

    private String mChoices[][] = {
            {"Alphabet", "String", "Transition", "A and B"},
            {"Context Free Language", "Pushdown Automata Language", "Regular Language", "Formal Language"},
            {"Context Free Language", "Pushdown Automata Language", "Formal Language", "Recursively Enumerable Language"}
    };

    private String mCorrectAnswers[] = {"Alphabet", "Regular Language", "Formal Language"};

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a) {
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a) {
        String choice = mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a) {
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}