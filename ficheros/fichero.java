package ficheros;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.util.Arrays;
public class fichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce nombre del nuevo fichero: ");
		String docu = sc.next();

		// creacion de fichero
		// si ya está creado nos dará problemas
//		try {
//			File fichero = new File("C:\\Users\\DAM\\Desktop\\fichero\\" + docu);
//			if (fichero.createNewFile()) {
//				System.out.println("el fichero se ha creado");
//			} else {
//				System.out.println("error al crear fichero");
//			}
//		} catch (IOException e) {
//			System.out.println(e + " la ruta especificada es incorrecta");
//		}

		// escritura de un fichero

		try {
			FileWriter escritura = new FileWriter("C:\\Users\\DAM\\Desktop\\fichero\\" + docu);
			escritura.write("texto random de la vida");
			escritura.close();
		} catch (IOException e) {
			System.out.println(e + "error de escritura");
		}
		
		//lectura de fichero
		
		try{
			File ficherolectura = new File("C:\\Users\\DAM\\Desktop\\fichero\\"+docu);
			Scanner sc2 = new Scanner(ficherolectura);
			while(sc2.hasNextLine()){
				String datos = sc2.nextLine();
				System.out.println(datos + " ");
			}
				sc2.close();
		}catch(IOException e){System.out.println("error de lectura: "+e);}
		
		File ficheroborrado = new File ("C:\\Users\\DAM\\Desktop\\fichero\\"+docu);
		if (ficheroborrado.delete()){
			System.out.println("se ha borrado");
		}else {System.out.println("no se ha borrado");}
		
		//listar contenido del directorio
		
		File dir = new File ("C:\\Users\\DAM\\Desktop");
		String[] cosarara = dir.list();
		
		//for especifico para imprimir arrays
		System.out.println(Arrays.toString(cosarara));
		for(String name: cosarara){System.out.println(name);}
	}

}
