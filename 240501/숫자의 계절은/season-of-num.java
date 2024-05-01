import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        if (3 <= month && month <= 5) {
            System.out.println("Spring");
        } else if (6 <= month && month <= 8) {
            System.out.println("Summer");
        } else if (9 <= month && month <= 11) {
            System.out.println("Fall");
        } else {
            System.out.println("Winter");
        }
    }
}