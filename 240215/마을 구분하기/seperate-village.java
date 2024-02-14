import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    private static int n;
    private static int count;
    private static int[][] board;
    private static boolean[][] visited;
    private static List<Integer> humanCount;
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        board = new int[n][n];
        visited = new boolean[n][n];
        humanCount = new ArrayList<>();
        for (int i = 0; i < n; ++ i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; ++ j) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; ++ i) {
            for (int j = 0; j < n; ++ j) {
                if (canGo(i, j)) {
                    visited[i][j] = true;
                    count = 1;
                    DFS(i, j);
                    humanCount.add(count);
                }
            }
        }

        Collections.sort(humanCount);
        System.out.println(humanCount.size());
        for (int i = 0; i < humanCount.size(); ++ i) {
            System.out.println(humanCount.get(i));
        }
    }

    private static boolean isOutOfRange (int x, int y) {
        return 0 > x || 0 > y || x >= n || y >= n;
    }

    private static boolean canGo (int x, int y) {
        // System.out.println(x + " " + y);
        if (isOutOfRange(x, y)) return false;
        else if (visited[x][y] == true || board[x][y] == 0) return false;
        else return true;
    }

    private static void DFS (int x, int y) {
        int[] dx = new int[]{-1, 1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};

        for (int i = 0; i < 4; ++ i) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (canGo(newX, newY)) {
                visited[newX][newY] = true;
                count += 1;
                DFS (newX, newY);
            }
        }
    }
}