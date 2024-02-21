import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    private final static int MOD = 10007;
    private static int n;
    private static ArrayList<Integer> memo = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        
        memo.add(0);
        memo.add(1);
        memo.add(2);
        memo.add(3);
        for (int i = 4; i <= n; ++i) {
            memo.add((memo.get(i - 2) + memo.get(i - 1)) % MOD);
        }

        System.out.println(memo.get(n));
    }
}