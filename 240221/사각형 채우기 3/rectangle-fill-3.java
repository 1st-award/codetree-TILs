import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

public class Main {
    private final static BigInteger MOD = new BigInteger("1000000007");
    private static int n;
    private static ArrayList<BigInteger> memo = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        memo.add(new BigInteger("0"));
        memo.add(new BigInteger("2"));
        memo.add(new BigInteger("7"));
        memo.add(new BigInteger("22"));
        
        for (int i = 4; i <= n; ++i) {
            memo.add(memo.get(i - 1).multiply(new BigInteger("3")).add(memo.get(i - 2)).subtract(memo.get(i - 3)));
        }

        System.out.println(memo.get(n).remainder(MOD));
    }
}