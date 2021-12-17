package practicas;
import java.util.Scanner;
public class impare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("introduzca 2 numeros");
		int num = sc.nextInt(),num1 = sc.nextInt();
		if (num >num1)
		{
			for(int i=num1;i<= num;i++)
			{
				if(i%2 !=0)
				{
					System.out.println(i);
				}
			}
		}
		else if (num1 >num)
		{
			for(int i=num;i<= num1;i++)
			{
				if(i%2 !=0)
				{
					System.out.println(i);
				}
			}
		}
		
		
	}

}
