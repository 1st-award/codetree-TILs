import java.io.*;
import java.util.*;
import java.lang.*;

class Pointer {
    public int x, y;
    public Pointer (int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    private static int n, k;
    private static int[][] board;
    private static boolean[][] visited;
    private static Pointer[] startPoint;
    private static LinkedList<Pointer> queue = new LinkedList<>();
    private static int visitCount;

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        board = new int[n + 1][n + 1];
        for (int i = 1; i <= n; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; ++j) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        startPoint = new Pointer[k];
        for (int i = 0; i < k; ++i) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            startPoint[i] = new Pointer(x, y);
        }


        Set<Integer> visitCountSet = new HashSet<>();
        for (Pointer sp : startPoint) {
            queue.clear();
            visited = new boolean[n + 1][n + 1];
            visitCount = 1;

            queue.add(sp);
            visited[sp.x][sp.y] = true;
            BFS(sp.x, sp.y);
            // System.out.println(visitCount);
            visitCountSet.add(visitCount);
        }

        int visitCountSum = visitCountSet.stream().mapToInt(Integer::intValue).sum();
        System.out.println(visitCountSum);
    }

    private static boolean isOutOfRange (int x, int y) {
        return 1 > x || 1 > y || n < x || n < y;
    }

    private static boolean canGo (int x, int y) {
        // System.out.println(x + " " + y);
        if (isOutOfRange(x, y)) {
            // System.out.println(11);
            return false;
        }
        else if (visited[x][y] || board[x][y] == 1) {
            // System.out.println(22);
            return false;
        }
        else {
            // System.out.println(33);
            return true;
        }
    }

    private static void BFS (int x, int y) {
        int[] dx = new int[]{-1, 1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};

        while(queue.isEmpty() == false) {
            Pointer pointer = queue.poll();

            for (int i = 0; i < 4; ++i) {
                int newX = pointer.x + dx[i];
                int newY = pointer.y + dy[i];

                if (canGo(newX, newY)) {
                    // System.out.println(newX + " " + newY);
                    // System.out.println(visitCount);
                    visited[newX][newY] = true;
                    visitCount += 1;
                    queue.add(new Pointer(newX, newY));
                }
            }
        }
    }
}