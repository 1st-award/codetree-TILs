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

class Combination {
    private static ArrayList<ArrayList<Integer>> combinationList = new ArrayList<>();
    private static ArrayList<Integer> combination = new ArrayList<>();
    public static int n, m;

    private static void save() {
        combinationList.add(new ArrayList<Integer>(combination));
    }

    public static void findCombination(int currNum, int cnt) {
        if (cnt > m)  return;
        if (currNum == n) {
            if (cnt == m) {
                save();
            }
            return;
        }

        combination.add(currNum);
        findCombination(currNum + 1, cnt + 1);
        combination.remove(combination.size() - 1);

        findCombination(currNum + 1, cnt);
    }

    public static ArrayList<ArrayList<Integer>> getCombination() {
        return combinationList;
    }
}

public class Main {
    private static int n, k, u, d;
    private static int[][] board;
    private static boolean[][] visited;
    private static Queue<Point> queue = new LinkedList<>();
    private static ArrayList<Point> villegePointList = new ArrayList<>();
    private static int canVisitedCount;

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        u = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());

        board = new int[n][n];
        for (int i = 0; i < n; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; ++j) {
                board[i][j] = Integer.parseInt(st.nextToken());
                villegePointList.add(new Point(i, j));
            }
        }

        Combination.n = villegePointList.size();
        Combination.m = k;
        Combination.findCombination(0, 0);
        ArrayList<ArrayList<Integer>> combinationList = Combination.getCombination();
        int bestVisitiedCount = -1;
        for (ArrayList<Integer> startPointList: combinationList) {

            visited = new boolean[n][n];
            canVisitedCount = 0;    
            for (int i = 0; i < startPointList.size(); ++i) {

                Point point = villegePointList.get(startPointList.get(i));
                if (visited[point.x][point.y] == false) {
                    canVisitedCount += 1;
                    visited[point.x][point.y] = true;
                    queue.add(point);
                    BFS();
                }
            }
            bestVisitiedCount = Math.max(bestVisitiedCount, canVisitedCount);
        } 
        System.out.println(bestVisitiedCount);
    }

    private static boolean isOutOfRange(int x, int y) {
        return 0 > x || 0 > y || n <= x || n <= y;
    }

    private static boolean canGo(int x, int y, int startX, int startY) {
        if (isOutOfRange(x, y)) return false;
        // System.out.println(x + " " + y + " " + startX + " " + startY);
        int diff = Math.abs(board[x][y] - board[startX][startY]);
        if (visited[x][y] == true || diff < u || diff > d)   return false;
        else return true;
    }

    private static void BFS() {
        int[] dx = new int[]{-1, 1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};

        while (queue.isEmpty() == false) {
            Point point = queue.poll();
            for(int i = 0; i < 4; ++i) {
                int newX = point.x + dx[i];
                int newY = point.y + dy[i];

                if (canGo(newX, newY, point.x, point.y)) {
                    canVisitedCount += 1;
                    visited[newX][newY] = true;
                    queue.add(new Point(newX, newY));
                }
            }
        }
    }
}