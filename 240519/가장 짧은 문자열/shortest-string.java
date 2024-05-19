import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();
        String shortestString = "";
        String longestString = "";

        if (str1.length() > str2.length() && str1.length() > str3.length()) {
            longestString = str1;
        }
        else if (str2.length() > str1.length() && str2.length() > str3.length()) {
            longestString = str2;
        }
        else {
            longestString = str3;
        }

        if (str1.length() < str2.length() && str1.length() < str3.length()) {
            shortestString = str1;
        }
        else if (str2.length() < str1.length() && str2.length() < str3.length()) {
            shortestString = str2;
        }
        else {
            shortestString = str3;
        }

        System.out.println(longestString.length() - shortestString.length());
    }
}