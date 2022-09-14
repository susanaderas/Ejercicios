/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1e7;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class P1E7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner entrada = new Scanner (System.in);

        String nombre, clave;
        
         System.out.print("Ingrese nombre de usuario: ");
         nombre=entrada.nextLine();
         System.out.print("Ingrese clave de usuario: ");
         clave=entrada.nextLine();
         
         if (nombre.equals("Susana") && clave.equals("Quesito"))
             {
                 System.out.print("Bienvenido al sistema");
             }
         else 
             {
                 System.out.print("Nombre de usuario o contraseña incorrecta");
             }
         
    }
    
}
