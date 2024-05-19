import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int end = sc.nextInt();

        for (int i = str.length() - 1; i >= str.length() - end; --i) {
            System.out.print(str.charAt(i));
        }
    }
}