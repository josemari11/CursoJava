package poo1;

public class UsoCoche {

	public static void main(String[] args) {
		//Instanciar  clases, ejemplar de clases Coches
		Coche c1=new Coche();
		Coche c2=new Coche();
		
		
		
		c2.estableceColor("amarillo");
		
		System.out.println(c2.dimeDatosGenerales());
		System.out.println(c2.dimeColor());
		
		c1.configuraAsientos("no");
		System.out.println(c1.dimeAsientos());
		
	}

}
