import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int cnt = 0;

        for(int i = 4; i <= year; ++i) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }
}