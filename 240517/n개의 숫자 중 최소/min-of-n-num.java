import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        for (int i = 1; i < n; ++i) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        int minCnt = 0;
        for (int i = 0; i < n; ++i) {
            if (min == arr[i]) {
                minCnt += 1;
            }
        }

        System.out.println(min + " " + minCnt);
    }
}