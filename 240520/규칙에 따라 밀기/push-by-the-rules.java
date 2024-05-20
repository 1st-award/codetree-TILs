import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int ALength = A.length();
        String command = sc.next();
        char[] commandArr = command.toCharArray();

        for (int i = 0; i < commandArr.length; ++i) {
            if (commandArr[i] == 'L') {
                A = A.substring(1) + A.substring(0, 1);
            }
            else {
                A = A.substring(ALength - 1) + A.substring(0, ALength - 1);
            }
        }

        System.out.println(A);
    }
}