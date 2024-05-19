public class Main {
    private final static int SIZE =5;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int[][] arr = new int[SIZE][SIZE];

        for (int i = 0; i < SIZE; ++i) {
            arr[0][i] = 1;
            arr[i][0] = 1;
        }

        for (int i  = 1; i < SIZE; ++i) {
            for (int j = 1; j < SIZE; ++j) {
                arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
            }
        }

        for (int i = 0; i < SIZE; ++i) {
            for (int j = 0; j < SIZE; ++j) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}