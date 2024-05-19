import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        int totalCount = 0;
        int aCount = 0;

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.next();
        }

        for (int i = 0; i < n; ++i) {
            totalCount += arr[i].length();
            if (arr[i].charAt(0) == 'a') {
                aCount += 1;
            }
        }

        System.out.println(totalCount + " " + aCount);
    }
}