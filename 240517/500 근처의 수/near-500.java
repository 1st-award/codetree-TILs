import java.util.*;

public class Main {
    private final static int INT_MAX = Integer.MAX_VALUE;
    private final static int INT_MIN = Integer.MIN_VALUE;
    private final static int SIZE = 10;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[SIZE];

        for (int i = 0; i < SIZE; ++i) {
            arr[i] = sc.nextInt();
        }

        int min500 = INT_MAX;
        int min500Idx = 0;
        int max500 = INT_MAX;
        int max500Idx = 0;
        for (int i = 0; i < SIZE; ++i) {
            if (arr[i] < 500) {
                int abs = 500 - arr[i];
                if (abs < min500) {
                    min500 = abs;
                    min500Idx = i;
                }
            }
            else {
                int abs = arr[i] - 500;
                if (abs < max500)  {
                    max500 = abs;
                    max500Idx = i;
                }
            }
        }

        System.out.println(arr[min500Idx] + " " + arr[max500Idx]);
    }
}