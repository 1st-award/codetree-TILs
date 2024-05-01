public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int a = 5, b = 6, c = 7;
        int tempA = a, tempB = b, tempC = c;

        b = tempA;
        c = tempB;
        a = tempC;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}