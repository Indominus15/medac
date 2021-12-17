package arrays;
import java.util.*;
public class subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hacer sub lista
		List<Integer>original = new ArrayList<Integer>();
		List<Integer>copia = new ArrayList<Integer>();
		int[] aux = new int [2];
		Scanner sc = new Scanner (System.in);
		System.out.println("introduce las posiciones");
		aux[0]=sc.nextInt();
		aux[1]=sc.nextInt();
		
			original.add(1);
			original.add(2);
			original.add(3);
			original.add(4);
			original.add(5);
			original.add(6);
			original.add(7);
			original.add(8);
			original.add(9);
			original.add(10);
			original.add(11);
		
		for(int i = aux[0];i<=aux[1];i++){
			copia.add(original.get(i));}
		
		
		System.out.println(copia);
		
		
		
		
	}

}
