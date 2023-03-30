package Ejercicio1;

public class Persona {

	// Atributos
	public String nombre;
	public String apellidos;
	public String DNI;
	public int anyoNacimientos;
	private String apodo;

	// Constructor con parametros
	public Persona(String nombre, String apellidos, String DNI, int anyoNacimientos, String apodo) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.DNI = DNI;
		this.anyoNacimientos = anyoNacimientos;
		this.apodo = apodo;
	}

	// Constructor COPIA
	public Persona(Persona p) {
		this.nombre = p.nombre;
		this.apellidos = p.apellidos;
		this.DNI = p.DNI;
		this.anyoNacimientos = p.anyoNacimientos;
		this.apodo = p.apodo;
	}

	// GET AND SET

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public int getAnyoNacimientos() {
		return anyoNacimientos;
	}

	public void setAnyoNacimientos(int anyoNacimientos) {
		this.anyoNacimientos = anyoNacimientos;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", DNI=" + DNI + ", anyoNacimientos="
				+ anyoNacimientos + ", apodo=" + apodo + "]";
	}

	// METODO EQUALS
	@Override
	public boolean equals(Object obj) {
		Persona objetoAComparar = (Persona) obj;
		if (this.nombre == objetoAComparar.nombre && this.apellidos == objetoAComparar.apellidos && this.DNI == objetoAComparar.DNI
				&& this.anyoNacimientos == objetoAComparar.anyoNacimientos && this.apodo == objetoAComparar.apodo)
			return true;
		return false;  
	}
	
	//METODO CLONE
	@Override
	public Object clone() throws CloneNotSupportedException {
		Persona objetoAClonar = new Persona(this.nombre, this.apellidos, this.DNI, this.anyoNacimientos, this.apodo);
		return objetoAClonar;
	}
	
	

}
