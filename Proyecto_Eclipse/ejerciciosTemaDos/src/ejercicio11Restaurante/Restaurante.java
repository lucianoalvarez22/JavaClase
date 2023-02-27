package ejercicio11Restaurante;

public class Restaurante {
	
	//ATRIBUTOS
	double papas;
	double chocos;
	
	//Constructor
	public Restaurante(double papas, double chocos) {
		this.papas = papas;
		this.chocos = chocos;
	}
	
	//METODO EJERCICIO11 PARA CALCULAR CLIENTES
	
	public int CalculaClientes() {
		int personas_papas;
		int personas_chocos;
		
		personas_papas = (int) (papas*3);
		personas_chocos = (int) ((chocos*3)/0.5);
		
		if(personas_papas <= personas_chocos) {
			 return  personas_papas;
		} else {
			 return personas_chocos; 
		}			 
		
	}
	
	// METODOS EJERCICIO12 - MODIFICACIONES
	
	//METODOS PARA AÑADIR KILOS DE CHOCOS Y PAPAS
	public void addChocos(double NuevoKiloChocos) {
		chocos = chocos + NuevoKiloChocos;
	}
	
	public void addPapas(double NuevoKiloPapas) {
		papas = papas + NuevoKiloPapas; 
	}
	
	//METODOS PARA VER CUANDO KILOS DE CHOCOS HAY EN EL ALMACEN
	public double showChocos() {
		return chocos; 
	}
	
	
	public double showPapas() {
		return papas; 
	}
	
	
	//METODO MAIN 
	
	public static void main(String[] args) {
		
		Restaurante rest1 = new Restaurante(1, 0.5);

//		rest1.addPapas(5.0);
//		rest1.addChocos(5.0);
		
		System.out.println(rest1.CalculaClientes());
	}

	
	

}
