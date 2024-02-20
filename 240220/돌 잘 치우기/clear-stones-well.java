import java.io.*;
import java.lang.*;
import java.util.*;

class Point {
    public int x, y;
    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    private static int n, m, k;
    private static ArrayList<Point> rockPointArr = new ArrayList<>();
    private static ArrayList<ArrayList<Integer>> combinationList = new ArrayList<>();
    private static ArrayList<Integer> combination = new ArrayList<>();
    private static Queue<Point> queue = new LinkedList<>();
    private static boolean[][] visited;
    private static int visitCount;
    private static int[][] board;
    private static Point[] startPointArr;

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        board = new int[n][n];
        visited = new boolean[n][n];
        for (int i = 0; i < n; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; ++j) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if (board[i][j] == 1) {
                    rockPointArr.add(new Point(i, j));
                }
            }
        }

        startPointArr = new Point[k];
        for (int i = 0; i < k; ++i) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            startPointArr[i] = new Point(x, y);
        }


        int bestCount = -1;
        findCombination(0, 0);
        // System.out.println(startPointArr.length);
        for (ArrayList<Integer> comb : combinationList) {
            visited = new boolean[n][n];
            setZero(comb);
            for (Point start : startPointArr) {
                if (canGo(start.x, start.y)) {
                    queue.clear();
                    visitCount = 1;
                    visited[start.x][start.y] = true;
                    queue.add(start);
                    BFS(start.x, start.y);
                    bestCount = Math.max(visitCount, bestCount);
                }
            }
            setOne(comb);
        }

        System.out.println(bestCount);
    }

    private static void saveCombination () {
        combinationList.add(new ArrayList<Integer>(combination));
    }

    private static void findCombination (int currNum, int cnt) {
        if (currNum == rockPointArr.size()) {
            if (cnt == m) {
                saveCombination();
            }
            return;
        }

        combination.add(currNum);
        findCombination(currNum + 1, cnt + 1);
        combination.remove(combination.size() - 1);

        findCombination(currNum + 1, cnt);
    }

    private static void setZero(ArrayList<Integer> targetRock) {
        for (int i = 0; i < targetRock.size(); ++i) {
            Point point = rockPointArr.get(targetRock.get(i));
            board[point.x][point.y] = 0;
        }
    }

    private static void setOne(ArrayList<Integer> targetRock) {
        for (int i = 0; i < targetRock.size(); ++i) {
            Point point = rockPointArr.get(targetRock.get(i));
            board[point.x][point.y] = 1;
        }
    }

    private static boolean isOutOfRange (int x, int y) {
        return 0 > x || 0 > y || n <= x || n <= y;
    }

    private static boolean canGo (int x, int y) {
        if (isOutOfRange(x, y)) return false;
        else if (visited[x][y] == true || board[x][y] == 1) return false;
        else return true;
    }

    private static void BFS (int x, int y) {
        int[] dx = new int[]{-1, 1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};

        while (queue.isEmpty() == false) {
            Point point = queue.poll();
            for (int i = 0; i < 4; ++i) {
                int newX = point.x + dx[i];
                int newY = point.y + dy[i];

                if (canGo(newX, newY)) {
                    visited[newX][newY] = true;
                    visitCount += 1;
                    queue.add(new Point(newX, newY));
                }
            }
        }
    }
}