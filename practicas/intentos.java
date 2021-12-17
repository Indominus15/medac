package practicas;

import java.util.Scanner;
import java.util.Random;

public class intentos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// nº aleatorio y el usuario de adivinar cual es maximo 3 intentos
		Scanner sc = new Scanner(System.in);
		System.out.println("adivina el nº del 1 al 9");
		int num;
		Random cor = new Random();
		int rand = cor.nextInt(9) + 1;
		for (int i = 0; i <= 2; i++) {
			num = sc.nextInt();
			if (num == rand) {
				System.out.println("felicidades");
				break;
			} else if (i < 2) {
				System.out.println("vuelve a intentarlo");
				if (num<rand)
				{System.out.println("es mas mayor");}
				else {System.out.println("es menor");}
			} else {
				System.out.println("pringao era el " + rand);
				{

				}
			}
		}
	}

}
