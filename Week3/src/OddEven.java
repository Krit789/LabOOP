/**
 *
 * @author Jarukrit
 */
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt(), odd = 0, even = 0;
        while (input != -1) {
            if (input % 2 == 1) {
                odd++;
            } else {
                even++;
            }
            input = sc.nextInt();
        }
        System.out.println("Odd number = " + odd + " Even number = " + even);
    }
}
