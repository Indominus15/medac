package arrays;

import java.util.Scanner;

public class vectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double[] vec1 = new double[3];
		double[] vec2 = new double[3];
		double esc=0;
		for (int i = 0; i < vec1.length; i++) {
			System.out.println("introduce datos del  primer vector en el siguiente orden: x,y,z");
			vec1[i] = sc.nextDouble();
		}
		for (int i = 0; i < vec2.length; i++) {
			System.out.println("introduce datos del segundo vector en el siguiente orden: x,y,z");
			vec2[i] = sc.nextDouble();
		}

		System.out.println("el vector uno es el siguiente: vec1[" + vec1[0] + " , " + vec1[1] + " , " + vec1[2] + "]");

		System.out.println("el vector dos es el siguiente: vec2[" + vec2[0] + " , " + vec2[1] + " , " + vec2[2] + "]");
		
		for(int i = 0; i<vec1.length;i++)
		{
			esc += vec1[i]*vec2[i];
		} System.out.println("el producto escalar es "+ esc);
	}

}
