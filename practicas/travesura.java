package practicas;

import java.util.Scanner;

public class travesura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * primera parte:meter un n y decir si es primo o no segunda parte:
		 * meter un numero k y que salgan todos los primos hasta k
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("introduce un número");
		int n = sc.nextInt();
		for(int j =1;j <= n;j++){
			boolean primo = true;
			for (int i = 2; i < j; i++) {
			 
				if (j % i == 0) {
					primo = false;
					}
				}
			
			
	if (primo){System.out.println("es primo"+j);}
				
	}}}

			/*
			 * { if (n%2 ==0) { System.out.println("t"+t+"no lo es" );} else
			 * {System.out.println(i + " y " + t + " son primos");}
			 * System.out.println("vuelta de t numero " + t); }
			 * 
			 * System.out.println("vuelta de  i numero " + i);
			 */
		

	
