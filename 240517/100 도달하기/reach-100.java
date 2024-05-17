import java.util.*;

public class Main {
    private final static int MAX_SIZE = 20;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int over100ValueIdx = -1;
        int[] arr = new int[MAX_SIZE];
        arr[0] = 1;
        arr[1] = sc.nextInt();

        for (int i = 2; i < MAX_SIZE; ++i) {
            arr[i] = arr[i - 2] + arr[i - 1];

            if (arr[i] >= 100) {
                over100ValueIdx = i;
                break;
            }
        }

        for (int i = 0; i <= over100ValueIdx; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}