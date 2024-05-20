import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] strArr = str.toCharArray();
        strArr[1] = 'a';
        strArr[strArr.length - 2] = 'a';

        String editStr = String.valueOf(strArr);
        System.out.println(editStr);
    }
}