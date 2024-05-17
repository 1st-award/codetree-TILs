import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n1Size = sc.nextInt();      int n2Size = sc.nextInt();
        int[] n1Arr = new int[n1Size];  int[] n2Arr = new int[n2Size];

        for (int i = 0; i < n1Size; ++i) {
            n1Arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n2Size; ++i) {
            n2Arr[i] = sc.nextInt();
        }


        boolean allPass = false;
        for (int i = 0; i < n1Size; ++i) {
            boolean isPass = true;

            for (int j = 0; j < n2Size; ++j) {
                if (n1Arr[i + j] != n2Arr[j]) {
                    isPass = false;
                    break;
                }
            }

            if (isPass) {
                allPass = true;
                break;
            }
        }

        System.out.println(allPass ? "Yes" : "No");
    }
}