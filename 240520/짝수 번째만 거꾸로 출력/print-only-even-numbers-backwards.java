import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int start;
        
        if (str.length() % 2 == 0) {
            start = str.length() - 1;
        }
        else {
            start = str.length() - 2;
        }

        for (int i = start; i >= 0; i -= 2) {
            System.out.print(str.charAt(i));
        }
    }
}