import java.io.*;
import java.util.*;
import java.lang.*;

class Point {
    public int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    private static int n, m;
    private static int[][] board;
    private static int[][] boardMoveCount;
    private static boolean[][] visited;
    private static Queue<Point> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        board = new int[n][m];
        boardMoveCount = new int[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; ++j) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        queue.add(new Point(0, 0));
        BFS();
        System.out.println(boardMoveCount[n-1][m-1]);
    }

    private static boolean isOutOfRange(int x, int y) {
        return 0 > x || 0 > y || n <= x || m <= y;
    }

    private static boolean canGo(int x, int y) {
        // System.out.println(x + " " + y);
        if (isOutOfRange(x, y)) return false;
        else if (visited[x][y] == true || board[x][y] == 0) return false;
        else return true;
    }

    private static void BFS() {
        int[] dx = new int[]{1, -1, 0, 0};
        int[] dy = new int[]{0, 0, 1, -1};

        while (queue.isEmpty() == false) {

            Point point = queue.poll();
            for (int i = 0; i < 4; ++i) {
                int newX = point.x + dx[i];
                int newY = point.y + dy[i];

                if(canGo(newX, newY)) {
                    // System.out.println(newX + " " + newY);
                    visited[newX][newY] = true;
                    boardMoveCount[newX][newY] = boardMoveCount[point.x][point.y] + 1;
                    queue.add(new Point(newX, newY));
                }
            }
        }
    }
}