/*4) Realizar un programa de ordenador que pida el n�mero de horas trabajadas durante la
semana, y el precio al que se le paga la hora. Entonces, el programa debe calcular el sueldo
bruto, y a partir de �ste los impuestos, para finalmente obtener el sueldo neto.
Condiciones:
Las horas que sobrepasen de 35 las cobra un 50% m�s caras.
Empieza a pagar impuestos a partir de 250 euros reales.
De pagar impuestos, paga el 20% si no sobrepasa los 300 euros. A partir de 300 paga el 30%.
*/
package MetodosDiciembreClase.Ejer4;

import java.util.Scanner;

public class CalculoHoras {

	private Scanner tc;
	private String dia[]={"lunes","martes","miercoles","jueves","viernes"};
	private double horas;
	private int totalHoras;
	private final double PRECIO_HORA=12;
	private double sueldoBruto;
	private double sueldoNeto;
	//Extras
	private final int MAX_HORAS_CONVENIO=35;//M�ximo de horas normales
	private double horasExtra;//total dinero
	private double numeroExtras;//numeros horas extras
	private final double PAGO_HORA_EXTRA=0.5;//50% cobra de m�s
	//Impuestos
	private final int BASE_MINIMA_IMPUESTOS=250;//comienza a pagar impuestos a partir de 250 pagando el 20%
	private final double PAGA_IMPUESTOS_MIN=0.2;//paga el 20% de impuestos
	private final int IMPUESTO_SUP=300;//si sobreapasa los 300 paga el 30%
	private final double PAGA_IMPUESTOS_MAX=0.3;// paga el 30%
	private String tipoImpuesto;
	
	//M�todo constructor
	public CalculoHoras(){
		tc=new Scanner(System.in);
	}
	
	//M�todos
	public void PedirHoras(){
		for(int i=0;i<5;i++){
			System.out.println("Ingrese las horas del "+ dia[i]);
			horas=tc.nextDouble();
			totalHoras+=horas;//acumulamos las horas
		}//for
	}
	
	public void LeerTotalHoras(){
		System.out.println("El n�mero total de horas esta semana es de "+ totalHoras );
	}
	//Horas>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	public void HorasExtras(){
		if(totalHoras<=MAX_HORAS_CONVENIO){
			//Calculamos el sueldo bruto si no se rebasa las 35 horas
			sueldoBruto=totalHoras*PRECIO_HORA;
		}else{
			//sacamos las horas extras al revasar las 35 horas
			numeroExtras=totalHoras-MAX_HORAS_CONVENIO;
			//Calculamos las horas extra
			horasExtra=(numeroExtras*(PRECIO_HORA+(PRECIO_HORA*PAGO_HORA_EXTRA)));
			//Calculamos las 35 horas semanales
			sueldoBruto=(MAX_HORAS_CONVENIO*PRECIO_HORA)+horasExtra;
		}
	}
	public void LeerSueldoBruto(){
		if(totalHoras<=MAX_HORAS_CONVENIO){
			System.out.println("El total del sueldo bruto es de "+ sueldoBruto +"�  ");
		}else{
			System.out.println("El total del sueldo bruto es de "+ sueldoBruto +"� de los cuales " +
					horasExtra + "� pertenecen a extras, de las "+ numeroExtras + " horas extras de esta semana.");
		}//else
	}
	//IMPUESTOS>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>	
	//comienza a pagar impuestos a partir de 250 pagando el 20%
	public void CobrarImpuestosReducidos(){
		if(sueldoBruto>=BASE_MINIMA_IMPUESTOS && sueldoBruto<IMPUESTO_SUP){
			sueldoNeto=sueldoBruto-(sueldoBruto*PAGA_IMPUESTOS_MIN);
			tipoImpuesto="Ha pagado el 20% de impuestos";
		}
	}
	
	//si llega a los 300 paga el 30%
	public void CobrarImpuestosAmpliado(){
		if(sueldoBruto>=IMPUESTO_SUP){
			sueldoNeto=sueldoBruto-(sueldoBruto*PAGA_IMPUESTOS_MAX);
			tipoImpuesto="Ha pagado el 30% de impuestos";
		}
	}
	
	//Si no paga impuestos
	public void NopagaImpuestos(){
		if(sueldoBruto<BASE_MINIMA_IMPUESTOS){
		sueldoNeto=sueldoBruto;
		tipoImpuesto="En esta ocasi�n no paga impuestos";
		}
	}
		
	//Leer sueldo neto>>>>>>>>>>>>>>>>>>>>>>>>>
	public void LeerSueldoNeto(){
		if(sueldoBruto<BASE_MINIMA_IMPUESTOS){
			System.out.println(">>>>IMPUESTOS - El total del sueldo neto es de "+ sueldoNeto +"�.\n"+tipoImpuesto);
		}else{
			System.out.println(">>>>IMPUESTOS - El total del sueldo Neto es de "+ sueldoNeto + "� de los cuales " +
					(sueldoBruto-sueldoNeto) + "� son impuestos.\n"+ tipoImpuesto );
		}//else
	}
	
}
