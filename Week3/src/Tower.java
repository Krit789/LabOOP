/**
 *
 * @author Jarukrit
 */
import java.util.Scanner;
public class Tower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("กรุณาระบุความสูงตึก : ");
        int height = sc.nextInt();
        for (int x = 0; x < height; x++){
            System.out.println("#-#-#-#-#");
        }
    }
}
