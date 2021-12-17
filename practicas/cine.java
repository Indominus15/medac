package practicas;

import java.util.Scanner;

public class cine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*menos 4 -  pagas 60%
		 * mas de 60 - pagas 20€		primero se aplica el dia del espectador 
		 * menos de 12- pagas 40€
		 * + dia del espectador = miercoles - pagas 50%
		 * la entrada cuesta 15€ base
		 */
	
		Scanner sc = new Scanner (System.in);
		System.out.println("¿que dia vas al cine?");
		String dia = sc.next();
		System.out.println("¿cuantos años tienes?");
		int edad = sc.nextInt();
		String espec = "miercoles";
		final double DESCUENTOVIEJO = 0.2;
		final double DESCUENTOBB = 0.6;
		final double DESCUENTONIÑOS = 0.4;
		final int PRECIOBASE = 15 ;
		double precio;
		switch(dia)
		{
		case "miercoles" : 
			
		}
	}
}
