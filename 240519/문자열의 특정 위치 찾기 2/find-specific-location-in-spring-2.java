import java.util.*;

public class Main {
    private final static int SIZE = 5;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[]{"apple", "banana", "grape", "blueberry", "orange"};
        char chr = sc.next().charAt(0);
        int findStringCnt = 0;

        for (int i = 0; i < SIZE; ++i) {
            if (arr[i].charAt(2) == chr || arr[i].charAt(3) == chr) {
                System.out.println(arr[i]);
                findStringCnt += 1;        
            }
        }

        System.out.println(findStringCnt);
    }
}