package EstructurasDoWhile;

import java.util.Scanner;

public class ISBN {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		String numIsbn="1234567893";
		int contador=0;
		int suma=0;
		int digito = 0;
		
			//pedimos el isbn
	//System.out.print("Introduzca el ISBN: ");
			//ingresamos el isbn
	//numIsbn= teclado.nextLine();
			//comprobamos que tiene 10 digitos
			int descomposicion= Integer.parseInt(numIsbn);
				while (descomposicion>0){
					descomposicion = descomposicion/10;
					contador++;
				}//while
				//damos o quitamos guiones en el primer argumanto el lo que se sustituye
				//en el segundo el sustituto
				// numIsbn = numIsbn.replaceAll( "", "-" );
				 System.out.println(numIsbn);
			//si tiene 10 digitos continuamos
			 System.out.println(contador);
			if (contador==10){
				for(int i=0;i>=9;i++){
					
					digito = Integer.parseInt( numIsbn.substring( i, +i ) );
					numIsbn= Integer.toString(digito);
	                suma += ((10 - i) * digito);
					System.out.print(digito);
					
			
			
							
				}//for
						
			}//if
			//si no tiene 10 d�gitos damos un error
			else {System.out.println("**************\nIngrese un n�mero de 10 d�gitos.\n****************");
			}//else
				System.out.println("El n�mero " + numIsbn + " tiene " + contador + " d�gitos.");
				System.out.println(digito);
				System.out.println(numIsbn.substring( 0,1 ));
				
	}

}
