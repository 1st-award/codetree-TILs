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
    private static boolean[][] coastLine;
    private static Queue<Point> queue = new LinkedList<>();
    private static ArrayList<Point> glacierList = new ArrayList<>();
    
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        board = new int[n][m];
        coastLine = new boolean[n][m];
        for (int i = 0; i < n; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; ++j) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if (board[i][j] == 1) {
                    glacierList.add(new Point(i, j));
                }
            }
        }

        int latestTime = 0;
        int latestGlacierSize = 0;
        while (glacierList.size() != 0) {
            latestTime += 1;
            latestGlacierSize = glacierList.size();
            coastLine = new boolean[n][m];
            queue.add(new Point(0, 0));

            findCoastLine();
            meltGlacier();
            findGlacier();
        }
        System.out.println(latestTime + " " + latestGlacierSize);
    }

    private static boolean isOutOfRange(int x, int y) {
        return 0 > x || 0 > y || n <= x || m <= y;
    }

    private static boolean isCoastLine(int x, int y) {
        if (isOutOfRange(x, y)) return false;
        else if (coastLine[x][y] == true || board[x][y] == 1)   return false;
        else return true;
    }

    private static void findCoastLine() {
        int[] dx = new int[]{-1, 1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};

        while (queue.isEmpty() == false) {
            Point point = queue.poll();

            for (int i = 0; i < 4; ++i) {
                int newX = point.x + dx[i];
                int newY = point.y + dy[i];

                if (isCoastLine(newX, newY)) {
                    coastLine[newX][newY] = true;
                    queue.add(new Point(newX, newY));
                }
            }
        }
    }

    private static void meltGlacier() {
        int[] dx = new int[]{-1, 1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};

        for (int i = 0; i < glacierList.size(); ++i) {
            Point point = glacierList.get(i);
            for (int j = 0; j < 4; ++j) {
                int newX = point.x + dx[j];
                int newY = point.y + dy[j];

                if (coastLine[newX][newY]) {
                    board[point.x][point.y] = 0;
                    break;
                }
            }
        }
    }

    private static void findGlacier() {
        glacierList.clear();
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (board[i][j] == 1) {
                    glacierList.add(new Point(i, j));
                }
            }
        }
    }
}