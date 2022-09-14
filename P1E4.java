/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1e4;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class P1E4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner IN= new Scanner (System.in);
        System.out.println("Ingrese la base: ");
        double base = IN.nextDouble();
        System.out.println("Ingrese el exponente: ");
        double exponente = IN.nextDouble();
        double result = Math.pow(base, exponente);
        System.out.println("el resultado es: " + result);
    }
  
}
