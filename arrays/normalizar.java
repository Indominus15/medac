package arrays;

import java.util.Scanner;

public class normalizar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce el tamaño del array");
		int n = sc.nextInt();
		double num[] = new double[n];

		for (int i = 0; i < num.length; i++) {
			System.out.println("introduce numero");
			num[i] = sc.nextInt();
		//	System.out.println("contenido "+num[i]);
		}

		double max = 0, min = num[0];

		for (int i = 0; i < num.length; i++) {
			if (num[i] < min) {
				min = num[i];
		//		System.out.println("min de la vuelta "+i+" es "+min);
			}
			else if (num[i] > max) 
			{
				max = num[i];
			//	System.out.println("max de la vuelta "+i+" es "+max);
			}
		}
		for (int i = 0; i < num.length; i++){
			num[i]=(num[i]-min)/(max-min);
		}
		for (int i = 0; i < num.length; i++)
		{
			System.out.println(num[i]);
		}
	}

}
