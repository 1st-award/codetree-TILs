import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int ageA = sc.nextInt();
        char genderA = sc.next().charAt(0);
        int ageB = sc.nextInt();
        char genderB = sc.next().charAt(0);

        if ((ageA >= 19 && genderA == 'M') || (ageB >= 19 && genderB == 'M')) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}