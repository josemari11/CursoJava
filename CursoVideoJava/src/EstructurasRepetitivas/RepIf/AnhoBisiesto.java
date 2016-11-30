package EstructurasRepetitivas.RepIf;
//Comprobar si un año es bisiesto
import java.util.Scanner;

public class AnhoBisiesto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short anho;
		Scanner teclado=new Scanner (System.in);
			System.out.println("Introduce un año a comprobar");
			anho=teclado.nextShort();
			if((anho%4==0 && anho%100!=0) || (anho%400==0))
			{
				System.out.println(anho + " es bisiesto.");
			}
			else{
				System.out.print(anho+ " no es bisiesto.");
			}
			
	}

}
