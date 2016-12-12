package poo1;

import java.util.Scanner;
import javax.swing.*;
public class UsoCoche {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Instanciar  clases, ejemplar de clases Coches
		Coche c1=new Coche();
		Coche c2=new Coche();
		
		System.out.println("Coche c2 ------------");
		c2.estableceColor(JOptionPane.showInputDialog("Introduce Color"));
		System.out.println(c2.dimeDatosGenerales());
		System.out.println(c2.dimeColor());
		
		System.out.println("Coche c1 ------------");
		System.out.println("¿El vehiculo tiene asientos?");
		
		c1.configuraAsientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
		System.out.println(c1.dimeAsientos());
		
		c1.configuraClimatizador(JOptionPane.showInputDialog("¿Tiéne climatizador?"));
		System.out.println(c1.dimeClimatizador());
		
		System.out.println(c1.dimePesoCoche());
		
		System.out.println("El precio final del coche es "+ c1.precioCoche());
	}

}
