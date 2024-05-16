import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; ++i) {
            int tmpCnt = 0;

            for (int j = 2; j < i; ++j) {
                if (i % j == 0) {
                    break;
                }
            }

            if (tmpCnt == 0) {
                System.out.print(i + " ");
            }
        }
    }
}