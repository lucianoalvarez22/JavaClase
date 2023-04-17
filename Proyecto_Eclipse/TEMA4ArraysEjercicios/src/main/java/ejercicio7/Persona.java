package ejercicio7;

public class Persona {
	private String nombre;
	private String DNI;
	private int edad;

	// CONSTRUCTOR
	public Persona(String nombre, String DNI, int edad) {
		this.nombre = nombre;
		this.DNI = DNI;
		this.edad = edad;
	}

	// GET AND SET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String DNI) {
		this.DNI = DNI;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public static Persona obtenerPersonaMayorEdad(Persona[] personas) {
		Persona personaMayorEdad = personas[0];
		for (int i = 1; i < personas.length; i++) {
			if (personas[i].getEdad() > personaMayorEdad.getEdad()) {
				personaMayorEdad = personas[i];
			}
		}
		return personaMayorEdad;
	}

	// EQUALS
	@Override
	public boolean equals(Object obj) {
		Persona personequals = (Persona) obj;
		if (this == personequals)
			return true;
		else {
			if (this.nombre.equals(personequals.nombre) && this.DNI.equals(personequals.DNI)
					&& this.edad == personequals.edad)
				return true;
			return false;
		}
	}

	public static void main(String[] args) {
		Persona[] personas = new Persona[10];

		personas[0] = new Persona("Luciano", "12345X", 29);
		personas[1] = new Persona("Juan", "16785Y", 10);
		personas[2] = new Persona("Elena", "98645D", 9);
		personas[3] = new Persona("Luis", "3455H", 50);
		personas[4] = new Persona("Ana", "15455B", 12);
		personas[5] = new Persona("Alejandro", "111Z", 3);
		personas[6] = new Persona("Paula", "645567M", 45);
		personas[7] = new Persona("Jimena", "58678L", 15);
		personas[8] = new Persona("Carlos", "345789G", 5);
		personas[9] = new Persona("Lucas", "243367S", 17);


		// ITERAMOS EL ARRAY
		for (Persona p : personas) {
			System.out.println("Nombre: " + p.getNombre() + ", DNI: " + p.getDNI() + ", Edad: " + p.getEdad());
		}
		
		//USAMOS EL METODO OBTENERPERSONAMAYOREDAD
		Persona personaMayorEdad = obtenerPersonaMayorEdad(personas);
		System.out.println("La persona con mayor edad es: " + personaMayorEdad.getNombre() + " , Tiene "
				+ personaMayorEdad.getEdad() + " Anyos" + " Y su DNI es: " + personaMayorEdad.getDNI());
	}

}
