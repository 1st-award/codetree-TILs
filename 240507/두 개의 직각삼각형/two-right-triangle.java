import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n * 2; ++i) {
            System.out.print("*");
        }
        System.out.println();
        
        for (int i = 1; i < n; ++i) {
            for (int x = n; x > i; --x) {
                System.out.print("*");
            }

            for (int y = 0; y < i * 2; ++y) {
                System.out.print(" ");
            }

            for (int x = n; x > i; --x) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}