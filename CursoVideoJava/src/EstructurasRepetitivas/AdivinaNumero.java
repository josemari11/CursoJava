package EstructurasRepetitivas;
import java.util.*;
public class AdivinaNumero {
	
	public static void main(String[] args) {
		int numero=0;
		int intentos=0;
		int aleatorio=(int)(Math.random()*100);
		Scanner teclado= new Scanner(System.in);
		while (numero!=aleatorio){
			intentos++;
			System.out.println("Introduce un n�mero, por favor");
			numero=teclado.nextInt();
			if(aleatorio<numero){
				System.out.println("M�s bajo");
			}
			else if (aleatorio>numero){
				System.out.println("M�s alto");
				}
			}//while
				
		System.out.println("Has acertado con " + intentos+ " intentos");
		}//main
		
		
	}


