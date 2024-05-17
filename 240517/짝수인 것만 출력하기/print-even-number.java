import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] evenArr = new int[size];
        int evenIdx = 0;

        for (int i = 0; i < size; ++i) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                evenArr[evenIdx] = arr[i];
                evenIdx += 1;
            }
        }

        for (int i = 0; i < size; ++i) {
            if (evenArr[i] == 0) {
                break;
            }
            System.out.print(evenArr[i] + " ");
        }
    }
}