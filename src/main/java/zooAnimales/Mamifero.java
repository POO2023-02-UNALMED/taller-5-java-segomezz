package zooAnimales;
import java.util.ArrayList;


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
public  static Mamifero crearCaballo(String nombre,int edad,String genero) {
	Mamifero caballo=new Mamifero(nombre,edad,"pradera",genero,true,4);
	Mamifero.caballos++;
	return caballo;
}
public static Mamifero crearLeon(String nombre,int edad,String genero) {
	Mamifero caballo=new Mamifero(nombre,edad,"selva",genero,true,4);
	Mamifero.leones++;
	return caballo;
}
public static int cantidadMamiferos() {
	return listado.size();
}
public static ArrayList<Mamifero>getListado() {
	return listado;
}
public static void setListado(ArrayList<Mamiferos> listado) {
	Mamifero.listado=listado;
}
public void setPelaje(boolean pelaje) {
	this.pelaje=pelaje;
}
public boolean getPelaje() {
	return pelaje;
}
public void setPatas(int patas) {
	this.patas=patas;
}
public int getPatas() {
	return patas;
}
}
