import java.util.*;

public class Main {
    private final static int START = 2;
    private final static int END = 10;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i = START; i < END; ++i) {
            System.out.print(str.charAt(i));
        }
    }
}