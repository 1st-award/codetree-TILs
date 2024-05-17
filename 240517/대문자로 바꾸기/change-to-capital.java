import java.util.*;

public class Main {
    private final static int ROW = 3;
    private final static int COL = 5;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[COL][ROW];

        for (int i = 0; i < COL; ++i) {
            for (int j = 0; j < ROW; ++j) {
                arr[i][j] = sc.next().charAt(0);
            }
        }

        for (int i = 0; i < COL; ++i) {
            for (int j = 0; j < ROW; ++j) {
                System.out.print((char) (arr[i][j] + 'A' - 'a') + " ");
            }
            System.out.println();
        }
    }
}