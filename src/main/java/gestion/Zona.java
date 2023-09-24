import java.util.ArrayList;
import zooAnimales.Animal;
package gestion;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales=new ArrayList<>();
	
public Zona(){
		this.nombre=null;
		this.Zoologico=null;
	
}
public Zona(String nombre,Zoologico zoo) {
	this.nombre=nombre;
	this.zoo=zoo;
	
}
public void agregarAnimales(Animal animal) {
	this.animales.add(animal);
}
public int cantidadAnimales() {
    return animales.size();
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre=nombre;
}
public Zoologico getZoo() {
	return zoo;
	}

public void setZoo(Zoologico zoo) {
	this.zoo = zoo;
	}

public static int getTotalAnimales() {
	return totalAnimales;
}
public static void setTotalAnimales(int totalAnimales) {
	Animal.totalAnimales = totalAnimales;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public String getHabitat() {
	return habitat;
}
public void setHabitat(String habitat) {
	this.habitat = habitat;
}
public String getGenero() {
	return genero;
}
public void setGenero(String genero) {
	this.genero = genero;
}
public Zona getZona() {
	return zona;
}
public void setZona(Zona zona) {
	this.zona = zona;
}
public static ArrayList<Animal> getAnimales() {
	return animales;
}
public static void setListado(ArrayList<Animal> animales) {
	Zona.animales=animales;
}
}
