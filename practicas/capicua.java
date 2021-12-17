package practicas;
import java.util.Scanner;
public class capicua {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("introduzca un número");
		int num = sc.nextInt();
		int reves=0;
		int digi,derecho=num;
		while(derecho !=0)
		{
			
			digi = derecho%10;
			reves = reves * 10+digi;
			derecho =derecho/10;
		}
	
		if (num == reves)
		{
			System.out.println(num+ " es capicua");
		}
		else{System.out.println("no lo es");}
}
}