/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jarukrit
 */
import java.util.Scanner;
public class VAT {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        System.out.println(price + (price * 0.07));
    }
    
}
