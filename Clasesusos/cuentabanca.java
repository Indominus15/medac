package Clasesusos;

public class cuentabanca {
//atributos
	private String titular;
	private double saldo=0;
	
	//gets and sets
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		if(saldo>=0){
		this.saldo = saldo;}
		else {System.out.println("Error de saldo negativo");}
	}
	//constructors
	public cuentabanca(String titular, double saldo) {
		
		this.titular = titular;
		if(saldo>=0){
			this.saldo = saldo;}
			else {System.out.println("Error de saldo negativo");}
	}
	public cuentabanca(String titular) {
	
		this.titular = titular;
		if(saldo>=0){
			this.saldo = saldo;}
			else {System.out.println("Error de saldo negativo");}
	}
	public cuentabanca() {}
	
	
	//metodos
	
	public String toString() {
		return "cuentabanca [titular=" + titular + ", saldo=" + saldo + "]";
	}
	
	public void Ingresar(double cantidad){
		if(cantidad>0){
		this.saldo+=cantidad;
		System.out.println("su saldo es "+this.saldo);}
		else System.out.println("ingrese cantidad positiva");
	}
	public void Retirar(double cantidad){
		if(cantidad>0){
		this.saldo-=cantidad;
		System.out.println("su saldo es "+this.saldo);}
		else {System.out.println("ingrese cantidad positiva");}
	}
	
	public void Transferto(cuentabanca cb2,double cantidad){
		if(cantidad>0){
		this.saldo-=cantidad;
		cb2.saldo+=cantidad;
		System.out.println("El titular "+cb2.titular + "ha recibido "+ cantidad+" en su cuenta" );}
		else {System.out.println("ingrese cantidad positiva");}
	}
	
}
