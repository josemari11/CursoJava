package Arrays;

public class ArrayBidimensionalII {

	public static void main(String[] args) {
	int [][] matrix={
			{10,15,32,15,47},
			{222,54,23,87,54,12},
			{5,48,87,98,98},
			{65,95,85,45,85},
	};
		
		for(int[]fila:matrix){
			System.out.println();
			for(int z:fila){
				System.out.print(z +" ");
			}
		}
		System.out.println();
		System.out.println("------------------");
		
		for(int i=0;i<4;i++){
			System.out.println();
			for(int j=0;j<5;j++){
				
				System.out.print(matrix[i][j]+" ");
			}//for2
		}//for1
		System.out.println();
		System.out.println("valor almacenado en la posici�n 0,3 -> "+matrix[0][3]);

	}

}
