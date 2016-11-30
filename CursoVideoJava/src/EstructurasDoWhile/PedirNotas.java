package EstructurasDoWhile;

import java.util.Scanner;

/* Lea Una Secuencia de notas Que se van introduciendo por el teclado 
 * (Las notas S�ran Valores Num�ricos Que pueden Contener Decimales).
 * La Secuencia de notas finalizar� Cuando Se introduzca negativo valor de las notas.
 * El Programa informar� Al final del N�mero de aprobados,
 * El N�mero de suspensos y la nota media. El Programa debera Controlar los
 * Posibles Errores Que se puedan Producir un La hora de introducir las notas 
 * Por teclado de tal forma Que Si Alguna nota introducida 
 * Fuera erronea La Vuelva a Solicitar. */
 public class PedirNotas {

	public static void main(String[] args) {
		// Generada autom�ticamente TODO Stub
		// Creammos La Clase teclado
		Scanner teclado = new  Scanner ( System.in);
		// Definimos las variables
		double nota=0;
		int contador=0;
		double resultado=0;
		int aprobados=0;
		int suspensos=0;
		do {
		// Pedimos las notas
		System.out.println( " Introducir nota: (ingrese un n�mero negativo para terminar)" );
		// Ingresamos las notas
		nota=teclado.nextDouble();
			//Comprobamos que la nota es correcta
			
			if (nota<=10 && nota>=5){
			resultado=nota+resultado;
			contador++;
			aprobados++;
			}//if
			else if(nota<5 && nota>=0){
			resultado=nota+resultado;
			contador++;
			suspensos++;
			}//else if
			else{
				System.out.println("Introduzca una nota correcta entre 0 y 10 puntos");
			}
		}//do
		while(nota>=0);
		System.out.println( "La nota media es  " + (resultado/contador));
		System.out.println( "El total de aprobados es de " + aprobados);
		System.out.println( "El total de suspensos es de " + suspensos);
		
	}//main

}//class