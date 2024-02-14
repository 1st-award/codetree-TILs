import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[][] board = new int[N][N];
        for(int i = 0; i < N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; ++j) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int maxCoin = -1;
        for(int i = 0; i <= N - 3; ++i) {
            for(int j = 0; j <= N - 3; ++j) {
                maxCoin = Math.max(maxCoin, calcMaxCoin(i, j, board));
            }
        }
        System.out.println(maxCoin);
    }

    private static int calcMaxCoin(int _startY, int _startX, int[][] _board) {
        int coinCount = 0;
        for(int i = _startY; i < _startY + 3; ++i) {
            for(int j = _startX; j < _startX + 3; ++j) {
                if (_board[i][j] == 1) coinCount += 1;
            }
        }
        return coinCount;
    }
}