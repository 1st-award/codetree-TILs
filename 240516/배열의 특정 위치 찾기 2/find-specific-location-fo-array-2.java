import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < 10; ++i) {
            arr[i] = sc.nextInt();
        }

        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i < 10; ++i) {
            if (i % 2 == 0) {
                oddSum += arr[i];
            }
            else {
                evenSum += arr[i];
            }
        }
        System.out.println(oddSum > evenSum ? oddSum - evenSum : evenSum - oddSum);
    }
}