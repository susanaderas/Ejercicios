/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1e5;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class P1E5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    int n1, n2, n3;
        Scanner In= new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        n1=In.nextInt();
        System.out.println("Ingrese un numero: ");
        n2=In.nextInt();
        System.out.println("Ingrese un numero: ");
        n3=In.nextInt();
        
        if((n1>n2)&&(n2>n3)){ 
            System.out.println("El orden desendente es: "+n1+" , "+n2+" y "+n3);
            }
        if((n1>n3)&&(n3>n2)){
            System.out.println("El orden desendente es: "+n1+" , "+n3+" y "+n2);
            }
        if((n2>n1)&&(n1>n3)){
            System.out.println("El orden desendente es: "+n2+" , "+n1+" y "+n3);
            }
        if((n2>n3)&&(n3>n1)){
            System.out.println("El orden desendente es: "+n2+" , "+n3+" y "+n1);
            }
        if((n3>n2)&&(n2>n1)){
            System.out.println("El orden desendente es: "+n3+" , "+n2+" y "+n1);
            }
        if((n3>n1)&&(n1>n2)){
        System.out.println("El orden desendente es: "+n3+" , "+n1+" y "+n2);    
        }
        
    }
    
}
