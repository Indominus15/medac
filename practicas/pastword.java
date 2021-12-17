package practicas;

import java.util.Scanner;

public class pastword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* meter contraseña por teclado y que se confirme */

		Scanner sc = new Scanner(System.in);
		System.out.println("introduzca la contraseña");

		String contra = sc.next();
		String confir = "hola";

		if (contra.equals(confir)) {
			System.out.println("Enhorabuena se ha introducido y ha matado a un zombie");
		} else {
			System.out.println("Se ha equivocado al introducir la contraseña y ha muerto, baja un nivel");
		
		
		
	}

	}}
