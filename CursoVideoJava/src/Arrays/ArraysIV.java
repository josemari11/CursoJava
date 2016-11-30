package Arrays;

import javax.swing.JOptionPane;

public class ArraysIV {

	public static void main(String[] args) {
		int [] matrizAleatorios=new int[150];
		
		for (int i=0;i<matrizAleatorios.length;i++){
			//random devuelve un decimal
			//por lo que usamos round para redondear
			matrizAleatorios[i]=(int)Math.round(Math.random()*100);
		}
		//buvle for simplificado
		for (int numeros:matrizAleatorios){
			System.out.print(numeros +"-");
		}
	}

}
