import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int passCnt = 0;

        for (int i = 0; i < n; ++i) {
            int sum = 0;

            for (int j = 0; j < 4; ++j) {
                sum += sc.nextInt();
            }

            if (sum / 4 >= 60) {
                System.out.println("pass");
                passCnt += 1;
            }
            else {
                System.out.println("fail");
            }
        }
        System.out.println(passCnt);
    }
}