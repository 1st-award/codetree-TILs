import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.lang.*;

public class Main {
    /**
    * 
    *
    */
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] result = new int[N - 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N - 1; ++i) {
            result[i] = Integer.parseInt(st.nextToken());
        }

        boolean[] useNumber;
        boolean satisfied;
        int[] number = new int[N];
        for (int firstN = 1; firstN <= N; ++firstN) {
            // 추측하는 수열
            number[0] = firstN;
            for (int idx = 0; idx < N - 1; ++idx) {
                number[idx + 1] = result[idx] - number[idx];
            }
            // 문제 조건에 맞는지 검사
            satisfied = true;
            useNumber = new boolean[N];
            for (int idx = 0; idx < N; ++idx) {
                if(number[idx] < 1 || number[idx] > N) {
                    satisfied = false;
                    break;
                } else {
                    if(useNumber[number[idx] - 1]) {
                        satisfied = false;
                        break;
                    }
                    useNumber[number[idx] - 1] = true;
                }
            }

            if(satisfied) {
                for (int num : number) System.out.print(num + " ");
                System.exit(0);
            }
        }
    }
}