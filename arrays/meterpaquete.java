package arrays;

public class meterpaquete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* crear un arrays de 10 huecos y que le asigne a cada elementos a cada posicion el valor de la posicion +1
		 * y cambiar el signo de las posiciones impares */
		
		int [] n1 = new int[10];
		for (int i =0; i<n1.length;i++){
			n1[i]=i+1;
			if(i%2 != 0){
				n1[i] *= -1;
			}
			System.out.println(n1[i]);
		}
		//n1=(1,2,3,4,5,6,7,8,9,10);
		
	}

}
