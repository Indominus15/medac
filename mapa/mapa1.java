package mapa;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Map;
public class mapa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// es como un "diccionario"
		
		Scanner sc = new Scanner(System.in);
		HashMap<String,String> hashmap = new HashMap<String,String>();
		hashmap.put("Enrique", "Casanova");
		hashmap.put("Bea", "Cortes");
		hashmap.put("Antonio", "Galisteo");
		System.out.println("dime un profesor");
		String profe = sc.next();
		System.out.println("su apellido es:" + hashmap.get(profe));
//		para recorrerlo necesitamos un iterador(elemento que se puede recorrer)
		Iterator it = hashmap.entrySet().iterator();
		//para recorrer iterador
		while(it.hasNext());{
		Map.Entry<String,String> entrada = (Map.Entry)it.next();
		System.out.println("La clave es: "+ entrada.getKey()+" y el valor es " + entrada.getValue());
		//map.Entry nos da la capacidad de que nos imprima la clave y el valor, aunque si sabemos la clave podemos ver el valor
		
		}
		
	}

}
