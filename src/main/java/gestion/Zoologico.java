import java.util.ArrayList;
package gestion;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas=new ArrayList<>();
public Zoologico() {
		this.nombre=null;
		this.ubicacion=null;
	}
public Zoologico(String nombre,String ubicacion) {
	this.nombre=nombre;
	this.ubicaion=ubicacion;
}
public String getNombre() {
	return nombre;
}
public String getUbicacion() {
	return ubicacion;
}
public String setNombre(String nombre) {
	this.nombre=nombre;
}
public String setUbicacion(String ubicacion) {
	this.ubicacion=ubicacion;
}
public void agregarZonas(Zona zona) {
	zonas.add(zona);
}
public ArrayList<Zona> getZonas(){
return zonas;
}

public static int cantidadTotalAnimales() {
	int cantidadAnimales= 0;
	for i (int i=0;i<zonas.size();i++) {
	cantidadAnimales+=zonas.get(i).cantidadAnimales();
	}
	return cantidadAnimales
	
}
public static void setListado(ArrayList<Zona> zonas) {
	Zoologico.zonas=zonas;
}
public static getZonas() {
	return zonas;
}
}
