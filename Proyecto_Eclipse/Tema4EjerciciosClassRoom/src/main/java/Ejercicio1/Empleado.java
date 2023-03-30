package Ejercicio1;

public class Empleado {

	// ATRIBUTOS
	public int idEmpleado;
	private String departamento;
	private Persona persona;

	// CONSTRUCTOR PARAMETROS
	public Empleado(int idEmpleado, String departamento, Persona persona) {
		this.idEmpleado = idEmpleado;
		this.departamento = departamento;
		this.persona = persona;
	}

	// Constructor COPIA
	public Empleado(Empleado emp) {
		this.idEmpleado = emp.idEmpleado;
		this.departamento = emp.departamento;
		this.persona = emp.persona;
	}

	// GETTER AND SETTER
	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	// METODO STRING
	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", departamento=" + departamento + ", persona=" + persona + "]";
	}
	
	//METODO EQUALS
	@Override
	public boolean equals(Object obj) {
		Empleado empAComparar = (Empleado) obj;
		if (this.idEmpleado==empAComparar.idEmpleado && this.departamento == empAComparar.departamento && this.persona==empAComparar.persona)
			return true;
		return false;  
	}
	
	//METODO CLONE
	@Override
	public Object clone() throws CloneNotSupportedException {
		Empleado empleadoAClonar = new Empleado(this.idEmpleado, this.departamento, this.persona);
		return empleadoAClonar;
	}

}
