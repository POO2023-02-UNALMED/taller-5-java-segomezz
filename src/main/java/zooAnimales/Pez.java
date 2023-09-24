package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal {
	private ArrayList<Pez> listado=new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
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
public void setColorEscamas(String colorEscamas) {
	this.colorEscamas=colorEscamas;
}
public  String getColorEscamas() {
	return colorEscamas;
}
public  void setCantidadAletas(int cantidadAletas) {
	this.cantidadAletas=cantidadAletas;
}
public String getCantidadAletas() {
	return cantidadAletas;
}
@Override
public String movimiento() {
	return "nadar";
}
public int cantidadPeces() {
	return listado.size();
	}

public ArrayList<Pez> getListado() {
	return listado;
}
public void setListado(ArrayList<Pez> listado) {
	Pez.listado=listado;

}
}