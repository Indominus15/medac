package practicas;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*introducir 2 numero y un caracter y que de el resultado y que pregunte si quieres usar la calculadora*/
		Scanner sc = new Scanner (System.in);
		System.out.println("¿quieres encender la calculadora? \n si o no?");
		String encen = sc.next();
		String confir = "si";
		while (encen.equals(confir))
		{
		System.out.println(" introduzca el primer numero");
		int num1 = sc.nextInt();
		
		System.out.println(" introduzca el segundo numero");
		int num2 = sc.nextInt();
		
		System.out.println("introduzca el caracter de su operación (+ - x / )");
		String oper = sc.next();
		char c = oper.charAt(0);
		
		switch (c)
		{
			case '+':  System.out.println("el resultado es "+(num1+num2));	break;
			case '-':  System.out.println("el resultado es "+(num1-num2));	break;
			case 'x':  System.out.println("el resultado es "+(num1*num2));	break;
			case '/':  System.out.println("el resultado es "+(num1/num2));	break;
			default: System.out.println("cacho subnormal");
		}
		
		System.out.println("quieres volver a hacer un cálculo?");
			encen = sc.next();
		
			
			
		/*if (c == '+')
			{System.out.println("el resultado es "+(num1+num2));}
		 
		 else if (c == '-')
		 	{ System.out.println("el resultado es "+(num1-num2) );}
		 
		 else if (c == 'x')
		 	{System.out.println("el resultado es "+(num1*num2) );}
		 
		 else if (c == '/')
		 	{System.out.println("el resultado es "+(num1/num2) );}
		 
		 else {System.out.println("unlucky ");}
		 */
		}
		System.out.println("Adios personaje");
	}

}
