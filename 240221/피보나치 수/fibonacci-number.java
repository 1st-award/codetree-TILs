import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    private static int n;
    private static ArrayList<Integer> memo = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        memo.add(1);
        memo.add(1);

        for (int i = 3; i <= n; ++i) {
            memo.add(memo.get(i - 3) + memo.get(i - 2));
        }
        System.out.println(memo.get(memo.size() - 1));
    }
}