import java.io.*;
public class DameTuNombre {

	public static void main(String arg[])throws Exception{//throws Exception Permite compilar el programa, 
	//las sentencia de entrada requieren de la técnica de control de excepciones
		
		String nombre;
		//Se declaran las variables de refencia
		//de nombre flujo de la clase InputStreamReader
		//y el teclado de la clase BufferReader
		InputStreamReader flujo;
		BufferedReader teclado;
		//Se construyen los objetos flujo y telcado
		flujo= new InputStreamReader (System.in);
		teclado= new BufferedReader(flujo);
		System.out.println("Escribe tu nombre: ");
		nombre=teclado.readLine();
		System.out.println("Tu nombre es " +nombre);
		

	}

}
