package ejemploAtributoObjeto;

public class Persona {
	
	//ATRIBUTO
	private int edad;
	private String nombre;
	private String dni;
	Direccion direccion;
	Mascota mascota;
	
	//CONSTRUCTOR
	public Persona(int edad, String nombre, String dni, Direccion direccion, Mascota mascota) {
		this.edad = edad;
		this.nombre = nombre;
		this.dni = dni;
		this.direccion = direccion;
		this.mascota = mascota;
	}
	
	//CONSTRUCTOR COPIA
	public Persona(Persona p) {
		this.edad = p.edad;
		this.nombre = p.nombre;
		this.dni = p.dni;
		this.direccion = p.direccion;
		this.mascota = p.mascota;
	}
	
	//GET AND SET
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	//STRING
	@Override
	public String toString() {
		return "Persona [edad=" + edad + ", nombre=" + nombre + ", dni=" + dni + ", direccion=" + direccion + "]";
	}
	
	
	
	
	//METODO CLONE
	@Override
	public Object clone() throws CloneNotSupportedException {
		Direccion direccionClone = (Direccion) this.direccion.clone();
		Mascota mascotaClone = (Mascota) this.mascota.clone();
		
		return new Persona(this.edad, this.nombre, this.dni, direccionClone, mascotaClone);
	}
	
	
	
	
	
}
