/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinmultiplos;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Sinmultiplos {


    public static void main(String[]args){
        Scanner numeros = new Scanner(System.in);
        int num = 0, num2 = 0 ,num3=0, s = 0;
    
         System.out.print("ingrese un numero: ");
         num = numeros.nextInt();
         
         System.out.print("ingrese otro numero:");
         num2 = numeros.nextInt();

         System.out.print("igrese un tercer numero.");
         num3 = numeros.nextInt();
        if(num > num2){
         
            for(s =num2;s<= num; s++){
                if((s % 5 != 0)&&(s%num3 !=0) ){
                    System.out.print(s+", ");
                }else{
                    s = s;
                }
            }
        }
        if(num < num2){
            for( s= num;s <=num2;s++){
                if((s % 5 !=0)&&(s % num3 !=0)){
                    System.out.print(s+", ");
                }else{
                    s = s;
                }
            }     
        }
    
    }
    
}
