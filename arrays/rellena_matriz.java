package arrays;
import java.util.Arrays; //necesario para imprimir arrays
import java.util.Scanner;
public class rellena_matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*rellenar por scanner un matriz*/
		final int FIL = 2, COL =3;
		Scanner sc = new Scanner (System.in);
		int[][] matr = new int [FIL][COL];
		System.out.println("introduce elementos");
		
		
		for(int i =0; i<FIL;i++){  
			for(int j =0;j<COL;j++){
				matr[i][j]= sc.nextInt();
			}
		}
		for(int i =0; i<FIL;i++){ // podemos usar Arrays.deepToString(matr)); para imprimirlo del tiron
			for(int j =0;j<COL;j++){
				System.out.println("el elemento de la matriz["+(i+1)+"]"+"["+(j+1)+"] es "+ matr[i][j]);
			}
	}
		System.out.println(Arrays.deepToString(matr)); // podemos usar Arrays.deepToString(matr)); para imprimirlo del tiron
}
}