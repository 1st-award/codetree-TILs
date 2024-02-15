import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    private static int n;
    private static int[][] board;
    private static boolean[][] visited;
    private static int tempRemoveBlock;

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        board = new int[n][n];

        int maxK = 0;
        for (int i = 0; i < n; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; ++j) {
                board[i][j] = Integer.parseInt(st.nextToken());
                maxK = Math.max(maxK, board[i][j]);
            }
        }

        int maxBlockNumer = 0;
        int maxRemoveBlock = 0;
        for (int k = 1; k <= maxK; ++k) {
            visited = new boolean[n][n];
            tempRemoveBlock = 0;
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < n; ++j) {
                    if (canGo(i, j, k)) {
                        visited[i][j] = true;
                        tempRemoveBlock = 1;
                        DFS(i, j, k);
                        if (tempRemoveBlock > maxRemoveBlock) {
                            maxRemoveBlock = tempRemoveBlock;
                        }
                        if (tempRemoveBlock >= 4) {
                            maxBlockNumer = k;
                        }
                    }
                }
            }
        }
        System.out.println(maxBlockNumer + " " + maxRemoveBlock);
    }

    private static boolean isOutOfRange(int x, int y) {
        return 0 > x || 0 > y || n <= x || n <= y;
    }

    private static boolean canGo(int x, int y, int k) {
        if (isOutOfRange(x, y)) return false;
        else if (visited[x][y] || board[x][y] != k) return false;
        else return true;
    }

    private static void DFS(int x, int y, int k) {
        int[] dx = new int[]{-1, 1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};

        for (int i = 0; i < 4; ++i) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (canGo(newX, newY, k)) {
                visited[newX][newY] = true;
                tempRemoveBlock += 1;
                DFS(newX, newY, k);
            }
        }
    }
}