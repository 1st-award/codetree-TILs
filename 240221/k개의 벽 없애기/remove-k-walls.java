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
    private final static int BLOCK = 1;
    private static int n, k;
    private static ArrayList<Point> blockList = new ArrayList<>();
    private static Queue<Point> queue = new LinkedList<>();
    private static int[][] board;
    private static int[][] boardCount;
    private static boolean[][] visited;
    private static Point startPoint;
    private static Point endPoint;

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        board = new int[n][n];
        for (int i = 0; i < n; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; ++j) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if (board[i][j] == BLOCK) {
                    blockList.add(new Point(i, j));
                }
            }
        }

        st = new StringTokenizer(br.readLine());
        startPoint = new Point(Integer.parseInt(st.nextToken()) - 1, Integer.parseInt(st.nextToken()) - 1);
        st = new StringTokenizer(br.readLine());
        endPoint = new Point(Integer.parseInt(st.nextToken()) - 1, Integer.parseInt(st.nextToken()) - 1);

        Combination.n = blockList.size();
        Combination.m = k;
        Combination.findCombination(0, 0);

        int bestCount = n * n;
        boolean isChange = false;
        for (int i = 0; i < Combination.getCombination().size(); ++i) {
            ArrayList<Integer> block = Combination.getCombination().get(i);
            queue.clear();
            visited = new boolean[n][n];
            boardCount = new int[n][n];

            setZero(block);
            queue.add(startPoint);
            visited[startPoint.x][startPoint.y] = true;
            BFS();
            setOne(block);
            
            if (visited[endPoint.x][endPoint.y] == true) {
                bestCount = Math.min(bestCount, boardCount[endPoint.x][endPoint.y]);
                isChange = true;
            }
        }

        if (isChange) {
            System.out.println(bestCount);
        } else {
            System.out.println(-1);
        }
    }

    private static void setZero(ArrayList<Integer> combination) {
        for (int i = 0; i < combination.size(); ++i) {
            int idx = combination.get(i);
            Point point = blockList.get(idx);
            board[point.x][point.y] = 0;
        }
    }

    private static void setOne(ArrayList<Integer> combination) {
        for (int i = 0; i < combination.size(); ++i) {
            int idx = combination.get(i);
            Point point = blockList.get(idx);
            board[point.x][point.y] = 1;
        }
    }

    private static boolean isOutOfRange(int x, int y) {
        return 0 > x || 0 > y || n <= x || n <= y;
    }

    private static boolean canGo(int x, int y) {
        if (isOutOfRange(x, y)) return false;
        else if (visited[x][y] == true || board[x][y] == BLOCK) return false;
        else return true;
    }

    private static void BFS() {
        int[] dx = new int[]{-1, 1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};

        while(queue.isEmpty() == false) {
            Point point = queue.poll();
            for (int i = 0; i < 4; ++i) {
                int newX = point.x + dx[i];
                int newY = point.y + dy[i];

                if (canGo(newX, newY)) {
                    visited[newX][newY] = true;
                    boardCount[newX][newY] = boardCount[point.x][point.y] + 1;
                    queue.add(new Point(newX, newY));
                }
            }
        }
    }
}