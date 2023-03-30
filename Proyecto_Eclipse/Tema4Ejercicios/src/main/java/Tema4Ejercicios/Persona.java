package Tema4Ejercicios;

public class Persona {
	
	//Atributos
	private int edad;
	private String nombre;
	private Direccion direccion;
	
	
	//Constructor de 2 Parametros
	public Persona(int edad, String nombre) {
		this.edad = edad;
		this.nombre = nombre;
	}
	
	//Constructor COPIA
	public Persona (Persona p) {
		this.nombre = p.nombre;
		this.edad = p.edad;
		this.direccion = p.direccion;
	}


	
	//METODOS SET Y GET
	public int getEdad() {
		return edad;
	}
	
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public Direccion getDireccion() {
		return direccion;
	}
	
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	


	

	//TO STRING
	@Override
	public String toString() {
		return "Persona [edad=" + edad + ", nombre=" + nombre + "]";
	}
	
	// CLONE
	@Override
	public Object clone() throws CloneNotSupportedException {
		Persona p1 = new Persona (this.edad, this.nombre);
		if(direccion!=null)
			p1.direccion=(Direccion) this.direccion.clone();
		return p1; 
	}
	
	
	//EQUALS
	@Override
		public boolean equals(Object obj) {
			Persona p = (Persona) obj;
			if(this.nombre==p.nombre && this.edad==p.edad)
				if(direccion!=null) {
					return this.direccion.equals(p.direccion); 
				}else
					return true; 
				
			return false; 
		}

}
