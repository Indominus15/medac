package arrays;
import java.util.Scanner;
public class inverso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*un array que se se devuelva en el orden contrario*/
		System.out.println("introduce el tamaño de la array");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int[] dere = new int [n];
		
		for (int i =0; i<dere.length;i++){ 
			dere[i]=n;
			n--;
			}
		for ( int i =0; i<dere.length;i++){
				System.out.println("derecho:"+dere[i]);}
		
	}

}
