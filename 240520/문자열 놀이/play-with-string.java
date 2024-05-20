import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int q = sc.nextInt();

        for (int i = 0; i < q; ++i) {
            int type = sc.nextInt();

            if (type == 1) {
                int a = sc.nextInt() - 1;
                int b = sc.nextInt() - 1;

                char[] sArr = s.toCharArray();
                char temp = sArr[a];
                sArr[a] = sArr[b];
                sArr[b] = temp;
                s = String.valueOf(sArr);

                System.out.println(s);
            }
            else {
                char a = sc.next().charAt(0);
                char b = sc.next().charAt(0);

                char[] sArr = s.toCharArray();
                for (int j = 0; j < sArr.length; ++j) {
                    if (sArr[j] == a) {
                        sArr[j] = b;
                    }
                }
                s = String.valueOf(sArr);

                System.out.println(s);
            }
        }
    }
}