package gestion;
import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales=new ArrayList<>();
	
public Zona(){
		this.nombre=null;
		this.zoo=null;
	
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


public ArrayList<Animal> getAnimales() {
	return animales;
}

}
