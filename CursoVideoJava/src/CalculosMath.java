import java.util.Scanner;

import java.util.Scanner;
public class CalculosMath {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		double x=Math.PI;//Resultado PI
		System.out.println(x);

		double raiz=Math.sqrt(21);//ejecuta raiz cuadrada
		System.out.println(raiz+ "   raiz");
		
		///////////////////////////////////////////////
		
		double num1=5.65;
		int refundicion=(int)Math.round(num1);//Refundicion
		System.out.println(refundicion +"   redondeo");
		
		/////////////////////////////////////////////////
		//Elevar un número
		double base;
		double exponente;
		System.out.print("Por favor indique el número: ");
		base=teclado.nextDouble();
		System.out.print("Por favor indique a que lo quiere elevar: ");
		exponente=teclado.nextDouble();
		
		int result=(int)Math.pow(base, exponente);//elevar a exponente
		System.out.println(result +" resultado de " +(int)Math.rint(base) + " elevado a " + (int)Math.rint(exponente) );
		
		}

}