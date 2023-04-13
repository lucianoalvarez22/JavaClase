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

	public ProfesorInterino(Date fechaInterenidad, Profesor prof) {
		super(prof);
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
		if (this == obj)
			return true;
		else {
			ProfesorInterino pi = (ProfesorInterino) obj;
			if (super.equals(pi)) {
				if (this.fechaInterenidad.equals(fechaInterenidad))
					return true;
			}
			return false;
		}
	}

	// CLONAR
	@Override
	public Object clone() throws CloneNotSupportedException {
		// CLONO LA FECHA
		Profesor prof1=(Profesor)super.clone();
		Date fechaInt=(Date)this.fechaInterenidad.clone();
		ProfesorInterino profInt=new ProfesorInterino(fechaInt, prof1);		
		return profInt;
	}

}
