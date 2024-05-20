import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int chr1AsciiCode = (int)sc.next().charAt(0);
        int chr2AsciiCode = (int)sc.next().charAt(0);

        int sum = chr1AsciiCode + chr2AsciiCode;
        int minus;
        if (chr1AsciiCode > chr2AsciiCode) {
            minus = chr1AsciiCode - chr2AsciiCode;
        }
        else {
            minus = chr2AsciiCode - chr1AsciiCode;
        }
        System.out.println(sum + " " + minus);
    }
}