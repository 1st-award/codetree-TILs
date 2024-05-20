import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String buffer = "";
        boolean isPass = false;
        int intA = 0;
        int intB = 0;
        for (int i = 0; i < A.length(); ++i) {

            char chr = A.charAt(i);
            if (chr >= '0' && chr <= '9') {
                buffer += A.substring(i, i + 1);
            }
            else {
                isPass = true;
                intA = Integer.parseInt(buffer);
                break;
            }
        }

        if (!isPass) {
            intA = Integer.parseInt(A);
        }

        buffer = "";
        for (int i = 0; i < B.length(); ++i) {

            char chr = B.charAt(i);
            if (chr >= '0' && chr <= '9') {
                buffer += B.substring(i, i + 1);
            }
            else {
                isPass = true;
                intB = Integer.parseInt(buffer);
                break;
            }
        }

        if (!isPass) {
            intB = Integer.parseInt(B);
        }

        System.out.println(intA + intB);
    }
}