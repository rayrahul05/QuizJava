import java.io.*;
import java.util.*;

class Question {
    String question;
    String[] options;
    int correctAnswer;

    Question(String question, String[] options, int correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
}

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Question> questions = new ArrayList<>();

        loadQuestions(questions);

        if (questions.isEmpty()) {
            System.out.println("No questions found!");
            return;
        }

        Collections.shuffle(questions);

        int score = 0;

        System.out.println("===== Simple Quiz Application =====");

        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);

            System.out.println("\nQ" + (i + 1) + ". " + q.question);

            for (int j = 0; j < q.options.length; j++) {
                System.out.println((j + 1) + ". " + q.options[j]);
            }

            System.out.print("Enter your answer: ");
            int answer = sc.nextInt();

            if (answer == q.correctAnswer) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
                System.out.println("Correct answer: " + q.correctAnswer);
            }
        }

        System.out.println("\n===== Quiz Finished =====");
        System.out.println("Your Score: " + score + "/" + questions.size());

        saveScore(score, questions.size());

        sc.close();
    }

    static void loadQuestions(ArrayList<Question> questions) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("questions.txt"));

            String line;

            while ((line = br.readLine()) != null) {
                String question = line;
                String[] options = new String[4];

                for (int i = 0; i < 4; i++) {
                    options[i] = br.readLine();
                }

                int correctAnswer = Integer.parseInt(br.readLine());

                questions.add(new Question(question, options, correctAnswer));
            }

            br.close();

        } catch (Exception e) {
            System.out.println("Error reading questions file.");
        }
    }

    static void saveScore(int score, int total) {
        try {
            FileWriter fw = new FileWriter("score.txt", true);

            fw.write("Score: " + score + "/" + total + "\n");

            fw.close();

            System.out.println("Score saved successfully.");

        } catch (Exception e) {
            System.out.println("Error saving score.");
        }
    }
}