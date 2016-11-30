//Números divisibles entre 3 y 7 y enteros entre 100 y 150.
package EstructurasRepetitivas.RepFor;

public class NumEnteros {

	public static void main(String[] args) {
		int suma=0;
		System.out.println("Números divisibles por ");
		System.out.println("3 y 7, entre 100 y 150");
		
		for (int numero=100; numero<150 ; numero++){
			if(numero % 3== 0 && numero % 7== 0){
				System.out.print(numero + " ");
				suma += numero;
			}//if
		}//for
		System.out.println("\nLa suma es: " + suma);

	}

}
