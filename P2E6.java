/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2e6;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class P2E6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner InS = new Scanner (System.in);
        int lados;
        System.out.print("Numero de lados");
        lados=InS.nextInt();
        
        switch(lados)
        {
            case 1:
            System.out.print("Es un punto"); 
            break;
            case 2:
            System.out.print("Es linea"); 
             break;
            case 3:
            System.out.print("Triangulo"); 
            break;
            case 4:
            System.out.print("Cuadrilatero");
            break;
            case 5:
            System.out.print("Pentagono");
               break; 
            case 6:
            System.out.print("Hexagono");
            break;
            case 7:
            System.out.print("Heptagono");
               break; 
            case 8:
            System.out.print("Octagono");
            break;
            default:
             System.out.print("No registrada");   
        }
    }
    
}
