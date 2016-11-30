package EstructurasDoWhile;
import java.util.*;
public class DoWhile {

	public static void main(String[] args) {
		
		long auxiliar;
		long factorial = 1;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce un número entero");
		long numero= teclado.nextLong ();
		auxiliar=numero;
		//numero factorial = ****** 5 != 1*2*3*4*5=120
		do{
			factorial *= auxiliar;
			auxiliar--;
		}//do
		while (auxiliar > 0);
		System.out.print("El factorial de " + numero);
			if (numero > 0 && numero < 25){
				System.out.println(" es " + factorial);
			}
			else if(numero == 0){
				System.out.println("  es 0");
			}
			
			else{
				System.out.println(" no se puede calcular");
			}

	}

}
