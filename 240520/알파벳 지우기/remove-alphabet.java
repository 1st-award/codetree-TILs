import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        char[] bufferA = new char[A.length()];
        char[] bufferB = new char[B.length()];
        int idxA = 0;
        int idxB = 0;

        for (int i = 0; i < A.length(); ++i) {
            char chr = A.charAt(i);

            if (chr >= '0' && chr <= '9') {
                bufferA[idxA++] = chr;
            }
        }

        for (int i = 0; i < B.length(); ++i) {
            char chr = B.charAt(i);

            if (chr >= '0' && chr <= '9') {
                bufferB[idxB++] = chr;
            }
        }

        String strA = String.valueOf(bufferA);
        String strB = String.valueOf(bufferB);
        strA = strA.substring(0, idxA);
        strB = strB.substring(0, idxB);
        int intA = Integer.parseInt(strA);
        int intB = Integer.parseInt(strB);

        System.out.println(intA + intB);
    }
}