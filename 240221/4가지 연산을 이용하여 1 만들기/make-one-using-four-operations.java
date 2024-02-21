import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    private static int n;
    private static Queue<Integer> queue = new LinkedList<>();
    private static int[] board;
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        board = new int[(n * 2) + 1];
        visited = new boolean[(n * 2) + 1];
        visited[n] = true;
        queue.add(n);
        BFS();

        System.out.println(board[1]);
    }

    private static boolean isOutOfRange(int x) {
        return 0 > x || (n * 2) + 1 <= x;
    }

    private static boolean canGo(int x) {
        if (isOutOfRange(x))    return false;
        else if (visited[x] == true)    return false;
        else return true;
    }

    private static void BFS() {
        while (queue.isEmpty() == false) {
            int originN = queue.poll();

            for (int i = 0; i < 4; ++i) {
                int newN = 0;

                if (i == 0) newN = originN - 1;
                else if (i == 1) newN = originN + 1;
                else if (i == 2 && originN % 2 == 0) newN = originN / 2;
                else if (i == 3 && originN % 3 == 0) newN = originN / 3;
                else continue;


                if (canGo(newN)) {
                    visited[newN] = true;
                    board[newN] = board[originN] + 1;
                    queue.add(newN);
                }
            }
        }
    }
}