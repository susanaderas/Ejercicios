/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1e6;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class P1E6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        double H, CO, CA;
        Scanner In= new Scanner(System.in);
        System.out.println("Ingrese un cateto: ");
        CO=In.nextInt();
        System.out.println("Ingrese el otro cateto: ");
        CA=In.nextInt();
        
        H=Math.sqrt((CO*CO)+(CA*CA));
        System.out.println("La hipotenusa es: "+H);
    }  
}
