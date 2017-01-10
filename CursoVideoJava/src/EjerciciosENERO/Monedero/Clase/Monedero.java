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
package EjerciciosENERO.Monedero.Clase;
	public class Monedero{
			private double saldoMonedero;
			public Monedero(){	
			}
			//Constructor com�n: que inicializa el dinero a 0.
			//Crear con valor positivo.
			public Monedero(double saldoMonedero){
				if(saldoMonedero > 0){
				this.saldoMonedero = saldoMonedero;
				}
			}
			//metodo para a�adir dinero
			public void meterDinero(double AnnadirSaldo){
				if(AnnadirSaldo > 0){
				this.saldoMonedero = saldoMonedero+AnnadirSaldo;
				}
			}
			//metodo para sacar dinero
			public void sacarDinero(double quitarSaldo){
				if(this.saldoMonedero< quitarSaldo){//No superar el saldo actual	
					System.out.println("No tiene suficiente saldo.");
				}else if(quitarSaldo > 0){//Parametro tiene que ser positivo
					this.saldoMonedero = saldoMonedero - quitarSaldo;  
				}
			}
			public double consultarSaldo(){
				return saldoMonedero;
			}
			//Resumen de la clase
			public String toString() {
				return "Monedero saldo actual " + saldoMonedero+ "�.";
			}
		}
		
