import java.util.*;

public class Main {
    private final static int SIZE = 10;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[SIZE];

        for (int i = 0; i < SIZE; ++i) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for (int i = 1; i < SIZE; ++i) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}