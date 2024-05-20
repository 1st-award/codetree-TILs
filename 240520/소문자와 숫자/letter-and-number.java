import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for (int i = 0; i < str.length(); ++i) {
            char chr = str.charAt(i);

            if (chr >= 'a' && chr <= 'z') {
                System.out.print(chr);
            }
            else if (chr >= 'A' && chr <= 'Z') {
                System.out.print((char)(chr - 'A' + 'a'));
            }
            else if (chr >= '0' && chr <= '9') {
                System.out.print(chr);
            }
        }
    }
}