import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        while (n / i > 1) {
            i += 1;
            n /= i;
        }
        System.out.println(i + 1);
    }
}