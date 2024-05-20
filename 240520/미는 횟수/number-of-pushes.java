import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        int i;
        for (i = 0; i < A.length(); ++i) {
            if (A.equals(B)) {
                break;
            }
            A = A.substring(A.length() - 1) + A.substring(0, A.length() - 1);
        }

        if (i == A.length()) {
            System.out.println(-1);
        }
        else {
            System.out.println(i);
        }
    }
}