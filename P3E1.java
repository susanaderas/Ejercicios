/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3e1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class P3E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner InS = new Scanner (System.in);
        double not;
        
        System.out.print("Ingresar un valor entre 1 y 10 \n");
        not=InS.nextDouble();
        
        while (not<1 | not>10)
        {
            System.out.print("Lo siento mucho pero el valor proporcionado no es correcto");
            not=InS.nextDouble();
        }
    }
    
}
