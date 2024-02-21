import java.io.*;
import java.lang.*;
import java.util.*;

class Point {
    public int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    private static int n;
    private static Queue<Point> queue = new LinkedList<>();
    private static boolean[][] visited;
    private static int[][] boardMoveCount;
    private static Point startPoint;
    private static Point endPoint;

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        visited = new boolean[n][n];
        boardMoveCount = new int[n][n];

        st = new StringTokenizer(br.readLine());
        startPoint = new Point(Integer.parseInt(st.nextToken()) - 1, Integer.parseInt(st.nextToken()) - 1);
        endPoint = new Point(Integer.parseInt(st.nextToken()) - 1, Integer.parseInt(st.nextToken()) - 1);

        queue.add(startPoint);
        visited[startPoint.x][startPoint.y] = true;
        BFS();
        if (visited[endPoint.x][endPoint.y] == false) {
            System.out.println(-1);
        } else {
            System.out.println(boardMoveCount[endPoint.x][endPoint.y]);
        }
    }

    private static boolean isOutOfRange(int x, int y) {
        return 0 > x || 0 > y || n <= x || n <= y;
    }

    private static boolean canGo(int x, int y) {
        if (isOutOfRange(x, y)) return false;
        else if (visited[x][y] == true) return false;
        return true;
    }

    private static void BFS() {
        int[] dx = new int[]{1, 1, -1, -1, 2, 2, -2, -2};
        int[] dy = new int[]{-2, 2, -2, 2, -1, 1, -1, 1};

        while (queue.isEmpty() == false) {
            Point point = queue.poll();
            for (int i = 0; i < 8; ++i) {
                int newX = point.x + dx[i];
                int newY = point.y + dy[i];
                
                if (canGo(newX, newY)) {
                    visited[newX][newY] = true;
                    boardMoveCount[newX][newY] = boardMoveCount[point.x][point.y] + 1;
                    queue.add(new Point(newX, newY));
                }
            }

        }
    }
}