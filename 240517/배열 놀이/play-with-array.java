import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < q; ++i) {
            int type = sc.nextInt();

            if (type == 1) {
                int a = sc.nextInt() - 1;
                System.out.println(arr[a]);
            }
            else if (type == 2) {
                int b = sc.nextInt();
                int findIdx = -1;

                for (int j = 0; j < n; ++j) {
                    if (b == arr[j]) {
                        findIdx = j;
                        break;
                    }
                }

                System.out.println(findIdx == -1 ? 0 : findIdx + 1);
            }
            else if (type == 3) {
                int s = sc.nextInt();
                int e = sc.nextInt();

                for (int j = s - 1; j < e; ++j) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
        }
    }
}