import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(year % 4 == 0 && !(year % 100 == 0 && year % 400 != 0));
    }
}