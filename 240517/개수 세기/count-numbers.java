import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int counter = 0;

        for (int i = 0; i < n; ++i) {
            int num = sc.nextInt();
            if (m == num) {
                counter += 1;
            }
        }
        System.out.println(counter);
    }
}