import java.io.*;
import java.util.*;
import java.lang.*;


public class Main {
    private static int n, m;
    private static int maxXOR;
    private static ArrayList<Integer> combination = new ArrayList<>();
    private static int[] board;

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        board = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; ++i) {
            board[i] = Integer.parseInt(st.nextToken());
        }

        findCombination(1, 0);
        System.out.println(maxXOR);
    }

    private static int getMaxXOR () {
        int tempXOR = 0;
        for (int i = 0; i < combination.size(); ++i) {
            tempXOR ^= combination.get(i);
        }
        return tempXOR;
    }

    private static void findCombination(int currNum, int cnt) {
        if (currNum == n + 1) {
            if (cnt == m) {
                maxXOR = Math.max(maxXOR, getMaxXOR());
            }
            return;
        }

        combination.add(board[currNum - 1]);
        findCombination(currNum + 1, cnt + 1);
        combination.remove(combination.size() - 1);

        findCombination(currNum + 1, cnt);
    }
}