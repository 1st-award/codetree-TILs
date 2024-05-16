import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int zeroIdx = -1;

        for (int i = 0; i < 100; ++i) {
            int n = sc.nextInt();
            arr[i] = n;
            if (n == 0) {
                zeroIdx = i;
                break;
            }
        } 

        int sum = 0;
        for (int i = zeroIdx - 1; i >= zeroIdx - 3; --i) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}