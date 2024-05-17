import java.util.*;

public class Main {
    private final static int ROW = 4;
    private final static int COL = 2;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[COL][ROW];

        for (int i = 0; i < COL; ++i) {
            for (int j = 0; j < ROW; ++j) {
                arr[i][j] = sc.nextInt();
            }
        }

        
        for (int i = 0; i < COL; ++i) {
            int sum = 0;
            for (int j = 0; j < ROW; ++j) {
                sum += arr[i][j];
            }

            System.out.printf("%.1f ", (double)sum / ROW);
        }

        System.out.println();
        for (int i = 0; i < ROW; ++i) {
            int sum = 0;
            for (int j = 0; j < COL; ++j) {
                sum += arr[j][i];
            }

            System.out.printf("%.1f ", (double)sum / COL);
        }

        System.out.println();
        int sum = 0;
        for (int i = 0; i < COL; ++i) {
            for (int j = 0; j < ROW; ++j) {
                sum += arr[i][j];
            }
        }

        System.out.printf("%.1f\n", (double)sum / (ROW * COL));
    }
}