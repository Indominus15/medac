package arrays;
import java.util.*;
public class copi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	copiar una arraylist en otra
		
		List<String>eluno = new ArrayList<String>();
		List<String>eldos = new ArrayList<String>();
		System.out.println("mete que se hace copia");
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		do{
			
		eluno.add(sc.next());
		eldos.add(eluno.get(i));
		i++;
		System.out.println(i);
		System.out.println("acaba?");
		}while(!sc.next().equals("ya"));
		System.out.println(eldos);
	}

}
