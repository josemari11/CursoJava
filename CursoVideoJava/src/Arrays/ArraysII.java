package Arrays;

public class ArraysII {

	public static void main(String[] args) {
			String [] paises= new String [8];
			paises[0]="Espa�a";
			paises[1]="Mexico";
			paises[2]="Colombia";
			paises[3]="Per�";
			paises[4]="Chile";
			paises[5]="Argentina";
			paises[6]="Ecuador";
			paises[7]="Venezuela";
			int [] numero= {1,2,3,4,5,6,7,8};
			String pais;
			int num;
			
			/*for (int i=0; i<paises.length;i++){
				System.out.println("Pa�s "+ (i+1) +": " + paises[i]);
			}//for*/
			
			/*
			//bucle forit
			for(String elemento:paises){
				System.out.println("Pa�s "+elemento);
			}//forit*/
			
			for(int i=0; i<numero.length;i++){
				
					System.out.println( paises[i] );
					
			}
			
			for(int j=0;j<paises.length;j++){
				System.out.println("El " + numero [j]);
			}
			
	}

}
