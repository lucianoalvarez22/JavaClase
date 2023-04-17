package ejemploAtributoObjeto;

public class Direccion {
	private String calle;
	private int numero;
	private Localidad localidad;
	private int cp;

	// CONSTRUCTOR
	public Direccion(String calle, int numero, Localidad localidad, int cp) {
		this.calle = calle;
		this.numero = numero;
		this.localidad = localidad;
		this.cp = cp;
	}

	// CONSTRUCTOR COPIA
	public Direccion(Direccion dir) {
		this.calle = dir.calle;
		this.numero = dir.numero;
		this.localidad = dir.localidad;
		this.cp = dir.cp;
	}

	// GET AND SET
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", numero=" + numero + ", localidad=" + localidad + ", cp=" + cp + "]";
	}

	

	// EQUALS
	@Override
	public boolean equals(Object obj) {
		Direccion direcComparar = (Direccion) obj;

		if (this == direcComparar)
			return true;
		else {
			if (this.calle.equals(direcComparar.calle) && this.numero == direcComparar.numero
				 && this.cp == direcComparar.cp)
				return true;
			return false;

		}
	}


	// CLONE
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Localidad localClone = (Localidad) localidad.clone();
		Direccion direClon = new Direccion(this.calle, this.numero, localClone, this.cp);
		return direClon; 
	}

}
