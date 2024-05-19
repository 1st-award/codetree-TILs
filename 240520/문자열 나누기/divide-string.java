import java.util.*;

public class Main {
    private final static int SIZE = 5;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.next();
        }

        String mergeString = "";
        for (int i = 0; i < n; ++i) {
            mergeString += arr[i];
        }

        int idx = 0;
        while (idx < mergeString.length()) {
            for (int i = idx; i < idx + SIZE && i < mergeString.length(); ++i) {
                System.out.print(mergeString.charAt(i));
            }
            idx +=  SIZE;
            System.out.println();
        }
    }
}