package ejemploAtributoObjeto;

public class Localidad {
	
	private String nombre;
	private int cp;
	
	
	public Localidad(String nombre, int cp) {
		this.nombre = nombre;
		this.cp = cp;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCp() {
		return cp;
	}


	public void setCp(int cp) {
		this.cp = cp;
	}


	@Override
	public String toString() {
		return "Localidad [nombre=" + nombre + ", cp=" + cp + "]";
	}
	
	//CLONE
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new Localidad(this.nombre, this.cp);
	}
	
	

}
