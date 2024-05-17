import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char findChar = sc.next().charAt(0);
        char[] string = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};
        int findCharIdx = -1;

        for (int i = 0; i < string.length; ++i) {
            if (findChar == string[i]) {
                findCharIdx = i;
                break;
            }
        }

        System.out.println(findCharIdx == -1 ? "None" : findCharIdx);
    }
}