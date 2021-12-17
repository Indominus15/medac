package practicas;
import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* el usuario mete el numero n y saldrá por pantalla los n terminos de fibonacci*/
		
		Scanner sc = new Scanner (System.in);
		System.out.println("introduce un numero");
		int n = sc.nextInt();
		int i;
		int t1 =0,t2=1,fibo=0;
		for (i=0;i<n;i++)
		{	
			fibo=t1+t2;
			System.out.println(t1);
			t2=t1;
			t1=fibo;
			
		}
	}

}
