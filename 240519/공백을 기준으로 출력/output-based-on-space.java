import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = str1 + str2;

        for (int i = 0; i < str3.length(); ++i) {
            if (str3.charAt(i) != ' ')
                System.out.print(str3.charAt(i));
        }
    }
}