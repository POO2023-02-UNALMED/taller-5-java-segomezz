package zooAnimales;
import gestion.Zona;

public class Animal {
	private static int totalAnimales=0;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
public Animal(){
	totalAnimales+=1;
}
public Animal(String nombre,int edad,String habitat,String genero){
	this.nombre=nombre;
	this.edad=edad;
	this.habitat=habitat;
	this.genero=genero;
	this.zona=null;
	totalAnimales+=1;
}
public String movimiento() {
	return "desplazarse";
}
public int totalAnimales () {
	return totalAnimales;
}
public static String totalPorTipo() {
	String resultado = String.format("Mamifero: %d%nAve: %d%nReptil: %d%nPez: %d%nAnfibio: %d%n", Mamifero.cantidadMamiferos(), Ave.cantidadAves(),Reptil.cantidadReptiles(),Pez.cantidadPeces(),Anfibio.cantidadAnfibios());
return resultado;
}
public String toString() {
	String message = String.format("Mi nombre es %s, tengo una edad de %s, habito en %s y mi genero es %s", nombre, edad, habitat, genero);
	
	if (zona != null) {
		message = String.format("%s, la zona en la que me ubico es %s, en el %s", message, zona.getNombre(), zona.getZoo().getNombre());
	}
	
	return message;
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
}
