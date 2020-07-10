package vectoresbasico;

public class LibretaBasica {
    String nombres[] = new String[11];
    boolean bandera, bandera2 = true;

	public void agregarAlibreta(String nom, int lugar) {
           
                if(bandera == false){this.nombres[lugar] = nom; }
                
                if(bandera== true){
                    System.out.println("no se pudo agregar el nombre");
                    return;
                }    
                
	}
	
        public void validacion(String nombre){
            for(int i = 1;i<=10;i++){
                if(nombre.equals(nombres[i])){
                    System.out.println("¡nombre invalido!");
                     System.out.println("");
                    bandera = true;         
                }
            }
        } 
        public void libretaCompleta(){
            int cant = 0;
            
            for(int i=1;i<=10;i++){
                String aux = nombres[i];
                int aux1 = aux.length();
                String aux2 ="";
                 //System.out.println("ahora en la pos "+i+" la longitud es: "+aux1);
                if(aux2.equals(aux) && aux1 == cant ){
                    bandera2 = true;
                }else{bandera2= false;}
            }
        }
        
        
	public void listarLibreta(){
		for(int i = 1;i<=10;i++) {
                    if(nombres[i] == null){
                        nombres[i]= "";
                    } 
			System.out.println(i+") --> "+ nombres[i]);
                }
                bandera = false;
                if(bandera2 == false){
                    System.out .println("libreta llena");
                    System.out.println("");
                }else if(bandera2 == true){System.out.println("hay espacio en la libreta");System.out.println("");}
               
        }
                   
                 
	
        public void eliminarNombre(String B){
           for(int i = 1;i <= 10;i++){
                if(B.equals(nombres[i])){
                    nombres[i] = "";
                }
           }
         
        } 
        public void eliminarPosicion(int dos){
            nombres[dos]= "";
        }
         
        
}
