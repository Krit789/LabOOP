
/**
 *
 * @author Jarukrit
 */
import java.util.Scanner;

public class ComputerOrder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 375.99;
        System.out.println("Please enter your monitor size (only 38 or 42)");
        int screenSize = sc.nextInt();
        System.out.println("Do you want DVD-ROM? (1 is Yes / 0 is No)");
        int opticalDrive = sc.nextInt();
        System.out.println("Do you want printer? (1 is Yes / 0 is No)");
        int printer = sc.nextInt();
        System.out.println("======= Your order =======");
        System.out.println("* Computer >>> $375.99");
        if (screenSize == 38) {
            System.out.println("* 38' Monitor >>> $75.99");
            total += 75.99;
        } else if (screenSize == 43) {
            System.out.println("* 43' Monitor >>> $99.99");
            total += 99.99;
        }
        if (opticalDrive == 1) {
            System.out.println("* DVD-ROM >>> $65.99");
            total += 65.99;
        }
        if (printer == 1) {
            System.out.println("* Printer >>> $125.00");
            total += 125.00;
        }
        System.out.println("======= Total price >>> $" + total + " =======");
    }
}
