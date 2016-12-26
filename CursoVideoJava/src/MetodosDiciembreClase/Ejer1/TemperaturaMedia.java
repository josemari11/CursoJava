/*1)Crear una funci�n que calcule la temperatura media de un d�a a partir de la temperatura
m�xima y m�nima. Crear un programa principal, que utilizando la funci�n anterior, vaya pidiendo
la temperatura m�xima y m�nima de cada d�a y vaya mostrando la media.*/
package MetodosDiciembreClase.Ejer1;

public class TemperaturaMedia {
	private String dia;
	private double temperaturaMin;
	private double temperaturaMax;
	
	//Metodo constructor
	public double TemperaturaMedia(){
		return (temperaturaMin+temperaturaMax)/2;
	
	}


	public String getDia() {
		return dia;
	}


	public void setDia(String dia) {
		this.dia = dia;
	}


	public double getTemperaturaMin() {
		return temperaturaMin;
	}

	public void setTemperaturaMin(double temperaturaMin) {
		this.temperaturaMin = temperaturaMin;
	}

	public double getTemperaturaMax() {
		return temperaturaMax;
	}

	public void setTemperaturaMax(double temperaturaMax) {
		this.temperaturaMax = temperaturaMax;
	}
}
