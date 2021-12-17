package practicas;
import java.util.Scanner;
public class inverso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* meter un numero y devolverlo al reves*/
		System.out.println("introduce un puto numero para darle la putivuelta");
		Scanner sc = new Scanner (System.in);
		int derecho = sc.nextInt();
		int reves=0;
		int digi;
		while(derecho !=0){
			
				digi = derecho%10;
				reves = reves * 10+digi;
				derecho =derecho/10;
			
		}System.out.println(reves);
	}

}
