import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 1;
        int cnt = 0;

        while(sum != n) {
            cnt += 1;
            sum *= 2;
        }
        System.out.println(cnt);
    }
}