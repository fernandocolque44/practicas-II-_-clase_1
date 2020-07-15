
package login__vector;

import java.util.Scanner;

public class Login__vector {
// trabajo programacion II foro 2 clase 2 ejercicio 2

    public static void main(String[] args) {
             Scanner leer = new Scanner(System.in);
        String [] user ={"daiana","facundo","osvaldo","melina"};
        int [] pass ={1234,4321,1122,3344};
        String A;
        int B,i,p;
        boolean bandera,bandera2;
      
        System.out.print("ingrese usuario: ");
        A =leer.nextLine();
        System.out.print("ingresa la contraseña: ");
        B = leer.nextInt();
        bandera = false;
        i=0;
        while(bandera==false){
            if(A.equals(user[i])){
                bandera = true;
            }else{i=i+1;}
            
        }
        bandera2=false;
        p=0;
        while(bandera2==false){
            if(B == pass[p]){
                bandera2 = true; 
            }else{p=p+1;}
            
        }
        
        if(bandera== true && bandera2== true){
            System.out.print("bienvenido "+ user[i]);
        }else{System.out.print("usuario o contraseña invalidos");}
     }
}
    
    

