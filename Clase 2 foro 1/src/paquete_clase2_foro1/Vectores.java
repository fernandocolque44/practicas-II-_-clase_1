
package paquete_clase2_foro1;

import java.util.Scanner;


public class Vectores {
// clase 2 foro 1
  
  
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int[] arreglo ;
        int a, aux;
        boolean bandera,bandera2;
        arreglo = new int [5];
        for (int i = 0;i <= 4; i++){
           System.out.print("ingresa un número ");
            a = ar.nextInt();
            if(a % 7 == 0) {
            i = i -1;
            System.out.println("el número "+a+ " es multiplo de 7, no es valido");
            }
            if(a%7 != 0){
               arreglo[i]= a;
            }   
        }
        for(int z =0;z<=4;z++){
            System.out.println(arreglo[z]);}  
      
       do{ 
          bandera = false;
<<<<<<< HEAD

                for(int x =0; x < arreglo.length -1;x++){
                    if(arreglo[x] > arreglo[x+1]){ 
                        aux = arreglo[x];
                        arreglo[x]= arreglo[x+1];
                        arreglo[x+1]= aux;
                        bandera = true;
                    }   
              }
        }while(bandera == true);
=======
            for(int x =0; x < arreglo.length -1;x++){
                if(arreglo[x] > arreglo[x+1]){ 
                    aux = arreglo[x];
                    arreglo[x]= arreglo[x+1];
                    arreglo[x+1] = aux;
                    bandera = true;
                }   
            }
        }while(bandera);
>>>>>>> a8005cf88e8939f5acd5921057442778a933da58
       System.out.println("_____________");
        for(int i =0;i<=4;i++){
            System.out.println(arreglo[i]);}     
    }
} 
