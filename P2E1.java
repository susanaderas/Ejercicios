/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2e1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class P2E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner In = new Scanner (System.in);
         int num1, num2, resultado, opcion;
         
        System.out.print("Ingrese el primer numero: ");
        num1 = In.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = In.nextInt();
        
        System.out.print(" Menú de opciones \n");
        System.out.print("Para sumar, digite 1 \n");
        System.out.print("Para restar, digite 2 \n");
        System.out.print("Para elevarlos al cuadrado, digite 3 \n");
        System.out.print("Para multiplircarlos, digite 4 \n");
        opcion = In.nextInt();
        
        switch (opcion)
        {
            case 1:
               {
                   resultado = num1 + num2;
                   System.out.print("La suma es: "+resultado);
                   break;
               }
            
            case 2:
               {
                   resultado = num1 - num2;
                   System.out.print("La resta es: "+resultado);
                   break;
               } 
            case 3:
               {
                   System.out.print("El resultado de elevar al cuadrado "+num1+" es: "+ Math.pow(num1,2)+"\n");
                   System.out.print("El resultado de elevar al cuadrado "+num2+" es: "+ Math.pow(num2,2));
                   break;
               }
            case 4:
               {
                   resultado = num1*num2;
                   System.out.print("El resultado de la multiplicación es:" +resultado);
                   break;
               }
              
            default:
                {
                 System.out.print("Seleccione una opción correcta");
                 break;
               }
        }
    }
    
}
