import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int eeCnt = 0;
        int ebCnt = 0;
        for (int i = 1; i < str.length(); ++i) {

            String subStr = str.substring(i - 1, i + 1);
            if (subStr.equals("ee")) {
                eeCnt += 1;
            }

            if (subStr.equals("eb")) {
                ebCnt += 1;
            }
        }

        System.out.println(eeCnt + " " + ebCnt);
    }
}