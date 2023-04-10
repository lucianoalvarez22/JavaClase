package tema4Interfaces;

public class Libros implements Prestable {
	
	//ATRIBUTO
	private int codigo;
	private String titulo;
	private int anyo;
	private boolean prestado;
	
	//CONSTRUCTOR
	public Libros(int codigo, String titulo, int anyo, boolean prestado) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.anyo = anyo;
		this.prestado = prestado;
	}
	
	//GET AND SET
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	//TOSTRING
	@Override
	public String toString() {
		return "Libros [codigo=" + codigo + ", titulo=" + titulo + ", anyo=" + anyo + ", prestado=" + prestado + "]";
	}
	
	//3 METODOS DE EJERCICIO
	
	public void prestar() {
		setPrestado(true); //LE PASAMOS COMO PARAMETRO EL VALOR "TRUE" AL METODO SET PRESTADO
	}
	
	public void devolver() {
		setPrestado(false);
	}
	
	public String infoEstado() {
		if (this.prestado) {
			return "El libro esta prestado";
		}
		return "El libro no esta prestado"; 
	}
	
	
	
	

}
