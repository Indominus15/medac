package practicas;

public class dibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, aux;
		String dibu = "";
		// System.out.println("******\n*\n*\n******\n *\n *\n******+");
		for (i = 0; i <= 6; i++) {
			if (i == 0) {
				dibu += "******\n";
			}
			else if (i == 1) {
				dibu += ("*\n");
			}
			else if (i == 2) {
				dibu += ("*\n");
			}
			else if (i == 3) {
				dibu += "******\n";
			}
			else if (i == 4) {
				dibu += ("     *\n");
			}
			else if (i == 5) {
				dibu += ("     *\n");
			}
			else {
				dibu += ("******\n");
			}
			

		}
		System.out.println(dibu);
	}

}
