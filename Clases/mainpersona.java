package Clases;

import java.util.Scanner;

import Clasesusos.CUBATA;

public class mainpersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String respuesta;
		persona enrique = new persona ("Enrique","Casanova","76628",26);//llamada de la clase
				
		//		System.out.println(enrique.nombre);// es private
				
//				System.out.println(enrique.npiernas);// es public
//				System.out.println(enrique.getNombre());//metodo que muestra
//				enrique.setnombre("Bicho");
//				System.out.println(enrique.getNombre());
		
		CUBATA cubatita = new CUBATA("seagram","limon",3,"ancho","limones",330); 
		System.out.println(cubatita.getalcohol());
		
		System.out.println("Que quiere usted");
		respuesta = sc.next();
		
		switch(respuesta){
		case "llenar":{ cubatita.LLENAR();
			break;}
		case "beber":{
			System.out.println("cantidad a beber en ml");
			int trago = sc.nextInt();
			cubatita.BEBER(trago);
			break;}
		case "hidalgo":{
			cubatita.HIDALGO();
			break;}
			
			default: 
			System.out.println("vas demasiado piñata");
			break;
		}
	System.out.println(cubatita);
	}

}
