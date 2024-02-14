import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] board = new int[n][n];
        for (int i = 0; i < n; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; ++j) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int happySequenceCount = 0;
        for (int i = 0; i < n; ++i) {
            if (isHappySequenceHeight(i, n, m, board)) happySequenceCount += 1;
            if (isHappySequenceWidth(i, n, m, board)) happySequenceCount += 1;
        }        
        System.out.println(happySequenceCount);
    }

    private static boolean isHappySequenceWidth(int _fixIdx, int _n, int _m, int[][] _board) {
        final int MAX_NUMBER = 101;
        int[] sliceArray;
        int[] sequenceNumber;
        for(int i = 0; i <= _n - _m; ++i) {
            sliceArray = Arrays.copyOfRange(_board[_fixIdx], i, i + _m);
            sequenceNumber = new int[MAX_NUMBER];
            for(int j = 0; j < sliceArray.length; ++j) {
                sequenceNumber[sliceArray[j]] += 1;
            }    
            for(int j = 1; j < MAX_NUMBER; ++j) {
                if (sequenceNumber[j] >= _m) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isHappySequenceHeight(int _fixIdx, int _n, int _m, int[][] _board) {
        final int MAX_NUMBER = 101;
        int[] sliceArray = new int[_m];
        int[] sequenceNumber;
        for(int i = 0; i <= _n - _m; ++i) {
            sequenceNumber = new int[MAX_NUMBER];
            for (int j = 0; j < _m; ++j) {
                sliceArray[j] = _board[i + j][_fixIdx];
            }
            for(int j = 0; j < sliceArray.length; ++j) {
                sequenceNumber[sliceArray[j]] += 1;
            }    
            for(int j = 1; j < MAX_NUMBER; ++j) {
                if (sequenceNumber[j] >= _m) {
                    return true;
                }
            }
        }
        return false;
    }
}