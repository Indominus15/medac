package arrays;

import java.util.Scanner;

public class cine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// asientos de 14 filas y 22 columnas 2 son pasillos
		final int FIL = 14, COL = 22;
		Scanner sc = new Scanner(System.in);
		String reservado = ("[x]");
		String butaca[][] = new String[FIL][COL];
		boolean completo = false;
		int cont = 0;
		for (int i = 0; i < FIL; i++) {
			for (int j = 0; j < COL; j++) {

				butaca[i][j] = "[ ]";

				if (j == 10 || j == 11) {
					butaca[i][j] = "[p]";
				}
			}
		}
		do {

			System.out.println("donde quiere reservar? elija la fila ");
			int fil = sc.nextInt();
			System.out.println("donde quiere reservar? elija las columnas 10 y 11 son pasillos");
			int col = sc.nextInt();
			if (butaca[fil][col] == "[x]" || butaca[fil][col] == "[p]") {
				System.out.println("ya está reservada");
			}
			if ("[ ]" == butaca[fil][col]) {
				butaca[fil][col] = reservado;
				cont++;
			}

			System.out.println(cont);

			for (int i = 0; i < FIL; i++) {
				for (int j = 0; j < COL; j++) {

					System.out.print(butaca[i][j]);
					if (j == COL - 1) {
						System.out.println();
					}
					
				}
			}

			System.out.println("¿está completo?");
			char resp = sc.next().charAt(0);
			if (resp == 's') {
				completo = true;
			}

			if (cont == FIL * COL) {
				completo = true;
			}
		} while (completo == false);
		System.out.println("Disfruten de la pelicula");
	}
}
