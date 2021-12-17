package arrays;
import java.util.Scanner;
import java.util.Arrays;
public class multiplicamatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("introduce tamaño de cada array");
		int tam = sc.nextInt();
		int mat1[][] = new int[tam][tam];
		int mat2[][] = new int[tam][tam];
		int mataux[][] = new int[tam][tam];
		
		for(int i = 0; i<tam;i++){		//rellenar mat 1
			for(int j = 0; j<tam;j++){
				System.out.println("introduce elemento matriz1");
				mat1[i][j]= sc.nextInt();
			}
		}
		for(int k = 0; k<tam;k++){		//rellenar mat 2
			for(int l = 0; l<tam;l++){
				System.out.println("introduce elemento matriz2");
				mat2[k][l]= sc.nextInt();
			}
		}
		for(int m = 0; m<tam;m++){		//rellenar mat 1
			for(int n = 0; n<tam;n++){
				mataux[m][n]= mat1[m][n]*mat2[n][m];
			}
		}System.out.println(Arrays.deepToString(mataux));
	} 
	
}
