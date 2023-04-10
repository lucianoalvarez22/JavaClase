package tema4Interfaces;

public class Revista implements Prestable {

	// ATRIBUTO
	private int codigo;
	private String titulo;
	private int anyo;
	private boolean prestado;
	private int idAlta;

	// CONSTRUCTOR
	public Revista(int codigo, String titulo, int anyo, boolean prestado, int idAlta) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.anyo = anyo;
		this.prestado = prestado;
		this.idAlta = idAlta;
	}

	// GET AND SET
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

	public int getIdAlta() {
		return idAlta;
	}

	public void setIdAlta(int idAlta) {
		this.idAlta = idAlta;
	}

	// TOSTRING
	@Override
	public String toString() {
		return "Revista [codigo=" + codigo + ", titulo=" + titulo + ", anyo=" + anyo + ", prestado=" + prestado
				+ ", idAlta=" + idAlta + "]";
	}

	// 3 METODOS
	public void prestar() {
		setPrestado(true);
	}

	public void devolver() {
		setPrestado(false);
	}

	public String infoEstado() {
		if (this.prestado) {
			return "La revista esta prestado";
		}
		return "La revista no esta prestado"; 
	}

}
