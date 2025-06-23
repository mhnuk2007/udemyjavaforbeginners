package QuizConsoleApp;

import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String[] selection = new String[5];

    public QuestionService() {
        questions[0] = new Question(
                1,
                "What is the size in bytes of the 'int' data type in Java?",
                "2 bytes", "4 bytes", "8 bytes", "1 byte",
                "4 bytes"
        );

        questions[1] = new Question(
                2,
                "Which data type in Java uses 8 bytes of memory?",
                "byte", "short", "int", "long",
                "long"
        );

        questions[2] = new Question(
                3,
                "What is the size of a 'char' in Java?",
                "1 byte", "2 bytes", "4 bytes", "8 bytes",
                "2 bytes"
        );

        questions[3] = new Question(
                4,
                "Which of the following Java data types has the smallest memory size?",
                "int", "short", "byte", "float",
                "byte"
        );

        questions[4] = new Question(
                5,
                "What is the size of the 'double' data type in Java?",
                "2 bytes", "4 bytes", "8 bytes", "16 bytes",
                "8 bytes"
        );
    }


    public void playQuiz() {
        int i = 0;
        for (Question question : questions) {
            System.out.println("Question No. " + question.getId());
            System.out.println(question.getQuestion());
            System.out.println(question.getOpt1());
            System.out.println(question.getOpt2());
            System.out.println(question.getOpt3());
            System.out.println(question.getOpt4());

            System.out.print("Your answer: ");
            Scanner input = new Scanner(System.in);
            selection[i] = input.nextLine();
            i++;
        }

    }


    public void displayScore() {
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            Question que = questions[i];
            String actualAnswer = que.getAnswer();
            String userAnswer = selection[i];

            if (actualAnswer.equals(userAnswer)) {
                score++;
            }
        }
        System.out.println("Your score is: " + score);

    }
}


