import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char alpha = sc.next().charAt(0);

        char nextAlpha = (char)((int)((alpha - 'a' + 1) % ('z' - 'a' + 1) + 'a'));
        System.out.println(nextAlpha);
    }
}