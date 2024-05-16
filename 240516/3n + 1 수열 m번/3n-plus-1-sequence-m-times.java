import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; ++i) {
            int cnt = 0;
            int a = sc.nextInt();
            while(a != 1) {
                cnt += 1;
                if (a % 2 == 0) {
                    a /= 2;
                }
                else {
                    a = 3 * a + 1;
                }
            }
            System.out.println(cnt);
        }
    }
}