
import java.util.Scanner;


public class Login {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner login = new Scanner(System.in);
        String nombre = "enzo", A = "";
        int contra = 1234, B = 0;
        boolean c, d;
        
        System.out.print("ingrese su nombre:");
        A = login.nextLine();
        
        System.out.print("ingrese la contraseña:");
        B = login.nextInt();
        
        if (A == nombre){
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
            System.out.print("usuario y contraseña correctos");
        
        }else{
            System.out.print("usuario o contraseña icorrectos");
        }
        
        
    } 
}
