
package vector_login;


import java.util.Scanner;
public class Vector_login {

    // clase 2 foro 2 ejercicico 1
    
        public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       String [] arreglo = new String [4];
       for(int i = 0; i<=3;i++){
           System.out.print("ingresa una oración ");
           arreglo[i] =leer.nextLine(); 
       }
     for(int i = 0;i<=3;i++){
         System.out.println(arreglo[i]);
     }          
     
    }
    
}
