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
    private final static int BLOCK = 1;
    private final static int PERSON = 2;
    private final static int SAFE_PLACE = 3;
    private static int n, h, m;
    private static int[][] board;
    private static int[][] answer;
    private static int[][] boardMoveCount;
    private static boolean[][] visited;
    private static ArrayList<Point> startPointList = new ArrayList<>();
    private static ArrayList<Point> endPointList = new ArrayList<>();
    private static Queue<Point> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        board = new int[n][n];
        answer = new int[n][n];
        for (int i = 0; i < n; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; ++j) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if (board[i][j] == PERSON) {
                    startPointList.add(new Point(i, j));
                } else if (board[i][j] == SAFE_PLACE) {
                    endPointList.add(new Point(i, j));
                }
            }
        }

        for (Point startPoint : startPointList) {
            queue.clear();
            queue.add(startPoint);
            boardMoveCount = new int[n][n];
            visited = new boolean[n][n];
            BFS(startPoint);

            int minMoveCount = n * n;
            for (Point endPoint : endPointList) {
                if (boardMoveCount[endPoint.x][endPoint.y] == 0)    continue;
                minMoveCount = Math.min(minMoveCount, boardMoveCount[endPoint.x][endPoint.y]);
            }
            if (minMoveCount == n * n) {
                answer[startPoint.x][startPoint.y] = -1;
            } else {
                answer[startPoint.x][startPoint.y] = minMoveCount;
            }
        }

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isOutOfRange(int x, int y) {
        return 0 > x || 0 > y || n <= x || n <= y;
    }

    private static boolean canGo(int x, int y) {
        if (isOutOfRange(x, y)) return false;
        else if (board[x][y] == BLOCK || visited[x][y] == true)  return false;
        else return true;
    }

    private static void BFS(Point startPoint) {
        int[] dx = new int[]{-1, 1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};

        while (queue.isEmpty() == false) {
            Point point = queue.poll();
            for (int i = 0; i < 4; ++i) {
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