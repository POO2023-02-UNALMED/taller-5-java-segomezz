package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal {
	private ArrayList<Reptil> listado=new ArrayList<Reptil>();
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	public Reptil(){
		super();
		listado.add(this);
	}
	public Reptil(String nombre,int edad,String habitat,String genero,String colorEscamas,int largoCola) {
		super(nombre,edad,habitat,genero);
		this.colorEscamas=colorEscamas;
		this.largoCola=largoCola;
		listado.add(this);
	}
	public  static crearIguana(String nombre,int edad,String genero) {
		Reptil iguana=new Reptil(nombre,edad,"humedal",genero,"verde",3);
		Reptil.iguanas++;
		return iguana;
	}
	public static crearSerpiente(String nombre,int edad,String genero) {
		Reptil serpiente=new Reptil(nombre,edad,"jungla",genero,"blanco",1);
		Reptil.serpientes++;
		return aguila;
	}
public static void setColorEscamas(String colorEscamas) {
	this.colorEscamas=colorEscamas;
}
public static getColorEscamas() {
	return colorEscamas;
}
public static void setLargoCola(int largoCola) {
	this.largoCola=largoCola;
}
public static getLargoCola() {
	return largoCola;
}
@override
public movimiento() {
	return "reptar";
}
public static cantidadReptiles() {
	return listado.size();
	}

public static getListado() {
	return listado;
}
public static void setListado(ArrayList<Reptil> listado) {
	Reptil.listado=listado;

}
}