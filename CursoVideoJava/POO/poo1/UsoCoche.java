package poo1;

import java.util.Scanner;

public class UsoCoche {

	public static void main(String[] args) {
		//Instanciar  clases, ejemplar de clases Coches
		String asientos;
		Coche c1=new Coche();
		Coche c2=new Coche();
		
		Scanner teclado=new Scanner (System.in);
		
		c2.estableceColor("amarillo");
		
		System.out.println(c2.dimeDatosGenerales());
		System.out.println(c2.dimeColor());
		
		System.out.println("�El vehiculo tiene asientos?");
		c1.configuraAsientos("no");
		System.out.println(c1.dimeAsientos());
		
	}

}
