package Clasesusos;

public class mainclasebanca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cuentabanca bc1 = new cuentabanca("elver", 50000);
		cuentabanca bc2 = new cuentabanca("lagarla", 25000);
		System.out.println(bc1.toString());
		bc1.Transferto(bc2, 7000);
		System.out.println(bc2.getSaldo());
	}

}
