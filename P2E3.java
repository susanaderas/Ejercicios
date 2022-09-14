/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2e3;

/**
 *
 * @author ASUS
 */
public class P2E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int year=1;
        String Branch = "CSE"; 
        
        
        switch (year)
        {
            case 1:
               {
                  System.out.print("Cursos electivos: Ingles, Calculo");
                  break;
               }
            
            case 2:
               {
                switch (Branch) //switch anidado
                   {
                    case "CSE":
                    case "CCE":
                        System.out.print("Cursos electivos: Machine learning, Big data");
                    break;
                        
                    case "ECE":     
                         System.out.print("Cursos electivos: Programación");
                    break;
                     
                    default:
                    System.out.print("Cursos electivos: Ingenieria de Software");
                    break;                       
                   }
                    
               } 
            default:
            System.out.print("Año incorrecto");
            break;                       
        }
        
    }
    
}
