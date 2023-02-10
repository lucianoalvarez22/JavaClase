package ejercicioCoche;

public class Coche {
	
	private int velocidad;
	
	
	//METODO CONSTRUCTOR - INICIALIZA COSAS
	Coche (){
		velocidad = 40;
	}
	
	//METODO O FUNCION GETTER
	int getVelocidad() {
		return velocidad;
	}
	
	void acelera(int mas) {
		velocidad = velocidad + mas;
		
	}
	
	void frena(int menos) {
		velocidad = velocidad - menos;
		
	}

	//GET SON PUBLIC Y DEVUELVE ALGO
	//SET SON PUBLIC MODIFICA O ESTABLECE
	
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	
	
}
