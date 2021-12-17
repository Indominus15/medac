package arrays;

public class ordenarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 9, 10, 3, 5, 2, 7, 8, 6, 1 };
		int[] ord = new int[array.length];
		int max = 0;
		for (int i = ord.length - 1; i >= 0; i--) {
			for (int j = 0; j < array.length; j++) {
				// {System.out.println(array[j]);
				if (array[j] > max) {
					max = array[j];
				}
			}
			for (int k = 0; k < array.length; k++) {
				if (max == array[k]) {
					array[k] = 0;
				}
			}
			ord[i] = max;
			max = 0;

		}
		for (int i = 0; i < array.length; i++) {
			System.out.println("\n" + ord[i]);
		}
	}

}
