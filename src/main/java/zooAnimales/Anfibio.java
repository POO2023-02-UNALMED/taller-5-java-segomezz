package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal {
	private ArrayList<Anfibio> listado=new ArrayList<Anfibio>();
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	public Anfibio(){
		super();
		listado.add(this);
	}
	public Anfibio(String nombre,int edad,String habitat,String genero,String colorPiel,boolean venenoso) {
		super(nombre,edad,habitat,genero);
		this.colorPiel=colorPiel;
		this.venenoso=venenoso;
		listado.add(this);
	}
	public  static crearRana(String nombre,int edad,String genero) {
		Anfibio rana=new Anfibio(nombre,edad,"selva",genero,"rojo",true);
		Anfibio.ranas++;
		return rana;
	}
	public  static crearSalamandra(String nombre,int edad,String genero) {
		Anfibio rana=new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
		Anfibio.salamandras++;
		return salamandras;
	}
public static void setColorEscamas(String colorEscamas) {
	this.colorEscamas=colorEscamas;
}
public static getColorEscamas() {
	return colorEscamas;
}
public static void setVenenoso(boolean venenoso) {
	this.venenoso=venenoso;
}
public static getVenenoso() {
	return venenoso;
}
@override
public movimiento() {
	return "saltar";
}
public static cantidadAnfibios() {
	return listado.size();
	}

public static getListado() {
	return listado;
}
public static void setListado(ArrayList<Anfibio> listado) {
	anfibio.listado=listado;

}
}