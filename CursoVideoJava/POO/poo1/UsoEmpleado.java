package poo1;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoEmpleado {

	/*public static void main(String[] args) {
	}//class UsoEmpleado*/

}//void
//Metodo constructor
	class Empleado{
		public Empleado(String nom, double sue, int anno, int mes, int dia){
			nombre=nom;
			sueldo=sue;
			GregorianCalendar calendario=new GregorianCalendar(anno,mes-1,dia);//al empezar en cero hay que restar 1
			altaContrato=calendario.getTime();
		}
	
	
	public String dameNombre(){//getter
		return nombre;
	}
	
	public double dameSueldo(){//getter
		return sueldo;
	}
	
	public Date dameFechaContrato(){//getter
		return altaContrato;
	}
	public void subeSueldo(double porcentaje){
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
	
	
}//class Empleado