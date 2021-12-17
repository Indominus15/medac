package practicas;

import java.util.Scanner;

public class capicua2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("introduzca 2 números");
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		
		for (int i = num; i<= num1;i++){
			int numaux = i;
			int revnum= 0;
			while (numaux != 0){
				int digito = numaux %10;
				revnum = revnum * 10 + digito;
				numaux /= 10;
			}
			if (revnum == i){
				System.out.println("es capicua: "+i);
			}
		}
	}
}
