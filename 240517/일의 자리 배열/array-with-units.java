import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int size = 10;
        int[] arr = new int[size];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();

        for (int i = 2; i < size; ++i) {
            arr[i] = arr[i - 2] + arr[i - 1];
            arr[i] %= 10;
        }

        for (int i = 0; i < size; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}