import static java.lang.Math.*;
public class VerFormato {

	public static void main(String[] args) {

	System.out.printf("%d %05.1f \n",1 ,PI );
	System.out.printf("%d %,5.3f \n",2 ,PI );
	System.out.printf("%d %#10.6f \n",3 ,PI );
	System.out.printf("%d %#8.15f \n",4 ,PI );
	System.out.printf("%d %+5.1f \n",5 ,PI );
	System.out.printf("%d %06.3g \n",6 ,PI );
	System.out.printf("%d %,5.6g \n",70 ,PI );
	System.out.printf("%d %#5.1e \n",80 ,PI );
	System.out.printf("%d %#8.2e \n",90 ,PI );
	System.out.printf("%d %+8.8e \n",100 ,PI );
	

	}

}
