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
    private final static int ROT = 2;
    private static int n, k;
    private static Queue<Point> queue = new LinkedList<>();
    private static int[][] board;
    private static int[][] boardCount;
    private static boolean[][] visited;
    private static ArrayList<Point> startPoint = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        board = new int[n][n];
        boardCount = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; ++j) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if (board[i][j] == ROT) {
                    startPoint.add(new Point(i, j));
                }
            }
        }

        for (Point point : startPoint) {
            queue.add(point);
            visited[point.x][point.y] = true;
        }
        BFS();

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (boardCount[i][j] == 0 && board[i][j] == 0) {
                    System.out.print(-1 + " ");
                } else if (boardCount[i][j] == 0 && board[i][j] == 2) {
                    System.out.print(0 + " ");
                } else if (boardCount[i][j] == 0 && board[i][j] == 1) {
                    System.out.print(-2 + " ");
                } else {
                    System.out.print(boardCount[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    private static boolean isOutOfRange(int x, int y) {
        return 0 > x || 0 > y || n <= x || n <= y;
    }

    private static boolean canGo(int x, int y) {
        if (isOutOfRange(x, y)) return false;
        else if (visited[x][y] == true || board[x][y] != 1) return false;
        else return true;
    }

    private static void BFS() {
        int[] dx = new int[]{-1, 1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};

        while (queue.isEmpty() == false) {
            Point point = queue.poll();
            for (int i = 0; i < 4; ++i) {
                int newX = point.x + dx[i];
                int newY = point.y + dy[i];

                if (canGo(newX, newY)) {
                    // System.out.println(newX + " " + newY);
                    visited[newX][newY] = true;
                    boardCount[newX][newY] = boardCount[point.x][point.y] + 1;
                    queue.add(new Point(newX, newY));
                }
            }
        }
    }
}