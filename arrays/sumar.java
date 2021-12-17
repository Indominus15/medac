package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class sumar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pide 2 matriz y suma
		Scanner sc = new Scanner (System.in);
		final int FIL =2,COL = 3;
		int mat1[][] = new int[FIL][COL];
		int mat2[][] = new int[FIL][COL];
		int mataux[][] = new int[FIL][COL];
		
		for(int i = 0; i<FIL;i++){		//rellenar mat 1
			for(int j = 0; j<COL;j++){
				System.out.println("introduce elemento matriz1");
				mat1[i][j]= sc.nextInt();
			}
		}
		for(int k = 0; k<FIL;k++){		//rellenar mat 2
			for(int l = 0; l<COL;l++){
				System.out.println("introduce elemento matriz2");
				mat2[k][l]= sc.nextInt();
			}
		}
		for(int m = 0; m<FIL;m++){		//rellenar mat 1
			for(int n = 0; n<COL;n++){
				mataux[m][n]= mat1[m][n]+mat2[m][n];
			}
		}System.out.println(Arrays.deepToString(mataux));
	} 
	
}
