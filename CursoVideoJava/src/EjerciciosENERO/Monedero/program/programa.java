/*2) Defina una clase 'Monedero' que permita gestionar la cantidad de dinero de que una persona
dispone en un momento dado.
La clase tendr� los siguientes m�todos:
* Constructor com�n: que inicializa el dinero a 0.
* Constructor de inicializaci�n: Donde se indica el dinero que tendr� el monedero. No se puede
indicar un n�mero negativo.
* Constructor de copia.
* meterDinero: M�todo que me permite meter m�s dinero en el monedero.
* sacarDinero: M�todo que me permite sacar dinero. Por supuesto, no se podr� sacar m�s
dinero del que haya en un momento dado en el monedero.
* consultar: M�todo que me devuelve la cantidad de dinero que hay en el monedero.
Para probar el funcionamiento de la clase, escriba un m�todo 'main' con una serie de
instrucciones que hagan uso de los m�todos definidos.*/
package EjerciciosENERO.Monedero.program;

import java.util.Scanner;

import EjerciciosENERO.Monedero.Clase.Monedero;

public class programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);
		Monedero Monedero1 = new Monedero(10000.0);//instanciamos Monedero, la variable apuntar� al objeto que cre�
		
		System.out.println("Elija la operaci�n que desea realizar:\n-------------------------------------"
				+ "\n 1.A�adir dinero.\n--------------------"
				+ "\n 2.Sacar dineron.\n--------------------"
				+ "\n 3.Mostrar saldo.\n--------------------");
		int opcion = tc.nextInt();
		switch(opcion){
			case 1: System.out.println("Suma a introducir: ");
					Monedero1.meterDinero(tc.nextDouble());//pasamos parametro al metodo para sumar  saldo
					System.out.println(Monedero1);
					return;// si acaba, vuelve al main
					
			case 2: System.out.println("extraer saldo: ");
					Monedero1.sacarDinero(tc.nextDouble());//pasamos par�metro al metodo para quitar saldo
					System.out.println(Monedero1);
					return;
					
			case 3:	System.out.println(Monedero1); //Metodo toString 
					return;
					
			default:System.out.println("Ingrese uno de los valores indicados.\nVuelva a reiniciar la aplicai�n Gracias");
		}
			
	
		
	}

}
