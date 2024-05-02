import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char coldA = sc.next().charAt(0);
        int tempA = sc.nextInt();

        char coldB = sc.next().charAt(0);
        int tempB = sc.nextInt();

        char coldC = sc.next().charAt(0);
        int tempC = sc.nextInt();
        
        int countA = 0;
        if (coldA == 'Y' && tempA >= 37) countA += 1;
        if (coldB == 'Y' && tempB >= 37) countA += 1;
        if (coldC == 'Y' && tempC >= 37) countA += 1;

        if (countA >= 2) {
            System.out.println('E');
        } else {
            System.out.println('N');
        }
    }
}