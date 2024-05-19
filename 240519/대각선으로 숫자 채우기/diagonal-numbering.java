import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int num = 1;
        int row = 0;
        int col = 0;

        for (int i = 0; i < m; ++i) {

            row = i;
            col = 0;
            while (row >= 0 && col < n) {
                // System.out.println(col + " " + row);
                arr[col][row] = num;
                num += 1;
                row -= 1;
                col += 1;
            }
        }

        for (int i = 1; i < n; ++i) {

            row = m - 1;
            col = i;
            while (col < n && row >= 0) {
                // System.out.println(col + " " + row);
                arr[col][row] = num;
                num += 1;
                row -= 1;
                col += 1;
            }
        }

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}