/*2) Dise�ar una funci�n que calcule el �rea y otra que calcule el per�metro de una circunferencia.
Utiliza esas funciones en un programa principal que lea el radio de una circunferencia y muestre
su �rea y per�metro.*/
package MetodosDiciembreClase.Ejer2;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creamos el objeto
		Calculos Calculo1 = new Calculos();
		Calculo1.lee();
		Calculo1.calculaArea();
		Calculo1.imprimeArea();
		Calculo1.calculaPerimetro();
		Calculo1.imprimePerimetro();
	}

}
