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

        int latestIdx = n - 1;
        while (latestIdx != -1) {

            int max = arr[0];
            int maxIdx = 0;
            for (int i = latestIdx; i >= 0; --i) {
                if (max < arr[i]) {
                    max = arr[i];
                }
                if (max == arr[i]) {
                    // System.out.println(max + " " + arr[i] + " " + i);
                    maxIdx = i;
                }
            }

            System.out.print(maxIdx + 1 + " ");

            latestIdx = maxIdx - 1;
        }
    }
}