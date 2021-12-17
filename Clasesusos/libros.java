package Clasesusos;


public class libros {
	//atributos
private String isbm;
private String titulo;
private String autor;
private int numpag;
private int añopubli;
private String editorial;
private boolean disponible;
private String genero;

//constructor
public libros(){
}

public libros(String genero,int añopubli,int numpag,String isbm,String titulo,String autor,String editorial,boolean disponible){
	this.isbm =isbm;
	this.titulo=titulo;
	this.autor = autor;
	this.numpag=numpag;
	this.añopubli=añopubli;
	this.editorial=editorial;
	this.disponible=disponible;
	this.genero=genero;
}
//gets
public String getGenero(){
	return this.genero;
}

public String getIsbm(){
	return this.isbm;
}
public String getTitulo(){
	return this.titulo;
}
public String getAutor(){
	return this.autor;
}
public int getNumpag(){
	return this.numpag;
}
public int getAñopubli(){
	return this.añopubli;
}
public String getEditorial(){
	return this.editorial;
}
public boolean getDisponible(){
	return this.disponible;
}

//sets
public void setGenero(String genero){
	this.genero=genero;
}

public void setIsbm (String isbm){
	this.isbm=isbm;
}
public void setTitulo (String titulo){
	this.titulo=titulo;
}
public void setAutor (String autor){
	this.autor=autor;
}
public void setNumpag (int numpag){
	this.numpag = numpag;
}
public void setAñopubli (int añopubli){
	this.añopubli= añopubli;
}
public void setEditorial (String editorial){
	this.editorial=editorial;
}
public void setDisponible (boolean disponible){
	this.disponible=disponible;
}

//metodos
public void isDisponible()
{
	if(this.disponible){System.out.println("Libro disponible");}
	else {System.out.println("Libro ya prestado");}
}

public void Prestamo()
{
	if(this.disponible)
		{
			this.disponible=false;
			System.out.println("Se le ha prestado el siguiente libro"+this.titulo);
		}
	else 
	{
		System.out.println("El libro "+this.titulo+ " no está disponible");
	}
}

public void Comparapag(libros l1)
{
	if(this.numpag<l1.numpag){System.out.println(l1.titulo+" es el que tiene más paginas");}
	else if (this.numpag>l1.numpag) {System.out.println(this.titulo+" es el que más páginas tiene");}
	else {System.out.println("tienen la misma cantidad de páginas");}
}

//sobrecargar metodo, hacer una version local de un metodo existe

public String toString()
{
	String aux = "El titulo del libro es "+this.getTitulo()+ "\n"
			+ "Su autor es "+this.getAutor()+"\n"
			+ "genero: "+this.getGenero()+"\n"
			+ "Año publicacíon: "+this.getAñopubli()+"\n"
			+ "Editorial: "+this.getEditorial()+"\n"
			+"Disponibilidad: "+this.getDisponible();
			
return aux;	
}


//final loko
}
