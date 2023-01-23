/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jarukrit
 */
import java.util.Scanner;

public class BankProg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your money : ");
        double deposit = sc.nextDouble(), total = 0;
        System.out.print("Input your account type(Please type A B C or X in uppercase : ");
        char accountType = sc.next().charAt(0);
        // They haven't yet reach this point.
        /*
        switch (accountType) {
            case 'A': case 'C':
                total = deposit * 1.015;
                break;
            case 'B':
                total = deposit * 1.02;
                break;
            case 'X':
                total = deposit * 1.05;
                break;
        }
        */
        if ((accountType == 'A') || (accountType == 'C')) {
            total = deposit * 1.015;
        }
        else if (accountType == 'B') {
            total = deposit * 1.02;
        }
        else if (accountType == 'X') {
            total = deposit * 1.05;

        }
        System.out.println("Your total money in one year = " + (int) total);
    }
}
