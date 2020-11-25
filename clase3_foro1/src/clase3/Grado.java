
package clase3;
import clase3.Escuela;

public class Grado {

    
   
        public String nombre, apellido,nombre2;
        public int dni, num;
        public long num2;


        //constructor
        public Grado(String nombre, String nombre2,String apellido, int dni){
            this.nombre = nombre;
            this.apellido = apellido;
            this.nombre2 = nombre2;
            this.dni = dni;
            
        }
        public Grado(int num, long num2){
        this.num = num;
        this.num2 = num2;
        }
         
        public String toString(){
            return ("Nombre: "+nombre+" Nombre: "+nombre2+" Apellido: "+apellido+" Dni: "+dni);
        }
       
       Escuela miEscuela = new Escuela(15,20);
        
         Grado grados = (Grado) miEscuela;
         
       
}
