import java.util.*;

public class Main {
    private final static int MAX_SIZE = 100;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[MAX_SIZE];

        for (int i = 0; i < MAX_SIZE; ++i) {
            arr[i] = sc.nextInt();

            if (arr[i] == 0) {
                break;
            }
            else if (arr[i] % 2 == 0) {
                arr[i] /= 2;
            }
            else {
                arr[i] += 3;
            }
        }

        for (int i = 0; i < MAX_SIZE; ++i) {
            if (arr[i] == 0) {
                break;
            }
            System.out.print(arr[i] + " ");
        }
    }
}