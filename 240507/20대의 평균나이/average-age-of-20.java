import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int cnt = 0;

        while (true) {
            int age = sc.nextInt();

            if (age / 10 == 2) {
                sum += age;
                cnt += 1;
            }
            else {
                break;
            }
        }

        System.out.printf("%.2f\n", (double)sum / cnt);
    }
}