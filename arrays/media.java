package arrays;

public class media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] notas = { 6, 5.1, 7.25, 5.3, 9.2, 3.1, 9 };
		double sum = 0;
		double media = 0;
		for (int i = 0; i < notas.length; i++) {
			sum += notas[i];
			//System.out.println(sum);
		}
		media = sum / notas.length;
		System.out.println("la media es: " + media);
	}
}
