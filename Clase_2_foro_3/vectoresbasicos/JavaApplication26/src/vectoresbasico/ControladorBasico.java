package vectoresbasico;

import java.util.Scanner;

public class ControladorBasico {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int entrada;
        
        
        LibretaBasica miLibreta = new LibretaBasica();
        
        do{ 
            
            System.out.println("¿que accion desea realizar?");
            System.out.println("1- ingresar nombres a la lista ");
            System.out.println("2- eliminar registro de la lista por nombre");
            System.out.println("3- eliminar regitro de la lista por posición");
            System.out.println("4- mostrar lista");
            System.out.println("0- salir");
            System.out.println("");
            System.out.println("");
            entrada = teclado.nextInt();
            

            if(entrada == 1){
                System.out.print("ingresa el nombre: ");
                
                 //teclado.nextLine();
                String A = teclado.next();
          
                System.out.print("ingrese el numero de posicion: ");
                 int uno = teclado.nextInt();
                        miLibreta.validacion(A);
                        miLibreta.agregarAlibreta( A, uno);
                        
                     
                        miLibreta.listarLibreta();
                        miLibreta.libretaCompleta();
                        
            }
            if(entrada == 2){
                
                System.out.print("ingesa el nombre a eliminar :");
              
               String B = teclado.next();
               miLibreta.eliminarNombre(B);
               miLibreta.libretaCompleta();
               miLibreta.listarLibreta();
               
                    

            }
            if(entrada == 3) {
                System.out.println("ingrese el numero de posición");
                int dos = teclado.nextInt();
                miLibreta.eliminarPosicion(dos);
                miLibreta.libretaCompleta();
                miLibreta.listarLibreta();
            
            }
            if(entrada == 4 ){
                miLibreta.libretaCompleta();
                miLibreta.listarLibreta();
            }
        }while(entrada != 0);
           teclado.close();
            
    }

    
}
