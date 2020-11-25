
package clase3;
import clase3.Grado;

public class Escuela {
    public int uno;
    public int dos;
        
   
     
    public static void main(String[] args) {
       
        
        
        Grado miGrado = new Grado("fernando","nahuel","colque",44011411);
        System.out.println(miGrado);
         
        Grado miGrados = new Grado(23,121);

        float a = (float) miGrados.num;
        System.out.println(a);

        double s = (double)miGrados.num2;
        System.out.println(s);

        System.out.println(miGrados);
   
    
    }  
   public Escuela(int uno, int dos){
        this.uno = uno;
        this.dos = dos; 
    }  

    
}
