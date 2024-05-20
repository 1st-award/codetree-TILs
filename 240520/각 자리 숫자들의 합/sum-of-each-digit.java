import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        String str = Integer.toString(n);
        for (int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);
            int value = Integer.parseInt(String.valueOf(ch));
            sum += value;
        }

        System.out.println(sum);
    }
}