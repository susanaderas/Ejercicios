/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2e5;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class P2E5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner InS = new Scanner (System.in);
        int suma=0, num;
        double promedio;
        
        for(int i=1; i<=5; i++)
            {
                 System.out.print("Ingresar el numero "+i);
                 num=InS.nextInt();
                 suma=suma+num;
            }
        promedio=suma/5;
        System.out.print("El promedio es:"+promedio);
        
    }
    
}
