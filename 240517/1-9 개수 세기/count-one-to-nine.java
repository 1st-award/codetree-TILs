import java.util.*;

public class Main {
    private final static int SIZE = 10;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] counter = new int[SIZE];
        int n = sc.nextInt();

        for (int i = 0; i < n; ++i) {
            counter[sc.nextInt()] += 1;
        }

        for (int i = 1; i < SIZE; ++i) {
            System.out.println(counter[i]);
        }
    }
}