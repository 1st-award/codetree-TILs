import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        String subStr1 = str1.substring(0, 2);
        String subStr2 = str2.substring(2);
        String mergeStr = subStr1 + subStr2;
        
        System.out.println(mergeStr);
    }
}