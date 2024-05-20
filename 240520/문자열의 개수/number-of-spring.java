import java.util.*;

public class Main {
    private final static int SIZE = 100;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[SIZE];

        int totalString = 0;
        int arrIdx = 0;
        boolean print = true;
        while (true) {  
            String str = sc.next();

            if (str.equals("0")) {
                break;
            }

            totalString += 1;
            if (print) {
                arr[arrIdx++] = str;
            }
            print = print ? false : true;
        }

        System.out.println(totalString);
        for (int i = 0; i < arrIdx; ++i) {
            System.out.println(arr[i]);
        }
    }
}