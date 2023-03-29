
/**
 *
 * @author Jarukrit
 */
import java.util.Scanner;

public class SimpleTax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble(), tax;
        if (salary > 50000) {
            tax = salary * 0.1;
        } else {
            tax = salary * 0.05;

        }
        System.out.println(tax);
    }
}
