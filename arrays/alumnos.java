package arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class alumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*el usuario introduce alumnos hasta que escriba "ya"
		imprimir la lista, dar la vuelta a la lista e imprimir otra vez*/
		List<String>alumnos = new ArrayList<String>();
		Scanner sc = new Scanner (System.in);
		int cont = 0;
		String acab = "ya";
		List<String>reve = new ArrayList<String>();
		boolean terminado = false;
		do{
			System.out.println("introduzca un alumno:");
			String alum = sc.next();
			if(!alum.equals(acab)){
			alumnos.add(alum);
			cont++;} 
			else{terminado = true;}
			
		}
		while(terminado == false);
		System.out.println("los alumnos son :"+alumnos+ cont);
		for(int i = cont-1;i>=0;i--){
			//System.out.println(alumnos.get(i));
			reve.add(alumnos.get(i));
		}
		System.out.println(reve);
	}
	
}
