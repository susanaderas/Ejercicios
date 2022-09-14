/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3e5;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class P3E5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner SuS= new Scanner (System.in);
        int nota=0, cont=0, cont2=0;
         System.out.print("Ingrese 0 para terminar \n");
     do {
          System.out.print("Ingrese la nota: ");
          nota=SuS.nextInt();
          
          if (nota>=7) 
              {
                  cont=cont+1;
              }
          else if (nota>0)
                  {
                      cont2=cont2+1;
                  }
     } while (nota != 0);
     
     System.out.print("El total de alumnos con ntoas mayores de 7 es: "+cont+"\n");
     System.out.print("El total de alumnos con nota menores a 7 es: "+cont2+"\n");
    }
    
}
