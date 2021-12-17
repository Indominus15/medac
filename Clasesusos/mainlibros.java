package Clasesusos;

public class mainlibros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		libros l1 = new libros("erotico", 2021, 23, "hnjufdrvgf", "Roja como la sangre", "elver galarga" ,"miscroto", true);
		libros l2 = new libros("fantastico", 20, 56, "jnjmklxdvzsnj", "como lomo de cocodrilo", "mel asuda", "coitus", true);
		
		System.out.println(l2.toString());
		l1.Comparapag(l2);
	}

}
