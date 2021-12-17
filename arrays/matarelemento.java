package arrays;

import java.util.Scanner;

public class matarelemento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("donde quieres meter el tiro, max 8 posiciones");
		int pos = sc.nextInt() -1;
		int array[] = { 9, 10, 3, 5, 2, 7, 8, 6, 1 };
		int[] boo = new int[array.length - 1];
		for (int i = 0; i < array.length-1; i++) {	//System.out.println("\nvuelta de i numero "+i);
			if (i != pos) {
				boo[i] = array[i];
				System.out.println("guardamos en boo\t"+boo[i]);
				}
			}
		for (int i = 0; i < boo.length; i++) {
			System.out.println("es el final\t"+boo[i]);
		}
	}

}
