
public class Persona {
    
          private String nombre, apellido;
        
      
        public Persona(String nombre, String apellido){
            this.nombre = nombre;
            this.apellido = apellido;
        }
    
        public String getNombre(){
            return nombre;
        }
        public String getApellido(){
            return apellido;
        }
        public void setNombre(){
            this.nombre= nombre;
        }
    
        public void setApellido(){
            this.apellido= apellido;
        }
      
}
