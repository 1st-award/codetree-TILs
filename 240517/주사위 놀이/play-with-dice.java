import java.util.*;

public class Main {
    private final static int TRY_SIZE = 10;
    private final static int DICE_SIZE = 7;

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] diceCount = new int[DICE_SIZE];

        for (int i = 0; i < TRY_SIZE; ++i) {
            diceCount[sc.nextInt()] += 1;
        }

        for (int i = 1; i < DICE_SIZE; ++i) {
            System.out.println(i + " - " + diceCount[i]);
        }
    }
}