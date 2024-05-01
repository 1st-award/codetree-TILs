import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int temperature = sc.nextInt();

        if (0 > temperature) {
            System.out.println("ice");
        } else if (99 < temperature) {
            System.out.println("vapor");
        } else {
            System.out.println("water");
        }
    }
}