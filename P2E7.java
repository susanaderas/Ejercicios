/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2e7;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class P2E7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner InS = new Scanner (System.in);
        int fact=1;
        int num=0;
        System.out.print("Introduce numero");
        num=InS.nextInt();
        
        for(int ind=1; ind<=num; ind++)
        {
            fact*=ind;
        }  
         System.out.print("El factorial es: "+fact);
        
    }
    
}
