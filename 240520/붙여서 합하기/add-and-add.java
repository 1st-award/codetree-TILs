import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        int AB = Integer.parseInt(A + B);
        int BA = Integer.parseInt(B + A);

        System.out.println(AB + BA);
    }
}