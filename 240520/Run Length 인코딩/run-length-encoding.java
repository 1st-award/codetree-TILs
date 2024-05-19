import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        String encodingString = "";
        int sameCounter = 1;

        for (int i = 1; i <string.length(); ++i) {
            if (string.charAt(i - 1) == string.charAt(i)) {
                sameCounter += 1;
            }
            else {
                encodingString += string.charAt(i - 1) + "" +sameCounter;
                sameCounter = 1;
            }
        }
        encodingString += string.charAt(string.length() - 1) + "" + sameCounter;

        System.out.println(encodingString.length());
        System.out.println(encodingString);
    }
}