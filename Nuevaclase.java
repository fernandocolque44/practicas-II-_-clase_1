
import java.util.Scanner;

//trabajo 4
public class Nuevaclase {
    public static void main(String[]args){
        Scanner numeros = new Scanner(System.in);
        int num = 0, num2 = 0 , s = 0;
    
         System.out.print("ingrese un numero: ");
         num = numeros.nextInt();
         
         System.out.print("ingrese otro numero:");
         num2 = numeros.nextInt();
         
        if(num > num2){
         
            for(s =num2;s<= num; s++){
                if((s % 5) != 0){
                    System.out.print(s +", ");
                }else{
                    s = s;
                }
            }
        }
        if(num < num2){
            for( s= num;s <=num2;s++){
                if((s%5)!=0){
                    System.out.print(s +", " );
                }else{
                    s = s;
                }
            }     
        }
    
    }
    
}
