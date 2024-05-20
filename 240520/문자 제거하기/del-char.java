import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        while (str.length() != 1) {
            int removeIdx = sc.nextInt();

            if (removeIdx >= str.length()) {
                str = str.substring(0, str.length() - 1);
            }
            else {
                str = str.substring(0, removeIdx) + str.substring(removeIdx + 1, str.length());
            }

            System.out.println(str);
        }
    }
}