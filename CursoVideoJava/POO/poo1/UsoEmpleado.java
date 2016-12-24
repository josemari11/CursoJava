package poo1;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoEmpleado {

	public static void main(String[] args) {
		//Objetos de la clase empleado
		Empleado empleado1=new Empleado("Paco G�mez",85000,1990,12,17);
		Empleado empleado2=new Empleado("Ana L�pez",95000,1995,06,07);
		Empleado empleado3=new Empleado("Mar�a Mart�n",10000,2002,10,30);
		
		empleado1.subeSueldo(5);
		empleado1.subeSueldo(5);
		empleado1.subeSueldo(5);
		
		System.out.println("Nombre: "+empleado1.dameNombre()+ "Sueldo: " +empleado1.dameSueldo()
		+ " Fecha de alta: "+ empleado1.dameFechaContrato());
		
		System.out.println("Nombre: "+empleado2.dameNombre()+ "Sueldo: " +empleado2.dameSueldo()
		+ " Fecha de alta: "+ empleado2.dameFechaContrato());
		
		System.out.println("Nombre: "+empleado3.dameNombre()+ "Sueldo: " +empleado3.dameSueldo()
		+ " Fecha de alta: "+ empleado3.dameFechaContrato());
	}//class UsoEmpleado
		//**********************nos quedamos en 11 minutos
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