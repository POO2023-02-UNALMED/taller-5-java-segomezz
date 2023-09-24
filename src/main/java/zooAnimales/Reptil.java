package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal {
	private ArrayList<Reptil> listado=new ArrayList<Reptil>();
	public static int iguanas;
	public static int serpientes;
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
	public  static Reptil crearIguana(String nombre,int edad,String genero) {
		Reptil iguana=new Reptil(nombre,edad,"humedal",genero,"verde",3);
		Reptil.iguanas++;
		return iguana;
	}
	public static Reptil crearSerpiente(String nombre,int edad,String genero) {
		Reptil serpiente=new Reptil(nombre,edad,"jungla",genero,"blanco",1);
		Reptil.serpientes++;
		return serpiente;
	}
public void setColorEscamas(String colorEscamas) {
	this.colorEscamas=colorEscamas;
}
public String getColorEscamas() {
	return colorEscamas;
}
public void setLargoCola(int largoCola) {
	this.largoCola=largoCola;
}
public int getLargoCola() {
	return largoCola;
}
@Override
public String movimiento() {
	return "reptar";
}
public int cantidadReptiles() {
	return listado.size();
	}

public ArrayList<Reptil> getListado() {
	return listado;
}
public void setListado(ArrayList<Reptil> listado) {
	Reptil.listado=listado;

}
}