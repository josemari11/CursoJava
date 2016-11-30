
public class EjercicioString {

	public static void main(String[] args) {
	
		String nombre="Jose Mari";
		System.out.println("Mi nombre es " + nombre);
		//Cuenta cuantos carácteres tiene una cadena
		System.out.println("Mi nombre tiene " + nombre.length() + " caracteres");
		//muestra la posición de un caracter
		System.out.println("La primera letra de " + nombre + " es " + nombre.charAt(0));
		
		int ultimaLetra;
		ultimaLetra=nombre.length();
		//Mostramos cual es el último caracter//////////////////////9-1=8 Empieza a contar desde 0
		System.out.println("Y la última letra es la " + nombre.charAt(ultimaLetra-1));
		System.out.println("/////////////////////////////////////////");
		
		//Empeza a contar desde 0 y los carácteres en blanco cuentan
		String frase="Hoy hace un día que te cagas para estar aquí ";
		//Medimos la frase
		int caracteres= frase.length();
		//empieza a contar en lao y el últmo carácter no lo cuenta> 6
		String fraseResumen= frase.substring(0, 12) + "día que " + 
		frase.substring(12, caracteres);
		
		System.out.println(fraseResumen);
		System.out.println("/////////////////////////////////////////");
		
		//Equals
		String alumno1, alumno2;
		alumno1="David";
		alumno2="david";
		System.out.println(alumno1.equals(alumno2));
		System.out.println(alumno1.equalsIgnoreCase(alumno2));
		
		
	}

}
