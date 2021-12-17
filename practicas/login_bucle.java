package practicas;

import java.util.Scanner;

public class login_bucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		/*
		 * final String CORRE = "123456789"; String entra; do {
		 * System.out.println("introduzca contraseña"); entra = sc.next(); if
		 * (!entra.equals(CORRE))
		 * {System.out.println("jajaja no es la palabra mágica");} else
		 * {System.out.println("tira pa dentro compare");} }
		 * 
		 * while (!entra.equals(CORRE));
		 * System.out.println("introduce el número"); int num = sc.nextInt();
		 * 
		 * for (int i=0;i<11;i++) {System.out.println(+num +"x"+i +" igual a "+
		 * i*num); //for (int t=0;t<11;t++) // System.out.println("es "+i*t); }
		 

		// pedir 2 numeros y ver que numeros pares hay entre ellos y que solo
		// salgan los pares
		System.out.println("introduce algun número");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				if (i % 2 == 0) {
					System.out.println(i);
				}
			}
		} else 
		{
			for (int i = num2; i <= num1; i++) {
				if (i % 2 == 0) {
					System.out.println(i);
				}
			}
		}*/

		System.out.println("mete el número tope");
		int num = sc.nextInt();
		for (int i=num;i>=0;i--)
		{
			System.out.println(i);
		}
}}