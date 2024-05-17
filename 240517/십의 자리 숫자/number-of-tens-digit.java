import java.util.*;

public class Main {
    private final static int POSITION_10_SIZE = 10;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] position10Counter = new int[POSITION_10_SIZE];

        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            position10Counter[n / 10] += 1;
        }

        for (int i = 1; i < POSITION_10_SIZE; ++i) { 
            System.out.println(i + " - " + position10Counter[i]);
        }
    }
}