import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);

        while (true) {
            int width = sc.nextInt();
            int height = sc.nextInt();
            char chr = sc.next().charAt(0);

            System.out.println(width * height);
            if (chr == 'C') break;
        }
    }
}