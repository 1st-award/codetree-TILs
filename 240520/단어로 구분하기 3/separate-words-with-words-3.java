import java.util.*;

public class Main {
    private final static int SIZE = 10;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[SIZE];

        for (int i = 0; i < SIZE; ++i) {
            arr[i] = sc.next();
        }

        for (int i = SIZE - 1; i >= 0; --i) {
            System.out.println(arr[i]);
        }
    }
}