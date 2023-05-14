package ejercicioArrayObjetos;

public class ServicioRectangulo {

	// devuelve un array de rectangulos con la longitud pasada por parametro
	public Rectangulo[] getRectangulos(int numeroRectangulos) {
		//CREO EL ARRAY Y COMO LONGITUD LE PASO EL PARAMETRO
		Rectangulo[] arrayRectangulos = new Rectangulo[numeroRectangulos];
		
		//ITERO EL ARRAY PARA INGRESAR LOS VALORES
		for (int i = 0; i < arrayRectangulos.length; i++) {
			arrayRectangulos[i] = new Rectangulo(5, 18);
		}
		
		//DEVUELVO EL ARRAY DE OBJETOS DE RECTANGULO
		return arrayRectangulos;
	}

	public static void main(String[] args) {

		ServicioRectangulo se = new ServicioRectangulo();
		Rectangulo[] rectangulos = se.getRectangulos(3); // AQUI PONGO LA LONGITUD DEL ARRAY
		
		//iterar sobre el array para ver los rectangulos que contiene
		for (Rectangulo rectangulo : rectangulos) {
			System.out.println(rectangulo);
		}
	}
}
