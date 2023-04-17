package ejemploAtributoObjeto;

public class Mascota {

	private String nombre;

	// METODO CLON
	public Mascota(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {

		Mascota mas1 = new Mascota(this.nombre);
		return mas1;
	}

}
