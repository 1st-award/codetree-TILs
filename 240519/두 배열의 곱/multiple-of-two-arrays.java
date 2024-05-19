import java.util.*;

public class Main {
    private final static int SIZE = 3;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[][] arr1 = new int[SIZE][SIZE];
        int[][] arr2 = new int[SIZE][SIZE];
        // input value in arr1
        for (int n = 0; n < SIZE; ++n) {
            for (int m = 0; m < SIZE; ++m) {
                arr1[n][m] = sc.nextInt();
            }
        }   
        // input value in arr2
        for (int n = 0; n < SIZE; ++n) {
            for (int m = 0; m < SIZE; ++m) {
                arr2[n][m] = sc.nextInt();
            }
        }
        
        int[][] mergeArr = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; ++i) {
            for (int j = 0; j < SIZE; ++j) {
                mergeArr[i][j] = arr1[i][j] * arr2[i][j];
            }
        }

        for (int i = 0; i < SIZE; ++i) {
            for (int j = 0; j < SIZE; ++j) {
                System.out.print(mergeArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}