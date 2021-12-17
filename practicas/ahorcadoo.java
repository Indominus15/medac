package practicas;
import java.util.Random;
import java.util.Scanner;

public class ahorcadoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// hacer un ahorcado donde la palabra sea secreta, cada introducion de
		// caracter desbloquea uno de los * que ocultan la palabra
		// y cada fallo dibuja el ahorado

		/* introducimos los imports */
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		/*
		 * introducimos la declaramos el banco de palabra y la preparacion de la
		 * palabra a usar
		 */
		final String OCULTA[] = { "murcielago", "otaku", "berenjena", "paradigma",
				"campeon" };/* banco palabras */
		int n = ran.nextInt(OCULTA.length);/* para que salga una palabra al azar */
		StringBuffer oculta = new StringBuffer(OCULTA[n]);/* seleccion de palabra */

		/* creamos la palabra que vamos descubriendo */
		StringBuffer unknow = new StringBuffer("");
		for (int i = 0; i < oculta.length(); i++) {
			unknow.insert(i, "*");
		}
		/* declaramos las variables necesarias */

		int fall = 4;/* número de intentos */
		int acer = 0;/* contador para cuando acierte */
		boolean fallo = false;/* para comprobar las letras */
		boolean terminado = false;/* para indicar cuando acaba el bucle */

		/* muñeco para cada fallo */
		int contmun = 0;
		String muñeco[] = { " ______", "\n |    o", "\n |    T ", "\n_|_   ^" };
		String mun = " ";

		/* comienza el bucle */
		System.out.println("Su acertijo es el siguiente: " + unknow);
		do {

			System.out.println("introduzca una letra");
			/* compara la letra introducida con la oculta */
			char letra = sc.next().charAt(0);
			for (int i = 0; i < oculta.length(); i++) {
				if (oculta.charAt(i) == letra) {
					/*
					 * si acierta se sustituye la letra acertada e incrementa el
					 * contador de aciertos
					 */
					if (unknow.charAt(i) != letra) {
						fallo = true;
						acer++;
						unknow.delete(i, i + 1);
						unknow.insert(i, letra);
					}
				}
			}

			/* si falla se actualiza las variables afectadas */
			if (fallo == false) {
				fall--;
				contmun++;
				mun += muñeco[contmun - 1];

			}
			/* imprimimos las conclusiones de la ronda */
			System.out.println(unknow);
			System.out.println("Le quedan " + fall + " intentos");
			System.out.println(mun);

			/* reiniciamos el booleano que continua la busqueda de letras */
			fallo = false;

			/* determina cuando acaba el bucle */
			if (fall == 0 || acer == unknow.length()) {
				terminado = true;
			}

		} while (terminado == false);

		/* imprimimos resultados del juego */
		if (acer == unknow.length()) {
			System.out.println("Has ganado!!");
		}
		if (fall == 0) {
			System.out.println("Has perdido \n La palabra oculta era:	" + oculta);

		}
		sc.close();
	}

}
