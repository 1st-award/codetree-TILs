import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.next();

            if (str.equals("END")) {
                break;
            }

            char[] strArr = str.toCharArray();
            for (int i = 0; i < strArr.length / 2; ++i) {
                char temp = strArr[i];
                strArr[i] = strArr[strArr.length - i - 1];
                strArr[strArr.length - i - 1] = temp;
            }
            String reverseString = String.valueOf(strArr);

            System.out.println(reverseString);
        }
    }
}