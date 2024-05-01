import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();
        width += 8;
        height *= 3;

        System.out.println(width);
        System.out.println(height);
        System.out.println(width * height);
    }
}