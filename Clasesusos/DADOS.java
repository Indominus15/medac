package Clasesusos;

public class DADOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sin inicializar
		dado dado6caras = new dado();
		System.out.println(dado6caras.getncaras());
		dado6caras.tirar();
		System.out.println(dado6caras.getvalor());
		
		//inicalizado
		dado dadoxcaras = new dado(20);
		System.out.println(dadoxcaras.getncaras());
		System.out.println(dadoxcaras.tirarvalue());
	}

}
