package interfacesRepaso2;

public class Mensaje implements Logable {
	//ATRIBUTOS
	private String mensaje;
	private String prioridad;
	
	
	//CONSTRUCTOR
	public Mensaje(String mensaje) {
		this.mensaje = mensaje;
		this.prioridad = "normal";
	}


	//GET AND SET
	public String getMensaje() {
		return mensaje;
	}


	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}


	public String getPrioridad() {
		return prioridad;
	}


	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}
	
	//TO STRING
	@Override
	public String toString() {
		return "Mensaje = " + mensaje + ", Prioridad = " + prioridad;
	}


	//METODOS INTERFAZ
	public String leerMensaje() {
		return "Mensaje = " + this.mensaje;
	}
	
	public void cambiarMensaje(String mensajenuevo) {
		this.mensaje = mensajenuevo;
	}
	
	public void cambiarPrioridadAlta() {
		this.prioridad = "alta";
	}
	
	public void cambiarPrioridadBaja() {
		this.prioridad = "baja";
	}
	
	public void cambiarPrioridadMedia() {
		this.prioridad = "media";
	}
	
	
	
	
	
	
	
}
