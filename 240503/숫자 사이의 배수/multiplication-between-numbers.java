import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        int cnt = 0;

        for(int i = a; i <= b; ++i) {
            if (i % 5 == 0 || i % 7 == 0) {
                sum += i;
                cnt += 1;
            }
        }
        System.out.printf("%d %.1f\n", sum, (double)sum / cnt);
    }
}