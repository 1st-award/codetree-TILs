import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int strLength = str.length();
        int q = sc.nextInt();

        for (int i = 0 ; i < q; ++i) {
            int type = sc.nextInt();

            if (type == 1) {
                str = str.substring(1, strLength) + str.substring(0, 1);
            }
            else if (type == 2) {
                str = str.substring(strLength - 1) + str.substring(0, strLength - 1);
            }
            else {
                char[] strArr = str.toCharArray();
                for (int j = 0; j < strLength / 2; ++j) {
                    char temp = strArr[j];
                    strArr[j] = strArr[strLength - j - 1];
                    strArr[strLength - j - 1] = temp;
                }
                str = String.valueOf(strArr);
            }

            System.out.println(str);
        }
    }
}