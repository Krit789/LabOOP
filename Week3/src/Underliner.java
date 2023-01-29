/**
 *
 * @author Jarukrit
 */
import java.util.Scanner;

public class Underliner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please insert a number : ");
        int number = sc.nextInt();
        for (int x = 1; x <= number; x++) {
            System.out.print("|");
            if (x % 5 == 0) {
                System.out.print("\n");
            }
        }
    }
}
