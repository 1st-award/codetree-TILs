import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.lang.*;

public class Main {
    private static int[][] board;
    private static boolean[][] visited;
    private static ArrayList<Integer> comfortVillegeCount = new ArrayList<>();
    private static int n, m;

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        board = new int[n][m];
        int maxK = 0;
        for (int i = 0; i < n; ++ i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; ++ j) {
                board[i][j] = Integer.parseInt(st.nextToken());
                maxK = Math.max(maxK, board[i][j]);
            }
        }

        int villegeCount;
        // System.out.println(maxK);
        int[] comfortVillege = new int[maxK];
        for (int k = 1; k <= maxK; ++ k) {
            visited = new boolean[n][m];
            villegeCount = 0;
            for (int i = 0; i < n; ++ i) {
                for (int j = 0; j < m; ++ j) {
                    if (canGo(i, j, k)) {
                        // System.out.println(i + " " + j);
                        visited[i][j] = true;
                        villegeCount += 1;
                        DFS(i, j, k);
                    }
                }
            }
            comfortVillege[k - 1] = villegeCount;
        }

        List<Integer> comfortVillegeList = Arrays.stream(comfortVillege).boxed().collect(Collectors.toList());
        int maxComfortVillege = Collections.max(comfortVillegeList);
        maxK = comfortVillegeList.indexOf(maxComfortVillege);
        System.out.println((maxK + 1) + " " + maxComfortVillege);
    }

    private static boolean isOutOfRange(int x, int y) {
        return 0 > x || 0 > y || n <= x || m <= y;
    }

    private static boolean canGo (int x, int y, int k) {
        if (isOutOfRange(x, y)) return false;
        else if (visited[x][y] || board[x][y] <= k) return false;
        else return true;
    }

    private static void DFS (int x, int y, int k) {
        int[] dx = new int[]{-1, 1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};

        for(int i = 0; i < 4; ++ i) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (canGo(newX, newY, k)) {
                visited[newX][newY] = true;
                DFS(newX, newY, k);
            }
        }
    }
}