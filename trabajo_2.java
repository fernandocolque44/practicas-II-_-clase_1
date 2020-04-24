
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class trabajo_2 {
    
    public static void main(String[] args){
        Scanner trabajo = new Scanner(System.in);
        
       int numero1 =0,numero2 = 0 , s = 0;
       System.out.print("ingrese un numero: ");
       numero1 = trabajo.nextInt();
       
       System.out.print("ingrese otro numero: ");
       numero2 = trabajo.nextInt();
       
       for (s = numero1 ;s <=( numero2 ) ; s++){
       System.out.println(s);
       }  
    }
}
