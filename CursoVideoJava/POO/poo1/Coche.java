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
		if(asientosCuero.equalsIgnoreCase("si")){
			this.asientosCuero=true;
		}else{
			this.asientosCuero=false;
		}
	}
	
	public String dimeAsientos(){//
		if(asientosCuero==true){
		return "El coche tiene asientos de cuero.";
	}else{
		return "El coche tiene asientos de serie.";
		}
	}
	
	//cofigurar climatizador
	public void configuraClimatizador(String climatizador){
		if(climatizador.equalsIgnoreCase("si")) {
			this.climatizador=true;
		}else{
			this.climatizador=false;
		}
	}//climatizador set
	
	public String dimeClimatizador(){
		if(climatizador==true){
			return "El coche  incorpora climatizador.";
			
		}else {
			return "El coche lleva aire acondicionado.";
		}
	}//climatizador get
	
	//peso coche GETTER & SETTER no recomendado en la poo
	public String dimePesoCoche(){ 
	int pesoCarroceria=500;//solo se puede ver dentro de este metodo
	pesoTotal=pesoCarroceria+pesoCarroceria;
	//si tiene asientos cuero le sumamos 50Kl
	if(asientosCuero==true){
		pesoTotal+=50;
	}//si tiene cliimatizador le sumamos 20kl
	if(climatizador==true){
		pesoTotal+=20;
	}
		return "El peso del coche es "+pesoTotal;
	}//dimePesoCoche
	
	public int precioCoche(){//getter
		int precioFinal=10000;
		if(asientosCuero==true){
			precioFinal+=2000;
		}
		if(climatizador==true){
			precioFinal+=1500;
		}
		return precioFinal;
	}
}//class coche