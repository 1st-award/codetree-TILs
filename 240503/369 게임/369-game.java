import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; ++i) {
            String number = Integer.toString(i);
            if (i % 3 == 0 || number.contains("3") || number.contains("6") || number.contains("9")) {
                System.out.print("0 ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}