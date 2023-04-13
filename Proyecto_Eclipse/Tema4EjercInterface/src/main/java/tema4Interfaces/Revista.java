package tema4Interfaces;

public class Revista extends Biblioteca implements  Prestable {

	// ATRIBUTO
	private boolean prestado;
	private String ident;

	// CONSTRUCTOR
	public Revista(String ident, String titulo, String codigo, int anyoPublicacion) {
		super(titulo,  codigo,  anyoPublicacion);
		this.ident=ident;
		this.prestado=false;
	}

	// GET AND SET

	public void prestar() {
		this.prestado=true;		
	}

	public void devolver() {		
		this.prestado=false;	
	}

	public boolean isPrestado() {
		//return this.prestado;
		return this.prestado;
	}
	
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	public String getIdent() {
		return ident;
	}
	public void setIdent(String ident) {
		this.ident = ident;
	}

}
