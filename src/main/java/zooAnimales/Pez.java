package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal {
	private ArrayList<Pez> listado=new ArrayList<Pez>();
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	public Pez(){
		super();
		listado.add(this);
	}
	public Pez(String nombre,int edad,String habitat,String genero,String colorEscamas,int cantidadAletas) {
		super(nombre,edad,habitat,genero);
		this.colorEscamas=colorEscamas;
		this.cantidadAletas=cantidadAletas;
		listado.add(this);
	}
	public  static Pez crearSalmon(String nombre,int edad,String genero) {
		Pez salmon=new Pez(nombre,edad,"oceano",genero,"rojo",6);
		Pez.salmones++;
		return salmon;
	}
	public static Pez crearBacalao(String nombre,int edad,String genero) {
		Pez bacalao=new Reptil(nombre,edad,"oceano",genero,"gris",6);
		Pez.bacalaos++;
		return bacalao;
	}
public static void setColorEscamas(String colorEscamas) {
	this.colorEscamas=colorEscamas;
}
public static String getColorEscamas() {
	return colorEscamas;
}
public static void setCantidadAletas(int cantidadAletas) {
	this.cantidadAletas=cantidadAletas;
}
public static String getCantidadAletas() {
	return cantidadAletas;
}
@override
public String movimiento() {
	return "nadar";
}
public static int cantidadPeces() {
	return listado.size();
	}

public static ArrayList<Pez> getListado() {
	return listado;
}
public static void setListado(ArrayList<Pez> listado) {
	Pez.listado=listado;

}
}