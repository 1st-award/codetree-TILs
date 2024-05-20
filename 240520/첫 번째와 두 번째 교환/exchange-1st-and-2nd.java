import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] strArr = str.toCharArray();
        char firstChar = strArr[0];
        char secondChar =strArr[1];

        for (int i = 0; i < strArr.length; ++i) {
            if (strArr[i] == firstChar) {
                strArr[i] = secondChar;
            }
            else if (strArr[i] == secondChar) {
                strArr[i] = firstChar;
            }
        }
        String editString = String.valueOf(strArr);

        System.out.println(editString);
    }
}