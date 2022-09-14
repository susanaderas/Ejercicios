/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3e7;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class P3E7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, respuesta;
        String accion;
        Scanner Susana;
        
     do {
          System.out.print("Ingrese el primer numero: ");
          Susana = new Scanner (System.in);
          a=Integer.valueOf(Susana.nextLine());
          System.out.print("Ingrese el segundo numero: ");
          b=Integer.valueOf(Susana.nextLine());
          respuesta= a-b;
          System.out.print(String.valueOf(a)+"+"+String.valueOf(b)+"="+String.valueOf(a+b));
          
           System.out.print("Quieres calcular la suma de otros dos numeros? S/N");
           Scanner teclado = new Scanner (System.in);
           accion=teclado.nextLine();
        
     } while (accion.equals("S") || accion.equals("s"));
    }
    
}
