package temaClaseAbstracta;

public abstract class Vehiculo {
	//Crear esta clase como en el ejemplo del libro
	
	private int peso;
	
	
	public void setPeso(int p) {
		this.peso=p;
	}
	
	public abstract int getVelocidadActual();
	}
