import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] counter = new int[b];

        while (a > 1) {
            counter[a % b] += 1;
            a /= b;
        }

        int sum = 0;
        for (int i = 0; i < b; ++i) {
            sum += counter[i] * counter[i];
        }
        System.out.println(sum);
    }
}