/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3e4;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class P3E4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner SuS = new Scanner (System.in);
        int fact=1,n, cont=1;
        
        System.out.print("Ingrese un número:");
        n= SuS.nextInt(); 
       
        do {
            fact=fact*cont;
            cont=cont+1;
        }
        while (cont<=n);
        System.out.print("El factorial es "+fact);
        
  
    }
    
}
