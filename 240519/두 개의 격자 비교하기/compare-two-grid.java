import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];
        // input value in arr1
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                arr1[i][j] = sc.nextInt();
            }
        }
        // input value in arr2
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                arr2[i][j] = sc.nextInt();
            }
        }

        int[][] mergeArr = new int[n][m];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                mergeArr[i][j] = arr1[i][j] == arr2[i][j] ? 0 : 1;
            }
        }

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                System.out.print(mergeArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}