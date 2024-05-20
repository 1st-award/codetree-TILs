import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        
        int counter = 0;
        for (int i = 1; i < A.length(); ++i) {

            String subStr = A.substring(i - 1, i + 1);
            if (subStr.equals(B)) {
                counter += 1;
            }
        }

        System.out.println(counter);
    }
}