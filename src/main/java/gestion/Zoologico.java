package gestion;
import java.util.ArrayList;


public class Zoologico {
	private String nombre;
	private String ubicacion;
	private static ArrayList<Zona> zonas=new ArrayList<>();
public Zoologico() {
		this.nombre=null;
		this.ubicacion=null;
	}
public Zoologico(String nombre,String ubicacion) {
	this.nombre=nombre;
	this.ubicacion=ubicacion;
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
public void setUbicacion(String ubicacion) {
	this.ubicacion=ubicacion;
}
public void agregarZonas(Zona zona) {
	this.zonas.add(zona);
}
public ArrayList<Zona> getZonas(){
return zonas;
}

public int cantidadTotalAnimales() {
	int cantidadAnimales= 0;
	for  (int i=0;i<zonas.size();i++) {
	cantidadAnimales+=zonas.get(i).cantidadAnimales();
	}
	return cantidadAnimales;
	
}
public static void setListado(ArrayList<Zona> zonas) {
	Zoologico.zonas=zonas;
}
}
