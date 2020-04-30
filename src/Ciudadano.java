
public class Ciudadano extends Persona{
    private String provincia;
    private long dni;
   
        
     public Ciudadano(String nombre, String apellido,String provincia, long dni){
         super(nombre,apellido);
         this.provincia = provincia;
         this.dni= dni;
         
         
        }   
   
    public String getProvincia(){
        return provincia;
    }    
        
    public long getDni(){
        return dni;
    }
    public void setProvincia(){
        this.provincia = provincia;
    }
    
    public void setDni(){
        this.dni= dni; 
    }
    
}
