
import java.util.Scanner;

public class NewClass {
    
// trabajo 3
    public static void main(String[]args){
        int numero1 = 0 , numero2 = 0, s = 0;
        Scanner trabajo = new Scanner(System.in);
        
        System.out.print("ingrese un numero:");
        numero1 = trabajo.nextInt();
        
        System.out.print("ingrese otro numero:");
        numero2 = trabajo.nextInt();
        
        if (numero1 > numero2 ){
            for(s = numero2 ; numero2 <= numero1 ; s++){
            System.out.println(s);
            }
        }
        if(numero1 < numero2){
            for(s = numero1; numero1 <= numero2; s++){
            System.out.println(s);
            }
        }
    }
    

}
