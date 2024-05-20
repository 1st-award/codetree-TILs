import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int firstEIndex = str.indexOf("e");
        String editStr = str.substring(0, firstEIndex) + str.substring(firstEIndex + 1);

        System.out.println(editStr);
    }
}