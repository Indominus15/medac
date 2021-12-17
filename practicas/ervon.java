package practicas;

import java.util.Scanner;

public class ervon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// leer cadena por String y nos devolvera la cadena al reves y dice
		// cuando vocales hay(8)
		System.out.println("introduzca una oracion");
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\n");
		String dere = sc.next();
		String reve = "";
		char x = 'a';
		int cont = 0;
		int i;
		for (i = dere.length() - 1; i >= 0; i--) {
			if (x != '\n') {

				reve += dere.charAt(i);
				if ((x == 'a') || (x == 'A') || (x == 'e') || (x == 'E') || (x == 'i') || (x == 'I') || (x == 'o')
						|| (x == 'O') || (x == 'u') || (x == 'U'))
					cont++;
			}

			System.out.println(x);
		}
		System.out.println("la frase al reves es ; " + reve + "\nhay " + cont + " vocales " + dere.length());

	}

}
