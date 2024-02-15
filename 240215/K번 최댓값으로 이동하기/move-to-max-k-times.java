import java.io.*;
import java.lang.*;
import java.util.*;

class Pointer {
    public int x, y;
    public Pointer (int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    private static int n, maxK;
    private static int[][] board;
    private static boolean[][] visited;
    private static Queue<Pointer> queue = new LinkedList<>();
    private static int maxValue;
    private static Pointer nextStart;

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        maxK = Integer.parseInt(st.nextToken());
        board = new int[n][n];
        for (int i = 0; i < n; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; ++j) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken()) - 1;
        int y = Integer.parseInt(st.nextToken()) - 1; 
        nextStart = new Pointer(x, y);
        for (int k = 0; k < maxK; ++k) {
            visited = new boolean[n][n];
            visited[nextStart.x][nextStart.y] = true;
            maxValue = 0;

            // System.out.println(nextStart.x + " " + nextStart.y);
            queue.add(nextStart);
            BFS(nextStart.x, nextStart.y, board[nextStart.x][nextStart.y]);
        }

        System.out.println((nextStart.x + 1) + " " + (nextStart.y + 1));
    }

    private static boolean isOutOfRange (int x, int y) {
        return 0 > x || 0 > y || n <= x || n <= y;
    }

    private static boolean canGo (int x, int y, int value) {
        if (isOutOfRange(x, y)) return false;
        else if (visited[x][y] || board[x][y] >= value)  return false;
        else return true;
    }

    private static void BFS (int x, int y, int value) {
        int[] dx = new int[]{-1, 1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};


        while (queue.isEmpty() == false) {
            Pointer point = queue.poll();
            for (int i = 0; i < 4; ++ i) {
                int newX = point.x + dx[i];
                int newY = point.y + dy[i];

                if (canGo(newX, newY, value)) {
                    visited[newX][newY] = true;
                    queue.add(new Pointer(newX, newY));

                    if (maxValue <= board[newX][newY]) {
                        if (maxValue == board[newX][newY]) {
                            if (newX <= nextStart.x) {
                                if (newX == nextStart.x) {
                                    if (newY < nextStart.y) {
                                        // System.out.println(maxValue + " " + newX + " " + newY);
                                        nextStart = new Pointer(newX, newY);    
                                    }
                                } else {
                                    // System.out.println(maxValue + " " + newX + " " + newY);
                                    nextStart = new Pointer(newX, newY);
                                }
                            }
                        } else {
                            nextStart = new Pointer(newX, newY);
                            maxValue = board[newX][newY];
                            // System.out.println(maxValue + " " + newX + " " + newY);
                        }
                    }
                }
            }   
        }
    }
}