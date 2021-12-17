package practicas;

import java.util.Scanner;

public class meses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número para devolverte su mes");
		int num = sc.nextInt();
		
		if (num>= 1 && num <= 12 )
		{
			switch (num)
			{
				case 1 : System.out.println("enero"); break;
				case 2 : System.out.println("febrero"); break;
				case 3 : System.out.println("marzo"); break;
				case 4 : System.out.println("abril"); break;
				case 5 : System.out.println("mayo"); break;
				case 6 : System.out.println("junio"); break;
				case 7 : System.out.println("julio"); break;
				case 8 : System.out.println("agosto"); break;
				case 9 : System.out.println("septiembre"); break;
				case 10 : System.out.println("octubre"); break;
				case 11 : System.out.println("noviembre"); break;
				case 12 : System.out.println("diciembre"); break;
				
			}
		}
		else {System.out.println("subnormal");}
	}

}
