/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class P1E3 {

    public static void main(String[] args) {
        
     Scanner Entrada = new Scanner (System.in);
        int regl;
        double not;
        System.out.println("Cumple las reglas: ");
        System.out.println("Ingrese: \n 1. siempre \n 2. aveces \n 3. nunca");
        regl = Entrada.nextInt();
        System.out.println("que nota obtuvo en el laboratorio: ");
        not = Entrada.nextDouble();
        if (regl == 1){
            if (not >= 8 & not <= 10){
                not = 10;
            }else{
                System.out.println("invalida");
            }
        }else if (regl == 2){
            if (not < 6) {
                not = not + 0.5;
            }else if (not >= 6 & not <8){
                not = not + 0.7;
            }else{
                System.out.println("invalida");
            }
        }else{
            System.out.println("usted debe cumplir las reglas");
        }
        System.out.println("la nueva nota es: "+not);
        
    }
    
}
