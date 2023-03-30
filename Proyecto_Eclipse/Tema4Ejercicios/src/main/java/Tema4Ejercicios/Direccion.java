package Tema4Ejercicios;

public class Direccion {
	
	//ATRIBUTOS
	String calle;
	int numero;
	int cp;
	
	
	//CONSTRUCTOR
	public Direccion(String calle, int numero, int cp) {
		this.calle = calle;
		this.numero = numero;
		this.cp = cp;
	}
	
	//SET AND GET
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	
	//EQUALS
	
	@Override
	public boolean equals(Object obj) {
		Direccion d = (Direccion) obj; 
		return (this.calle==d.calle && this.numero==d.numero && this.cp == d.cp);
	}
	
	// CLONE
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Direccion d1 = new Direccion (this.calle, this.numero, this.getCp());
		return d1; 
	}
	
	

}
