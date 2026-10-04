package version;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Question[] question = new Question[5];
        for (int i = 0; i < question.length; i++) {
            question[i] = new Question(
                    1,
                    "what is the name of first language in programming",
                    new String[] { "test1", "test2", "test3", "test4" },
                    "number1");
        }
        String[] collections = new String[5];
        Scanner scanner = new Scanner(System.in);
        
        Score score = new Score();
        for (int i = 0; i < question.length; i++) {
            System.out.println(question[i]);
            collections[i] = scanner.nextLine();
            if (collections[i].equals(question[i].getAnwser())) {
                score.sc++;

            }

        }
        System.out.println("the score for you is : " + score.sc);

    }
}
