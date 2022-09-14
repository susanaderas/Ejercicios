/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2e4;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class P2E4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner In= new Scanner (System.in);
        int numero;
        System.out.print("Ingrese el numero:");
        
        numero = In.nextInt();
        
        for(int i=1; i<=10; i++)
            {
                 System.out.print(numero+" * "+i+" = "+numero*i+"\n");
            }
    }
    
}
