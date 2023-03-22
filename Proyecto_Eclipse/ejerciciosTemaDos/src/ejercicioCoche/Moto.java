package ejercicioCoche;

public class Moto {
	
	//ATRIBUTOS
	private String marca;
	private int velocidad;
	
	
	//CONSTRUCTOR
	public Moto() {
		marca = "";
		velocidad=0;
	}
	
	public Moto(String lamarca, int lavelocidad) {
		marca = lamarca;
		velocidad = lavelocidad;
	}

	//GETTERS AND SETTERS
	
	public String getMarca() {
		return marca;
	}

	//SET MODIFICAR
	public void setMarca(String marca) {
		this.marca = marca;
	}
	

	public int getVelocidad() {
		return velocidad;
	}
	
	//SET MODIFICAR
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	
	public static void main(String[] args) {
		Moto moto1 = new Moto();
		Moto moto2 = new Moto();
	}
	
	
	

}
