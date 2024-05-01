import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int middleScore = sc.nextInt();
        int finalScore = sc.nextInt();

        if (middleScore >= 90) {
            if (finalScore >= 95) {
                System.out.println(10);
            } else if (finalScore >= 90) {
                System.out.println(5);
            } else {
                System.out.println(0);
            }
        } else {
            System.out.println(0);
        }
    }
}