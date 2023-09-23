import java.util.ArrayList;
package zooAnimales;

public class Mamifero extends Animal {
	private ArrayList<Mamifero> listado=new ArrayList<Mamifero>();
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;
public Mamifero(){
	super();
	listado.add(this);
}
public Mamifero(String nombre,int edad,String habitat,String genero,boolean pelaje,int patas) {
	super(nombre,edad,habitat,genero);
	this.pelaje=pelaje;
	this.patas=patas;
	listado.add(this);
	
}
public  static crearCaballo(String nombre,int edad,String genero) {
	Mamifero caballo=new Mamifero(nombre,edad,"pradera",genero,true,4);
	Mamifero.caballos++;
	return caballo;
}
public static crearLeon(String nombre,int edad,String genero) {
	Mamifero caballo=new Mamifero(nombre,edad,"selva",genero,true,4);
	Mamifero.leones++;
	return leon;
}
public static cantidadMamiferos() {
	return listado.size();
}
public static getListado() {
	return listado;
}
public static void setListado(ArrayList<Mamiferos> listado) {
	mamifero.listado=listado;
}
public static setPelaje(boolean pelaje) {
	this.pelaje=pelaje;
}
public static getPelaje(boolean pelaje) {
	return pelaje;
}
public static setPatas(int patas) {
	this.patas=patas;
}
public static getPatas(int patas) {
	return patas;
}
}
