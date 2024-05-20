import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int sum = 0;
        for (int i = 0; i < str.length(); ++i) {
            char chr = str.charAt(i);

            if (chr >= '0' && chr <= '9') {
                sum += chr - '0';
            }
        }

        System.out.println(sum);
    }
}