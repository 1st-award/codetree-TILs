import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String A = sc.next();

        int sameCount = 0;
        for (int i = 0; i < n; ++i) {
            String str = sc.next();;
            if (A.equals(str)) {
                sameCount += 1;
            }
        }

        System.out.println(sameCount);
    }
}