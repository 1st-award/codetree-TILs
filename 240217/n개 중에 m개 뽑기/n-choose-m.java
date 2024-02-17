import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    private static int n, m;
    private static ArrayList<Integer> combiantion = new ArrayList<>();
    private static ArrayList<ArrayList<Integer>> answer = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        choose(1, 0);

        Collections.reverse(answer);
        for (ArrayList<Integer> comb : answer) {
            for (int i = 0; i <comb.size(); ++i) {
                if (comb.get(i).intValue() == 1) {
                    System.out.print((i + 1) + " ");
                }
            }
            System.out.println();
        }
    }

    private static void save() {
        answer.add(new ArrayList<Integer>(combiantion));
    }

    private static void choose(int currNum, int cnt) {
        if (currNum == n + 1) {
            if (cnt == m)   save();
            return;
        }

        combiantion.add(0);
        choose(currNum + 1, cnt);
        combiantion.remove(combiantion.size() - 1);

        combiantion.add(1);
        choose(currNum + 1, cnt + 1);
        combiantion.remove(combiantion.size() - 1);
    }
}