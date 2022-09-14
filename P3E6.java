/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3e6;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class P3E6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Contraseña
         Scanner Susa = new Scanner (System.in);
        int pass;
        
     do {
          System.out.print("Ingrese su pin: \n");
          pass=Susa.nextInt();
          
          if (pass != 1903) 
              {
                  System.out.print("La contraseña no es válida \n");
              }
     } while (pass != 1903);
    }
    
}
