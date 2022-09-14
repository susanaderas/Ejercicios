/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3e3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class P3E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Sus = new Scanner (System.in);
        int contador;
        int fin;
        
        System.out.print("Por favor ingrese el valor inicial (Contador)");
        contador = Sus.nextInt(); 
        System.out.print("Por favor ingrese el valor final");
        fin = Sus.nextInt(); 
        
        while (contador<=fin)
        {
            System.out.print("Valor actual de la iteración"+contador+"\n");
            contador++;
        }
    }
    
}
