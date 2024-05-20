import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        while(A.contains(B)) {
            int findIndex = A.indexOf(B);
            A = A.substring(0, findIndex) + A.substring(findIndex + B.length());
        }

        System.out.println(A);
    }
}