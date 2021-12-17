package practicas;

import java.util.Scanner;

public class sumatoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// pedir numero y hacer sumatoria(n!)

		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println("mete el puto número"); int num = sc.nextInt();
		 * int total = 0; long fac = 1; for(int sum = 1; sum <= num; sum++ ) {
		 * total += sum; fac *= sum; } System.out.println("el total es "+total+
		 * " y el factorial es " +fac );
		 */

		// introducir numeros hasta que introduzca un negativo que pare y
		// calcule la media de los positivos

		int num;
		int total = 0;
		double med;
		int con = 0;
		do {
			System.out.println("mete numeros ahi");
			num = sc.nextInt();
			if (num >= 0) {
				total += num;
				con++;
			}
		} while (num >= 0);
		med = (double) (total / con);
		System.out.println("la media es " + med + "y el total " + total);
	}

}
