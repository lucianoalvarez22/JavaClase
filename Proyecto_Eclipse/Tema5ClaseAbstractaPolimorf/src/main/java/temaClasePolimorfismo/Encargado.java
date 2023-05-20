package temaClasePolimorfismo;

public class Encargado extends Empleado {

	public int getSueldo() {
		return new Double(sueldoBase * 1.1).intValue();
	}

	public void doCosasDeEncargado() {

	}

}
