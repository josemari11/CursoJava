/*1)Crea un programa Java que permita �jugar a adivinar un n�mero� como se expone a
continuaci�n. El programa debe iniciarse indicando �Se ha generado un n�mero aletatorio
entero entre 1 y 100, intente adivinarlo�. El usuario introducir� un n�mero y si el n�mero
aleatorio generado por el ordenador es menor deber� indicarse �No has acertado: el n�mero
es menor. Prueba otra vez�. Si el usuario introduce un n�mero menor que el n�mero
aleatorio deber� indicarse �No has acertado: el n�mero es mayor�.
El programa terminar� cuando el usuario introduzca el n�mero aleatorio que hab�a
escogido el ordenador.
2)*/
package EjerciciosENERO;
//hay que importar la librer�a Random
import java.util.Random;
import java.util.Scanner;


public class AdivinaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //generador de numeros aleatorios
		Scanner tc=new Scanner (System.in);
	    Random generadorAleatorios = new Random();
	    int numero = 0;

	    //genera un numero entre 1 y 100 y lo guarda en la variable numeroAleatorio
	    int numeroAleatorio = 1+generadorAleatorios.nextInt(100);
	    //imprimo el numero en consola
	    System.out.println(numeroAleatorio);
	    System.out.println("ingresa un n�mero del 1 al 100");
	    numero=tc.nextInt();
	    while(numero!= numeroAleatorio){
	    	if(numero<numeroAleatorio){
	    		System.out.println("El n�mero es mayor\nPrueba otra vez");
	    		numero=tc.nextInt();
	    	}
	    	else if(numero>numeroAleatorio){
	    		System.out.println("El n�mero es menor\nPrueba otra vez");
	    		numero=tc.nextInt();	
	    	}
	    }
	    //Salgo del programa con el n�mero acertado
	    System.out.println("Correcto es el "+numeroAleatorio+ "\nVaya a recoger el premio a su puta casa.");

	}
}

