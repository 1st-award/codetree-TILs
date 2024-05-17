import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arrSize = 2;
        int loopSize = 10;
        int[] arr = new int[arrSize];
        int fiveBaesooCnt = 0;

        for (int i = 1; i <= loopSize; ++i) {
            System.out.print(n * i + " ");

            if ((n * i) % 5 == 0) {
                fiveBaesooCnt += 1;
            }

            if (fiveBaesooCnt == 2) {
                break;
            }
        }
    }
}