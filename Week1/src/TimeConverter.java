/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jarukrit
 */
import java.util.Scanner;

public class TimeConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hours : ");
        int hours = sc.nextInt();
        System.out.print("Mins : ");
        int mins = sc.nextInt();
        int secs = ((hours * 60) + mins) * 60;
        System.out.println("Secs = " + secs);
    }
}
