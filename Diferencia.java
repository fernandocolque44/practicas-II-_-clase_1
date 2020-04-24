/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diferencia;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Diferencia {


    public static void main(String[]args){
        Scanner numeros = new Scanner(System.in);
        int num = 0, num2 = 0 ,num3=0, s = 0,max=0, min=0,dif=0;
    
         System.out.print("ingrese un numero: ");
         num = numeros.nextInt();
         
         System.out.print("ingrese otro numero:");
         num2 = numeros.nextInt();

         System.out.print("igrese un tercer numero:");
         num3 = numeros.nextInt();
         
         if (num > num2 ){
             max = num;
             min = num2;
             dif = max -min;
         }else{
             max= num2;
             min = num;
             dif = max- min;
         }
                 
         
        if(dif >= num3){
            
            System.out.println("el numero es admitido");
         
         
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
        } else{
            System.out.print("el numero no es admitido");
        }
    }
    
}
