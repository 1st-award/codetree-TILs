import java.util.*;

public class Main {
    private final static int INT_MIN = Integer.MIN_VALUE;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] cnt = new int[1001];


        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
            cnt[arr[i]] += 1;
        }

        int max = -1;
        for (int i = 1; i < 1001; ++i) {
            if (cnt[i] == 1) {
                max = i;
            }
        }

        System.out.println(max);
    }
}