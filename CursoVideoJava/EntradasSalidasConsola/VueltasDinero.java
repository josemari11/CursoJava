//Ejecutar desde la linea de comandos de msdos
//ejemplo para ejecutar --- 
//c:\PruebasJava> java Vueltas 1372.3 2000

//*****************NoFound*************************
public class VueltasDinero {

	public static void main(String[] args) {
		double precio, pago, vuelta;
		int valorCentimos;
		//Lee el primer argumento de la línea de comandos
		//para obtener el precio
		precio=Double.parseDouble(args[0]);//1372.3
		//Lee el segundo argumento de la línea de comandos
		//para obtener el pago
		pago=Double.parseDouble(args[1]);//2000
		vuelta=pago-precio;
		valorCentimos=(int)(vuelta*100);
		System.out.println("Vuelta en euros " + vuelta);
		System.out.println("Vuelta en céntimos " + valorCentimos);
		System.out.println(valorCentimos/200 + " de dos euros");
		valorCentimos%=200;
		
		System.out.println(valorCentimos/100 + " de un euros");
		valorCentimos%=100;
		
		System.out.println(valorCentimos/20 + " de 20 centimos");
		valorCentimos%=20;
		
		System.out.println(valorCentimos/10 + " de 10 centimos");
		valorCentimos%=10;
		
		System.out.println(valorCentimos/5 + " de 5 centimos");
		valorCentimos%=5;
		
		System.out.println(valorCentimos/2 + " de 2 centimos");
		valorCentimos%=2;
		
		System.out.println(valorCentimos/1 + " de 1 centimo");
		
		
		
		
		

	}

}
