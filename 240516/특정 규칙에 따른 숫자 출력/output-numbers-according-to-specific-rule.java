import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;

        for (int i = n; i > 0; --i) {
            for (int j = n; j > 0; --j) {
                if (i >= j) {
                    System.out.print(cnt + " ");
                    cnt += 1;
                    if (cnt == 10) {
                        cnt = 1;
                    }
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}