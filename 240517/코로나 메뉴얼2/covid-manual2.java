import java.util.*;

public class Main {
    private final static int RANK_SIZE = 4;
    private final static int MAX_PEOPLE = 3;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] rankCounter = new int[RANK_SIZE];

        for (int i = 0; i < MAX_PEOPLE; ++i) {
            char cold = sc.next().charAt(0);
            int temperature = sc.nextInt();

            if (cold == 'Y' && temperature >= 37) {
                rankCounter[0] += 1;
            }
            else if (cold == 'N' && temperature >= 37) {
                rankCounter[1] += 1;
            }
            else if (cold == 'Y' && temperature < 37) {
                rankCounter[2] += 1;
            }
            else {
                rankCounter[3] += 1;
            }
        }

        for (int i = 0; i < RANK_SIZE; ++i) {
            System.out.print(rankCounter[i] + " ");
        }

        if (rankCounter[0] > 1) {
            System.out.print("E");
        }
    }
}