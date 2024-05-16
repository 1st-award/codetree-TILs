import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 2; i <= n; ++i) {
            boolean isPass = true;

            for (int j = 2; j < i; ++j) {
                if (i % j == 0) {
                    isPass = false;
                    break;
                }
            }

            if (isPass) {
                System.out.print(i + " ");
            }
        }
    }
}