import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");
        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();
        System.out.printf("%d.%d.%d\n", year, month, day);
    }
}