import java.util.*;

public class Main {
    private final static int SIZE = 4;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[SIZE][SIZE];

        for (int i = 0; i < SIZE; ++i) {
            for (int j = 0; j < SIZE; ++j) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        for (int i = 0; i < SIZE; ++i) {
            for (int j = 0 ; j <= i; ++j) {
                sum += arr[i][j];
            }
        }

        System.out.println(sum);
    }
}