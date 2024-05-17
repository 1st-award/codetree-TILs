import java.util.*;

public class Main {
    private final static int INT_MAX = Integer.MAX_VALUE;
    private final static int INT_MIN = Integer.MIN_VALUE;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int max = INT_MIN;
        int min = INT_MAX;

        while (true) {
            int n = sc.nextInt();

            if (n == 999 || n == -999) {
                break;
            }

            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }

        System.out.println(max + " " + min);
    }
}