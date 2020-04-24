/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class primerTabajo{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner suma = new Scanner(System.in); 
        System.out.println("ingrese un numero");
       int numero = 0;
       numero = suma.nextInt();
       System.out.println("ingrese otro numero");
       int numero2 = 0;
       numero2 = suma.nextInt();
       
        int resultado = numero + numero2;
       System.out.println("la suma entre "+numero+ " y "+numero2+" es "+resultado);
    }
    
}
