package ejercicio11Restaurante;

public class RestauranteIsrael {
	
	float papas;
	float chocos;
	
	static int CalculaClientes(float papas, float chocos) {
		
		//Cuantos platos de papas con choco puedo hacer con las papas que tengo
		
			float papasParaPlato = papas*3;
			float chocosParaPlato= chocos*6;
			
			float cantidadMenor = papasParaPlato;
			
			if(chocosParaPlato<papasParaPlato)
				cantidadMenor=chocosParaPlato;
			if(cantidadMenor>1)
				return (int) cantidadMenor; 
			return 0; 
	}

	public static void main(String[] args) {
		
		System.out.println(CalculaClientes(1, (float)0.5));
		
	}

}
