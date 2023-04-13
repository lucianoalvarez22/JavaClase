package tema4Interfaces;

public class Biblioteca {
	
	//ATRIBUTO
	protected String titulo;
	protected String codigo;
	protected int anyo;
	
	
	//CONSTRUCTOR
	public Biblioteca(String titulo, String codigo, int anyo) {
		this.titulo = titulo;
		this.codigo = codigo;
		this.anyo = anyo;
	}
	
	//GET AND SET
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getAnyoPublicacion() {
		return anyo;
	}
	public void setAnyoPublicacion(int anyo) {
		this.anyo = anyo;
	}
	

}
