import java.util.*;
public class DameTusDatos {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		System.out.println("Introduce tu nombre: ");
		String nombre= teclado.nextLine();
		System.out.println("introduce tu edad: ");
		String aux= teclado.nextLine();
		int edad = Integer.parseInt(aux);
		System.out.print("Introduce tu estatura: ");
		aux=teclado.nextLine();
		double estatura=Double.parseDouble(aux);
		System.out.println("Tus datos son: ");
		System.out.printf("Nombre:%s\nEdad:%d\nEstatura: %5.2	f" , nombre,edad, estatura);
		

	}

}
