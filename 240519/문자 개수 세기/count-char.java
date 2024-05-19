import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char chr = sc.next().charAt(0);
        int count = 0;

        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == chr) {
                count += 1;
            }
        }

        System.out.println(count);
    }
}