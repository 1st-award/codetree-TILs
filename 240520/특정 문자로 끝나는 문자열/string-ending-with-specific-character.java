import java.util.*;

public class Main {
    private final static int SIZE = 10;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[SIZE];
        char ch;

        for (int i = 0; i < SIZE; ++i) {
            arr[i] = sc.next();
        }
        ch = sc.next().charAt(0);

        boolean isNotFind = true;
        for (int i = 0 ; i < SIZE; ++i) {
            if (arr[i].charAt(arr[i].length() - 1) == ch) {
                isNotFind = false;
                System.out.println(arr[i]);
            }
        }
    }
}