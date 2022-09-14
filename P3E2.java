/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3e2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class P3E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner SuS = new Scanner (System.in);
        int valini;
        
        valini=8;
        
        System.out.print("Multiplos de 8 hasta 500");
              
        while (valini<=500)
        {
            System.out.print(valini+"\n");
            valini=valini+8;
        }
    }
    
}
