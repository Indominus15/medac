package arrays;
import java.util.Scanner;
public class intromediarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double notas[] = new double [5];
		Scanner sc = new Scanner(System.in);
		double sum =0;
		double media = 0;
		for (int i = 0; i < notas.length; i++) {
			System.out.println("introduce un número");
			notas[i] = sc.nextDouble();
			sum+=notas[i];
			//System.out.println(notas[i]+"y"+sum);
		}
		media = sum/notas.length;
		System.out.println("la media de los numeros introducidos es: "+media);
		for(int i =0;i<notas.length;i++){
			if (notas[i]>media)
			{
				System.out.println(notas[i]);
			}
		}
	}

}
