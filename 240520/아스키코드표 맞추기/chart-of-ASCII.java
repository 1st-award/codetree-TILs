import java.util.*;

public class Main {
    private final static int SIZE = 5;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < SIZE; ++i) {
            int asciiCode = sc.nextInt();
            System.out.print((char) asciiCode + " ");
        }
    }
}