package Ejercicio1;

public class Empleado {

	// ATRIBUTOS
	protected int idEmpleado;
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
		return "Empleado [idEmpleado=" + idEmpleado + ", departamento=" + departamento + ", persona=" + persona.toString() + "]";
	}
	
	//METODO EQUALS
	@Override
	public boolean equals(Object obj) {
		Empleado empAComparar = (Empleado) obj;
		if (this.idEmpleado==empAComparar.idEmpleado && this.departamento == empAComparar.departamento)
			if(persona != null)
				return persona.equals(empAComparar.persona);
		return false; 
	} 
	
	//METODO CLONE
	@Override
	public Object clone() throws CloneNotSupportedException {
		Persona pc=(Persona) this.persona.clone();
		return new Empleado(this.idEmpleado, this.departamento, pc); 
	}

}
