/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
package vectoresconobjetos;

public class Libreta {
	int cantidadRegistros;
	String nombres[];

	public Libreta(int cantidadRegistros) {
		System.out.println("Se ha instanciado una Libreta");
		this.cantidadRegistros = cantidadRegistros;
		nombres = new String[cantidadRegistros];
	}

	public boolean quedaLugar() {
		System.out.println("--quedaLugar() -->[Libreta]");	
 
		boolean respuesta = false;

		for(int i=0 ; i<this.cantidadRegistros ; i++) {

			if(this.nombres[i] == null) {
				respuesta = true;
			}
		}
		System.out.println("<--respuesta "+respuesta+" --[Libreta]");
		return respuesta;
	}
	
	public boolean agregarAlibreta(String nom) {
		System.out.println("--agregarAlibreta(String nom)-->[Libreta]");
		boolean lugar = this.quedaLugar();
		
		if(lugar) {
			int i = -1;
			do {
				i++;
			}while(nombres[i] != null);	
			this.nombres[i] = nom;			
		}

		System.out.println("<--bool lugar --[Libreta]");		
		return lugar;
	}
	
	public void listarLibreta() {
		System.out.println("--listarLibreta() -->[Libreta]");
		for(int i=0;i<cantidadRegistros;i++) {
			System.out.println("--> "+nombres[i]);
		}
	}

}
