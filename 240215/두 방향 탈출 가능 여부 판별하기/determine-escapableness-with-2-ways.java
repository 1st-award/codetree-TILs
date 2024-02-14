import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    private static int n, m;
    private static int[][] board;
    private static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        board = new int[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; ++ i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; ++ j) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        DFS(0, 0);
        if (visited[n - 1][m - 1] == true) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    private static boolean isOutOfRange (int newX, int newY) {
        return 0 > newX || 0 > newY || newX >= n || newY >= m;
    }

    private static boolean canGo (int newX, int newY) {
        if (isOutOfRange(newX, newY))   return false;
        else if (visited[newX][newY] == true || board[newX][newY] == 0)  return false;
        else    return true;
    }

    private static void DFS (int x, int y) {
        int[] dx = new int[]{1, 0};
        int[] dy = new int[]{0, 1};

        for (int i = 0; i < 2; ++ i) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (canGo(newX, newY)) {
                // System.out.println(newX + " " + newY);
                visited[newX][newY] = true;
                DFS(newX, newY);
            }
        }
    }
}