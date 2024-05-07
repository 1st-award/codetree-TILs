import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; ++i) {
            for (int k = 0; k < i; ++k) {
                System.out.print("  ");
            }

            for (int m = 0; m < (2 * n) - (2 * i) - 1; ++m) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < n - 1; ++i) {
            for (int k = 0; k < n - i - 2; ++k) {
                System.out.print("  ");
            }

            for (int m = 0; m < 3 + (2 * i); ++m) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}