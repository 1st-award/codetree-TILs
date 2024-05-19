import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        char ch;

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.next();
        }
        ch = sc.next().charAt(0);


        int findChar = 0;
        int sumCharLength = 0;
        for (int i = 0; i < n; ++i) {
            if (arr[i].charAt(0) == ch) {
                findChar += 1;
                sumCharLength += arr[i].length();
            }
        }

        System.out.printf("%d %.2f\n", findChar, (double)sumCharLength / findChar);
    }
}