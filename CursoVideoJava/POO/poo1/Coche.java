package poo1;

public class Coche {
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;
	//características de cada vehiculo que pueden cambiar
	private String color;
	private int pesoTotal;
	private boolean asientosCuero, climatizador;
	
	//crear métodos
	public Coche(){
		ruedas=4;
		largo=3000;
		ancho=1200;
		motor=1600;
		pesoPlataforma=500;
		
	}
	
	
	public String dimeDatosGenerales(){//GETTER
		
		return "La plataforma del vehículo tiene "+ruedas+" ruedas.\n" +
				"Mide "+ largo/1000 + " metros con un ancho de " + ancho +
				"cm y un peso de plataforma de "+pesoPlataforma+"Kl." ;
	}
	
	//configurar color
	public void estableceColor(String colorCoche){//SETTER no devuelve nada, por eso no tiene return
		color=colorCoche;
	}
	
	public String dimeColor(){//GETTER
		return"el color del coche es "+ color;
	}
	//Configurar asientos
	public void configuraAsientos(String asientosCuero){//SETTER
		if(asientosCuero=="si"){
			this.asientosCuero=true;
		}else{
			this.asientosCuero=false;
		}
	}
	
	public String dimeAsientos(){//
		if(asientosCuero==true){
			return "El coche tiene asientos de cuero.";
	}else{
		return "El coche tiene asientos de serie";
		}
	}
}//class coche