import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int cnt3 = 0;
        int cnt5 = 0;

        for (int i = 0; i < 10; ++i) {
            int n = sc.nextInt();
            if (n %  3 == 0) {
                cnt3 += 1;
            }
            if (n % 5 == 0) {
                cnt5 += 1;
            }
        }

        System.out.println(cnt3 + " " + cnt5);
    }
}