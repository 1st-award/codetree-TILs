import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int num = 1;
        boolean arrow = false; // true: down, false: up

        for (int i = n - 1; i >= 0; --i) {
            if (arrow) {
                for (int j = 0; j < n; ++j) {
                    arr[j][i] = num;
                    num += 1;
                }
            }
            else {
                for (int j = n - 1; j >= 0; --j) {
                    arr[j][i] = num;
                    num += 1;
                }
            }

            arrow = arrow ? false : true;
        }

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}