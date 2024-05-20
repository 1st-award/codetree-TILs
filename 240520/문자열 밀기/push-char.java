import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str =  sc.next();
        int strLength = str.length();

        String editStr = str.substring(1) + str.substring(0, 1);
        
        System.out.println(editStr);
    }
}