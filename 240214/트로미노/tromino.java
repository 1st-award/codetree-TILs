import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    private static int n, m;

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int[][] board = new int[n][m];
        for(int i = 0; i < n; ++i) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; ++j) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int maxScore = -1;
        for (int i = 0; i < n; ++ i) {
            for (int j = 0; j < m; ++ j) {
                maxScore = Math.max(maxScore, getLineBlockWidth(i, j, board));
                maxScore = Math.max(maxScore, getLineBlockHeight(i, j, board));
                maxScore = Math.max(maxScore, getSquare(i, j, board));
            }
        }
        System.out.println(maxScore);
    }

    private static int getLineBlockWidth(int _startY, int _startX, int[][] _board) {
        if (_startX > m - 3)   return -1;
        int sumScore = 0;
        for(int i = _startX; i < _startX + 3; ++ i) {
            sumScore += _board[_startY][i];
        }
        return sumScore;
    }

    private static int getLineBlockHeight(int _startY, int _startX, int[][] _board) {
        if (_startY > n - 3)   return - 1;
        int sumScore = 0;
        for (int i = _startY; i < _startY + 3; ++ i) {
            sumScore += _board[i][_startX];
        }
        return sumScore;
    }

    private static int getSquare(int _startY, int _startX, int[][] _board) {
        if (_startX > m - 2 || _startY > n - 2)   return -1;
        int sumScore = 0;
        int tempScore = 0;
        int[] sliceArray = new int [4];
        sliceArray[0] = _board[_startY][_startX];
        sliceArray[1] = _board[_startY][_startX + 1];
        sliceArray[2] = _board[_startY + 1][_startX];
        sliceArray[3] = _board[_startY + 1][_startX + 1];

        for (int i = 0; i < sliceArray.length; ++ i) {
            tempScore = 0;
            for (int j = 0; j < sliceArray.length; ++ j) {
                if (i == j) continue;
                tempScore += sliceArray[j];
                sumScore = Math.max(sumScore, tempScore);
            }
        }
        return sumScore;
    }
}