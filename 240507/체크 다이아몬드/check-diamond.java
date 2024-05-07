import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i > 0; --i) {
            for (int k = 1; k < i; ++k) {
                System.out.print(" ");
            }

            for (int m = 0; m <= n - i; ++m) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n - 1; i > 0; --i) {
            for (int k = 0; k < n - i; ++k) {
                System.out.print(" ");
            }
            for (int m = 0; m < i; ++m) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}