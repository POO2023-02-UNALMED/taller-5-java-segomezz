import gestion.Zona;
package zooAnimales;

public class Animal {
	private static int totalAnimales=0;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
Animal(){
	totalAnimales+=1
}
Animal(String nombre,int edad,String habitat,String genero,Zona zona){
	this.nombre=nombre;
	this.edad=edad;
	this.habitat=habitat;
	this.genero=genero;
	this.zona=null;
	totalAnimales+=1
}


}
