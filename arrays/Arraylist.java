package arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		List<String> arrayColores = new ArrayList<String>();
		System.out.println("introduce valor");
		String valor = sc.next();
		arrayColores.add("Rojo");
		arrayColores.add("asulito sielo");
		arrayColores.add(1,"verde");//así lo introducimos en un posición elegida y empuja a las posteriores
		arrayColores.add(valor);
		sc.close();
		System.out.println(arrayColores);
		arrayColores.set(2,"asulito sielon´t equisdeminuscula");//set modifica el contenido de la posicion seleccionada
		System.out.println("el valor de la posicion 2 es: "+arrayColores.get(2));
		arrayColores.remove(2);//elimina el contenido de esa posicion
		System.out.println(arrayColores);
	}

}
