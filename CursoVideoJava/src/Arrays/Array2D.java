package Arrays;
import java.lang.Math;
//Video 26 java pildoras
public class Array2D {

	public static void main(String[] args) {
			
		double acumulado;
		double interes=0.10;//la iniciamos al l0%
		
		double [][] saldo=new double [6][5];
			for(int i=0;i<6;i++){
				
				//ponemos cero para dejarla fija
				saldo[i][0]=10000;
				acumulado=10000;
				
				//empezamos en 1 porque el una ya esta rellenado
				for (int j=1;j<5;j++){
					acumulado=acumulado+(acumulado*interes);
					saldo[i][j]=acumulado;//llenado primera columna
				}//for2
				
				interes=interes+0.01;//aumentamos el interes en 1%
				
			}//for1
			
			
			for(int z=0;z<6;z++){
				System.out.println();
				
				for(int h=0;h<5;h++){
					System.out.printf("%1.2f", saldo[z][h]);
					System.out.print(" ");
				}//for4
			}//for3
	}

}
