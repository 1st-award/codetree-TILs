import java.util.*;

public class Main {
    private final static int INT_MIN = Integer.MIN_VALUE;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        int max1 = INT_MIN;
        int max2 = INT_MIN;
        for (int i = 0; i < n; ++i) {
            if (arr[i] > max1) {
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }

        System.out.println(max1 + " " + max2);
    }
}