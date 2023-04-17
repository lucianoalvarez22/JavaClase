package tema4Repaso;

public class Persona {

	// ATRIBUTOS
	protected String nombre;
	protected String apellidos;
	protected int edad;

	// CONSTRUCTOR
	public Persona(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	// Constructor COPIA
	public Persona(Persona p) {
		this.nombre = p.nombre;
		this.apellidos = p.apellidos;
		this.edad = p.edad;
	}

	// METODO GET AND SET
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// Metodo To String
	@Override
	public String toString() {
		return "Persona [nombre=" + this.nombre + ", apellidos=" + this.apellidos + ", edad=" + this.edad + "]";
	}

	// EQUALS
	@Override
	public boolean equals(Object obj) {
		Persona personComparar = (Persona) obj;
		if(this==personComparar)
			return true; 
		else {
			
			if (this.nombre.equals(personComparar.nombre) && this.apellidos.equals(personComparar.apellidos) && this.edad == personComparar.edad)
				return true;
			return false; 
		}
	}

	// CLONE
	@Override
	public Object clone() throws CloneNotSupportedException {
		return new Persona(this.nombre, apellidos, this.edad );
		}

}
