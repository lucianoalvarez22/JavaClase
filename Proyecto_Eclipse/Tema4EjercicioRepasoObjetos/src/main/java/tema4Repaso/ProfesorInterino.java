package tema4Repaso;

import java.util.Date;

public class ProfesorInterino extends Profesor {
	// ATRIBUTOS
	private Date fechaInterenidad;

	// CONSTRUCTOR PARAMETROS COMPLETOS
	public ProfesorInterino(Date fechaInterenidad, String nombre, String apellidos, int edad, String idProfesor,
			String asignatura) {
		super(idProfesor, asignatura, nombre, apellidos, edad); // LLAMADA AL CONSTRUCTOR PROFESOR
		this.fechaInterenidad = fechaInterenidad;
	}

	// Constructor COPIA
	public ProfesorInterino(ProfesorInterino profInt) {
		super(profInt.idProfesor, profInt.asignatura, profInt.nombre, profInt.apellidos, profInt.edad);
		this.fechaInterenidad = profInt.fechaInterenidad;
	}

	// SET AND GET
	public Date getFechaInterenidad() {
		return fechaInterenidad;
	}

	public void setFechaInterenidad(Date fechaInterenidad) {
		this.fechaInterenidad = fechaInterenidad;
	}

	// TO STRING
	@Override
	public String toString() {
		return "ProfesorInterino [fechaInterenidad=" + fechaInterenidad + "]";
	}

	// EQUALS
	@Override
	public boolean equals(Object obj) {
		ProfesorInterino profIntComparar = (ProfesorInterino) obj;
		if (this.fechaInterenidad == profIntComparar.fechaInterenidad && super.idProfesor == profIntComparar.idProfesor
				&& super.asignatura == profIntComparar.asignatura && super.nombre == profIntComparar.nombre
				&& super.apellidos == profIntComparar.apellidos && super.edad == profIntComparar.edad)
			return true;
		return false;
	}

	// CLONAR
	@Override
	public Object clone() throws CloneNotSupportedException {
		ProfesorInterino profIntClonar = new ProfesorInterino(this.fechaInterenidad,
				super.nombre, super.apellidos, super.edad, super.idProfesor, super.asignatura);
		return profIntClonar; 
	}

}
