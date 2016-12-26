package poo1;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoEmpleado {

	public static void main(String[] args) {
		/*//Objetos de la clase empleado
		Empleado empleado1=new Empleado("Paco Gómez",85000,1990,12,17);
		Empleado empleado2=new Empleado("Ana López",95000,1995,06,07);
		Empleado empleado3=new Empleado("María Martín",10000,2002,10,30);
		
		empleado1.subeSueldo(5);
		empleado1.subeSueldo(5);
		empleado1.subeSueldo(5);
		
		System.out.println("Nombre: "+empleado1.dameNombre()+ "Sueldo: " +empleado1.dameSueldo()
		+ " Fecha de alta: "+ empleado1.dameFechaContrato());
		
		System.out.println("Nombre: "+empleado2.dameNombre()+ "Sueldo: " +empleado2.dameSueldo()
		+ " Fecha de alta: "+ empleado2.dameFechaContrato());
		
		System.out.println("Nombre: "+empleado3.dameNombre()+ "Sueldo: " +empleado3.dameSueldo()
		+ " Fecha de alta: "+ empleado3.dameFechaContrato());*/
		//Otra forma de hacerlo con arrays
		Empleado[] misEmpleados= new Empleado[3];
		misEmpleados[0]=new Empleado("Paco Gómez",85000,1990,12,17);
		misEmpleados[1]=new Empleado("Ana López",95000,1995,06,07);
		misEmpleados[2]=new Empleado("María Martín",10000,2002,10,30);
			/*for(int i=0;i<3;i++){
				misEmpleados[i].subeSueldo(5);
			}*/
		//Bucle for mejorado
		for(Empleado e: misEmpleados){
			e.subeSueldo(5);
		}
			/*for(int i=0;i<3;i++){
				System.out.println("Nombre; "+ misEmpleados[i].dameNombre()+ " Sueldo; "+misEmpleados[i].dameSueldo()+
						" Fecha de Alta: "+ misEmpleados[i].dameFechaContrato());
			}*/
		//Bucle for mejorado
		for(Empleado e: misEmpleados){
			System.out.println("Nombre; "+e.dameNombre()+ " Sueldo; "+ e.dameSueldo()+
					" Fecha de Alta: "+ e.dameFechaContrato());
			
		}
		
		
	}//class UsoEmpleado
		
	
		
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