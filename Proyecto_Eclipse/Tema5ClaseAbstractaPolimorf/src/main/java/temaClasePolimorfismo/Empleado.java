package temaClasePolimorfismo;

public class Empleado extends Persona{
	
	protected int sueldoBase;
	
	public int getSueldo() {
		return this.sueldoBase;
	}
	
	public void setSueldo(int sueldo) {
		this.sueldoBase = sueldo;
	}
}
