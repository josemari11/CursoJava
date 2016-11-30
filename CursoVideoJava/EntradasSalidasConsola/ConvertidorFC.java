//La mascarilla  "%5.1f" da formatoa un número de tipo real con al menos 5
//carcacteres de salida y se muestra con un decimal.
public class ConvertidorFC {

	public static void main(String[] args) {
		for(double gradosF=32; gradosF<= 100; gradosF +=10){
			//printf admite mascarillas de dar formato al los datos de salida
			System.out.printf("Grados Fahrenheit: %5.1f = Celsius%5.1f\n",
					gradosF , (gradosF-32)/1.8);
				
		}

	}

}
