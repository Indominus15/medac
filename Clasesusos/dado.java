package Clasesusos;

public class dado {
	private int ncaras = 6,valor;
	
	public dado(){//constructor para cuando no inicializamos
		this.valor= (int) (Math.random()*this.ncaras)+1;
	}
	
	public dado(int ncaras){//constructor si inicializado
		this.ncaras=ncaras;
		this.valor= (int) (Math.random()*this.ncaras)+1;
	}
	
	
	public int getncaras (){
		return this.ncaras;
		
	}
	public int getvalor(){
		return this.valor;
	}
	
	public void setncara(int ncaras){
		this.ncaras=ncaras;
	}
	public void tirar(){
		this.valor= (int) (Math.random()*this.ncaras)+1;
	}
	public int tirarvalue(){
		this.valor= (int) (Math.random()*this.ncaras)+1;
		return this.valor;
	}
}
