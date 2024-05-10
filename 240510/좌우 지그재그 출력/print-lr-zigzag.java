import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;

        for (int i = 0; i < n; ++i) {
            if (i % 2 == 1){
                cnt += n - 1;
            }
            for (int j = 0; j < n; ++j) {
                if (i % 2 == 0) {
                    System.out.print(cnt + " ");
                    cnt += 1;
                }
                else {
                    System.out.print(cnt + " ");
                    cnt -= 1;
                }
            }        
            if (i % 2 == 1){
                cnt += n + 1;
            }
            System.out.println();
        }
    }
}