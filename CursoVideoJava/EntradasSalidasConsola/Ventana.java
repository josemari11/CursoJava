import javax.swing.*;
public class Ventana {

	public static void main(String[] args) {
		String nombreUsuario=JOptionPane.showInputDialog("Introduce tu nombre de usuario");
		String edad= JOptionPane.showInputDialog("Introduce la edad, por favor");
		//creamos una variable edadUsuario
		//para cambiar el string a int ya que showInputDialog solo coge cadenas
		int edadUsuario=Integer.parseInt(edad);
		edadUsuario++;
		System.out.println("Hola " + nombreUsuario + "el año que viene tendras " + edadUsuario +" años.");
	
		
		String num1=JOptionPane.showInputDialog("Introduzca un numero");
		//Pasamos el strin adouble ya que hemos recogido un string
		double num2=Double.parseDouble(num1);
		System.out.print("La raíz de " + num2 + " es " );
		System.out.printf("%1.2f", Math.sqrt(num2));
	
	}
	

}
