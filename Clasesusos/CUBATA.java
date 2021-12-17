package Clasesusos;

public class CUBATA {
	//ATRIBUTOS
	
	private String alcohol;
	private String relleno;
	private int hielo;
	private String vaso;
	private String condimento;
	private int cantidad;
	private int capacidad;
	
	//constructor
	
	public CUBATA(String alcohol, String relleno,int hielo,String vaso,String condimento,int capacidad){
		this.alcohol=alcohol;
		this.relleno=relleno;
		this.hielo=hielo;
		this.vaso=vaso;
		this.condimento=condimento;
		this.capacidad=capacidad;
		this.cantidad=capacidad;
		}
	//getters  // devuelve el valor
	
	public String getalcohol(){
		return this.alcohol;}
	public String getrelleno(){
		return this.relleno;}
	public int gethielo(){
		return this.hielo;}
	public String getvaso(){
		return this.vaso;}
	public String getcondimento(){
		return this.condimento;}
	public int getcantidad(){
		return this.cantidad;}
	
	//setters   modifica valores
	
	public void setalcohol(){
		this.alcohol=alcohol;}
	public void setrelleno(){
		this.relleno=relleno;}
	public void sethielo(){
		this.hielo=hielo;}
	public void vaso(){
		this.vaso=vaso;}
	public void setcondimento(){
		this.condimento=condimento;}
	public void setcapacidad(){
		this.capacidad=capacidad;}
	
	// metodos  hacen cosas en el main
	public void LLENAR(){
		this.cantidad = capacidad;
		System.out.println("Su copa tiene "+ this.cantidad + " ml");
		
	}
	public void BEBER(int trago){
		this.cantidad = this.cantidad - trago;
		System.out.println("Su copa tiene "+ this.cantidad + " ml");
		if(this.cantidad==0){System.out.println("Deposito vacio, vaya a recargar");}
	}
	public void HIDALGO(){
		this.cantidad =0;
		System.out.println("Deposito vacio");
		
	}
	
	// sobrecarga de operadores
		@Override
		public String toString() {
			return "Tu cubata es de "+ this.alcohol+" con "+ this.relleno+ " y tiene" + this.hielo+ " hielos, acompañado de "+this.condimento+" en un vaso de "+this.capacidad+" ml y te quedan "+this.cantidad+" ml";
			
		}
		
		public CUBATA plus(CUBATA cubata2){
			String alcohol = this.alcohol+ " y "+cubata2.alcohol;
			String relleno = this.relleno+ " y "+cubata2.relleno;
			int hielo = this.hielo + cubata2.hielo;
			int cantidad = this.cantidad + cubata2.hielo;
			CUBATA cubatita = new CUBATA(alcohol,relleno,hielo,vaso,condimento,capacidad);
			return cubatita;
		}
	
	//ALCOHOL
	//RELLENO
	//HIELO
	//VASO
	//CONDIMENTOS
	//CANTIDAD
	
//MÉTODOS
	//HIDALGO
	//LLENAR
	//BEBER
	//SABIDURIA
}
