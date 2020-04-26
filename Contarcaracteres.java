
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
public class Contarcaracteres {

   
    public static void main(String[] args) {
     Scanner caracter = new Scanner(System.in);
     String var="";
     int num=0;
     
     System.out.print("ingrese una palabra: ");
      var = caracter.nextLine(); 
     num = var.length();
     
     System.out.println("la frase posee "+ num + " caracteres");
     
    }
    
}
