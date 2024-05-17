import java.util.*;

public class Main {
    private final static int SCORE_SIZE = 11;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] scoreCounter = new int[SCORE_SIZE];

        while (true) {
            int score = sc.nextInt();

            if (score == 0) {
                break;
            }

            scoreCounter[score / 10] += 1;
        }

        for (int i = SCORE_SIZE - 1; i > 0; --i) {
            System.out.println(i * 10 + " - " + scoreCounter[i]);
        }
    }
}