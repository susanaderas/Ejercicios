/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2e2;

/**
 *
 * @author ASUS
 */
public class P2E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int day=2;
        String dayString;

        switch (day)
        {
            case 1:
               {
                   dayString = "Lunes";
                   System.out.print(dayString);
                   break;
               }
            
            case 2:
               {
                  dayString = "Martes";
                  System.out.print(dayString);
                   break;
               } 
            case 3:
               {
                   dayString = "Miercoles";
                   System.out.print(dayString);
                   break;
               }
            case 4:
               {
                   dayString = "Jueves";
                   System.out.print(dayString);
                   break;
               }
            case 5:
               {
                   dayString = "Viernes";
                   System.out.print(dayString);
                   break;
               }
            case 6:
               {
                   dayString = "Sabado";
                   System.out.print(dayString);
                   break;
               }
            case 7:
               {
                   dayString = "Domingo";
                   System.out.print(dayString);
                   break;
               }
            default:
                {
                 System.out.print("Dia invalido");
                 break;
               }  
        }
        
    }
    
}
