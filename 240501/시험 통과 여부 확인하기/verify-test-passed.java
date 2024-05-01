import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 79) {
            System.out.println("pass");
        } else {
            int score = 80 - n;
            System.out.printf("%d more score\n", score);
        }
    }
}