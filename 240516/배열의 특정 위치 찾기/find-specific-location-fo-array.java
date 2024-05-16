import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < 10; ++i) {
            arr[i] = sc.nextInt();
        }

        int evenSum = 0;
        int oddSum = 0;
        for (int i = 1; i <= 10; ++i) {
            if (i % 3 == 0) {
                oddSum += arr[i - 1];
            }

            if (i % 2 == 0) {
                evenSum += arr[i - 1];
            }
        }
        System.out.printf("%d %.1f\n", evenSum, (double)oddSum / 3);
    }
}