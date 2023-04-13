package tema4Repaso;

public class Profesor extends Persona {

	protected String idProfesor;
	protected String asignatura;

	// CONSTRUCTOR
	public Profesor(String idProfesor, String asignatura, String nombre, String apellidos, int edad) {
		super(nombre, apellidos, edad); // Aquí se llamará al constructor de la clase Persona y se establecerán las
										// variables
		this.idProfesor = idProfesor;
		this.asignatura = asignatura;
	}

	public Profesor(String idProfesor, String asignatura, Persona p) {
		super(p);
		this.idProfesor = idProfesor;
		this.asignatura = asignatura;
	}

	// CONSTRUCTOR COPIA
	public Profesor(Profesor prof) {
		super(prof.nombre, prof.apellidos, prof.edad);
		this.idProfesor = prof.idProfesor;
		this.asignatura = prof.asignatura;
	}

	// GET AND SET
	public String getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(String idProfesor) {
		this.idProfesor = idProfesor;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	// TOSTRING
	@Override
	public String toString() {
		return "Profesor [idProfesor=" + idProfesor + ", asignatura=" + asignatura + ", Nombre=" + super.nombre
				+ ", Apellidos=" + super.apellidos + ", Edad=" + super.edad + "]";
	}

	// EQUALS
	@Override
	public boolean equals(Object obj) {
		Profesor other = (Profesor) obj;
		if (this == other)
			return true;

		if (asignatura == null) {
			if (other.asignatura != null) 
				return false;
		} else if (!asignatura.equals(other.asignatura))
			return false;

		if (idProfesor == null) {
			if (other.idProfesor != null)
				return false;
		} else if (!idProfesor.equals(other.idProfesor))
			return false;
		return true; 
	}

	// CLONE
	@Override
	public Object clone() throws CloneNotSupportedException {
		Persona personaClon = (Persona) super.clone();
		return new Profesor(this.idProfesor, this.asignatura, personaClon);
	}

}
