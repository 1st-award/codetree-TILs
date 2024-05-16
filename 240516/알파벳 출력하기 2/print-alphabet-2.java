import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int alphabet = 'A';

        for (int i = n; i > 0; --i) {
            for (int j = n; j > 0; --j) {
                if (i >= j) {
                    System.out.print((char)alphabet + " ");
                    alphabet += 1;
                    if (alphabet == 'Z' + 1) {
                        alphabet = 'A'; 
                    }
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}