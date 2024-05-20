import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int count = 0;
        int sum = a + b;
        String result = Integer.toString(sum);
        for (int i = 0; i < result.length(); ++i) {
            char ch = result.charAt(i);
            if (ch == '1') {
                count += 1;
            }
        }

        System.out.println(count);
    }
}