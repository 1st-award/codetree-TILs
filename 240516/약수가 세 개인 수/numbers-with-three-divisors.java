import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int yaksu_sum = 0;

        for (int i = start; i <= end; ++i) {
            int tmp_cnt = 1;

            for (int j = 1; j < i; ++j) {
                if (i % j == 0) {
                    tmp_cnt += 1;
                }
            } 

            if (tmp_cnt == 3) {
                yaksu_sum += 1;
            }
        }

        System.out.println(yaksu_sum);
    }
}