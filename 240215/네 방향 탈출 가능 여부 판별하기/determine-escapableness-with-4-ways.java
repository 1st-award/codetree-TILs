import java.io.*;
import java.util.*;
import java.lang.*;

class Pair {
    public int x, y;
    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    private static int n, m;
    private static int[][] board;
    private static boolean[][] visited;
    private static Queue<Pair> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        board = new int[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; ++j) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        visited[0][0] = true;
        queue.add(new Pair(0, 0));
        BFS(0, 0);

        if (visited[n - 1][m - 1] == true) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    private static boolean isOutOfRange(int x, int y) {
        return 0 > x || 0 > y || n <= x || m <= y;
    }

    private static boolean canGo(int x, int y) {
        if (isOutOfRange(x, y)) return false;
        else if (visited[x][y] || board[x][y] == 0) return false;
        else return true;
    }

    private static void BFS(int x, int y) {
        int[] dx = new int[]{-1, 1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};

        while (queue.isEmpty() == false) {
            Pair nextPair = queue.poll();
            
            for (int i = 0; i < 4; ++i) {
                int newX = nextPair.x + dx[i];
                int newY = nextPair.y + dy[i];

                if (canGo(newX, newY)) {
                    visited[newX][newY] = true;
                    queue.add(new Pair(newX, newY));
                }
            }
        }
    }
}