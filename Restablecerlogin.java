/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restablecerlogin;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Restablecerlogin {
  public static void main(String[] args) {
        // TODO code application logic here
        Scanner login = new Scanner(System.in);
        String nombre = "enzo", A = "", respuesta= "";
        int contra = 1234, B = 0;
        boolean c, d;
        
        System.out.print("ingrese su nombre:");
        A = login.nextLine();
        
        System.out.print("ingrese la contraseña:");
        B = login.nextInt();
        
        if (A.equals(nombre)){
            c = true;
        }else{
            c= false;
        }
        
        if(B == contra){
            d = true;
        }else{
            d = false;
        }
        
        if ((c == true) && (d == true )){
            System.out.println(" bienvenido, usuario y contraseña correctos");
           
            System.out.print("ingresa la nueva contraseña:");
            contra = login.nextInt();
                
            System.out.print("felicidades, su nueva contraseña es: "+contra);  
           
            
            
        }else{
            System.out.print("usuario o contraseña icorrectos");
        }
        
        
    } 
    
}
