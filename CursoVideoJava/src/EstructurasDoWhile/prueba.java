package EstructurasDoWhile;

import java.util.Scanner;

public class prueba {

	public static void main(String[] args) {
		
		//Scanner teclado= new Scanner(System.in);
		String numIsbn="1234567893";
		int contador=0;
		int suma=0;
		int digito = 0;
		for(int i=0;i>=9;i++){
			
			digito = Integer.parseInt( numIsbn.substring( i, +i ) );
			
            suma += ((10 - i) * digito);
			System.out.print(digito + numIsbn);
			
	
	
					
		}//for
		numIsbn= Integer.toString(digito);
		System.out.println(numIsbn.substring( 0,1 ));
	}

}
