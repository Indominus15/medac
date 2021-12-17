package arrays;

import java.util.Scanner;

public class buscador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int lista[] = { 1, 5, 8, 90, 7, 6, 30, 19 };
		System.out.println("introduzca un numero a ver si esta en la lista");
		int n = sc.nextInt();
		boolean aux = false;
		int cont = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == n) {
				aux = true;
				cont = i + 1;
			}

		}
		if (aux == true) {
			System.out.println("si está dentro de la lista en la posición " + cont);
		} else {
			System.out.println("no está dentro");
		}
	}

}
