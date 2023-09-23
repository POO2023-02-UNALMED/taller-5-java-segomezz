package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal {
	private ArrayList<Ave> listado=new ArrayList<Ave>();
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	public Ave(){
		super();
		listado.add(this);
	}
	public Ave(String nombre,int edad,String habitat,String genero,String colorPlumas) {
		super(nombre,edad,habitat,genero);
		this.colorPlumas=colorPlumas;
		listado.add(this);
	}
	public  static crearHalcon(String nombre,int edad,String genero) {
		Ave halcon=new Ave(nombre,edad,"montanas",genero,"cafe glorioso");
		Ave.halcones++;
		return halcon;
	}
	public static crearAguila(String nombre,int edad,String genero) {
		Ave aguila=new Ave(nombre,edad,"montanas",genero,"blanco amarillo");
		Ave.aguilas++;
		return aguila;
	}
public static void setColorPlumas(String colorPlumas) {
	this.colorPlumas=colorPlumas;
}
public static getColorPlumas() {
	return colorPlumas;
}
@override
public movimiento() {
	return "volar";
}
public static cantidadAves() {
	return listado.size();
	}

public static getListado() {
	return listado;
}
public static void setListado(ArrayList<Ave> listado) {
	Ave.listado=listado;

}
}