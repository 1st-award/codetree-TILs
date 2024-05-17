import java.util.*;

public class Main {
    private final static int INT_MAX = Integer.MAX_VALUE;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        int min = INT_MAX;
        for (int i = n - 1; i > 0; --i) {

            int distance = arr[i] - arr[i - 1];
            if (distance < min) {
                min = distance;
            }
        }

        System.out.println(min);
    }
}