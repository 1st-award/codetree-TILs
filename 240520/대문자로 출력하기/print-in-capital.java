import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] strArr = str.toCharArray();

        for (int i = 0; i < strArr.length; ++i) {
            if (strArr[i] >= 'a' && strArr[i] <= 'z') {
                char uppderChar = (char)(strArr[i] - 'a' + 'A');
                System.out.print(uppderChar);
            }
            else if (strArr[i] >= 'A' && strArr[i] <= 'Z') {
                System.out.print(strArr[i]);
            }
        }
    }
}