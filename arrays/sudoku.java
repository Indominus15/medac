package arrays;

import java.util.Random;

public class sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int TAM = 3;
		String sudoku[][][][] = new String[TAM][TAM][TAM][TAM];
		String num[] = { "[1]", "[2]", "[3]", "[4]", "[5]", "[6]", "[7]", "[8]", "[9]" };
		Random ran = new Random();
		int val = ran.nextInt(9);
		boolean valido = false;
		boolean completado = false;
		int cont =0;
		String[] aux= new String[TAM*TAM];
		for (int a=0; a<TAM*TAM; a++){
			aux[a]=num[a];
		}
		// dibujo sudoku

		do {
			do {

				for (int i = 0; i < TAM; i++) {// matriz grande
					for (int j = 0; j < TAM; j++) {

						for (int k = 0; k < TAM; k++) {// cuadrantes
							for (int l = 0; l < TAM; l++) {
								
								sudoku[i][j][k][l] = num[val];
							}
						}

					}
				}if(valido == true){cont++;}
			} while (valido == false);
		} while (completado == false);

		// imprime
		for (int i = 0; i < TAM; i++) {
			for (int j = 0; j < TAM; j++) {
				System.out.println();

				for (int k = 0; k < TAM; k++) {
					for (int l = 0; l < TAM; l++) {
						System.out.print(sudoku[i][j][k][l]);
						if (l == TAM - 1) {
							System.out.print(" ");
							if (k == TAM - 1 && j == TAM - 1 && l == TAM - 1) {
								System.out.println();
							}
						}

					}

				}

			}
		}
	}
}
