package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal {
	private ArrayList<Ave> listado=new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
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
	public  static Ave crearHalcon(String nombre,int edad,String genero) {
		Ave halcon=new Ave(nombre,edad,"montanas",genero,"cafe glorioso");
		Ave.halcones++;
		return halcon;
	}
	public static Ave crearAguila(String nombre,int edad,String genero) {
		Ave aguila=new Ave(nombre,edad,"montanas",genero,"blanco amarillo");
		Ave.aguilas++;
		return aguila;
	}
public void setColorPlumas(String colorPlumas) {
	this.colorPlumas=colorPlumas;
}
public String getColorPlumas() {
	return colorPlumas;
}
@Override
public String movimiento() {
	return "volar";
}
public static int cantidadAves() {
	return listado.size();
	}

public ArrayList<Ave> getListado() {
	return listado;
}
public void setListado(ArrayList<Ave> listado) {
	Ave.listado=listado;

}
}