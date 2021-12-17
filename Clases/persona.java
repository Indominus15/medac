package Clases;

public class persona {//definimos aqui la clase, sus atributos y los métodos(funciones que tiene)

	//atributos
	private String nombre;//private es para que no la puedan modificar ni usar
							//con public si se puede usar
	private String apellidos;
	private String dni;
	private int edad;
	
	public int nbrazos =2;
	public int npiernas = 2;
	
	//metodos
	
	//ese es el contruct
	public persona(String nombre, String apellidos,String dni, int edad) {
		this.nombre=nombre;//this hace que esa variable se guarde en ese atributo
		this.apellidos=apellidos;
		this.dni=dni;
		this.edad=edad;
		
	}
	// podemos hacer varios metodos 
	public persona(String nombre, String apellidos,String dni, int edad,int npbrazos,int npiernas) {
		this.nombre=nombre;//this hace que esa variable se guarde en ese atributo
		this.apellidos=apellidos;
		this.dni=dni;
		this.edad=edad;
		this.nbrazos=nbrazos;
		this.npiernas=npiernas;
		
	}
	// 2 tipos de métodos set modifica y get muestra
	//pondremos que es void cuando NO devuelva nada
	
	public String getNombre(){
		return this.nombre;//eso es lo que devuelve el método
	}
	public String getApellidos(){
		return this.apellidos;
	}
	public String getDni(){
		return this.dni;
	}
	public int getEdad(){
		return this.edad;
	}
	public int getBrazos(){
		return this.nbrazos;
	}
	public int getPiernas(){
		return this.npiernas;
	}
	
	public void setnombre(String nombre){//modifica pero devuelve nada
		this.nombre=nombre;
	}
	public void setapellidos(String apellidos){//modifica pero devuelve nada
		this.apellidos=apellidos;
	}
	public void setdni(String dni){
		this.dni=dni;
	}
	public void setedad(int edad){
		this.edad=edad;
	}
	public void setnbrazos(int nbrazos){
		this.nbrazos=nbrazos;
	}
	public void setnpiernas(int piernas){
		this.npiernas=npiernas;
	}
	
	
	
	
}
