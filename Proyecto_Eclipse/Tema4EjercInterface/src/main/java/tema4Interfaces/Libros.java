package tema4Interfaces;

public class Libros extends Biblioteca implements Prestable {
	
	//ATRIBUTO
	private boolean prestado;
	
	//CONSTRUCTOR
	public Libros(String titulo, String codigo, int anyo) {
		super(titulo,  codigo,  anyo);
		this.prestado=false;
	}
	
	//GET AND SET
	
	public void prestar() {
		this.prestado=true;		
	}

	public void devolver() {		
		this.prestado=true;	
	}

	public boolean isPrestado() {
		//return this.prestado;
		return this.isPrestado();
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	
	
	

}
