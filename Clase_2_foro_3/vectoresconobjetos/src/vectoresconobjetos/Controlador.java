
package vectoresconobjetos;

import vectoresconobjetos.Libreta;


public class Controlador {
    public static void main(String[] args) {

		Libreta miLibretita = new Libreta(3);
 		
		miLibretita.agregarAlibreta("Francisco");
		miLibretita.listarLibreta();
		miLibretita.agregarAlibreta("Fernando");
		miLibretita.listarLibreta();		
		miLibretita.agregarAlibreta("Macarena");
		miLibretita.listarLibreta();
		miLibretita.agregarAlibreta("Pedro");
		miLibretita.listarLibreta();/**/		

	}
}
