import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    private final static long MOD = 1000000007;
    private static int n;
    private static ArrayList<Long> memo = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        memo.add((long)0);
        memo.add((long)2);
        memo.add((long)7);
        memo.add((long)22);
        
        for (int i = 4; i <= n; ++i) {
            memo.add(((3 * memo.get(i - 1)) + memo.get(i - 2) - memo.get(i - 3)) % MOD);
        }

        System.out.println(memo.get(n));
    }
}