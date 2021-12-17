package practicas;

import java.util.Scanner;

public class Los_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*meter 2 numeros enteros y ver cual es más grande*/
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("introduce los 2 numeros");
		int numb1 = sc.nextInt();
		int numb2 = sc.nextInt();
		
		if (numb1>numb2)
		{
			System.out.println(" el numero mayor es "+numb1);
		}
			else 
			{
				System.out.println("el numero mayor es ");
			}
	}

}
