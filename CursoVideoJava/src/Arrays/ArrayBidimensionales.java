package Arrays;

public class ArrayBidimensionales {

	public static void main(String[] args) {
		
		int [][] matrix=new int [4][5];
		
		matrix[0][0]=7;
		matrix[0][1]=77;
		matrix[0][2]=9;
		matrix[0][3]=7;
		matrix[0][4]=15;
		
		matrix[1][0]=11;
		matrix[1][1]=2;
		matrix[1][2]=3;
		matrix[1][3]=73;
		matrix[1][4]=25;

		matrix[2][0]=51;
		matrix[2][1]=52;
		matrix[2][2]=35;
		matrix[2][3]=753;
		matrix[2][4]=525;
		
		matrix[3][0]=21;
		matrix[3][1]=233;
		matrix[3][2]=15;
		matrix[3][3]=43;
		matrix[3][4]=55;
		
		for(int i=0;i<4;i++){
			System.out.println();
			for(int j=0;j<5;j++){
				
				System.out.print(matrix[i][j]+" ");
			}//for2
		}//for1
		System.out.println();
		System.out.println("valor almacenado en la posici�n 3,3 -> "+matrix[3][3]);
		
	}//main

}
