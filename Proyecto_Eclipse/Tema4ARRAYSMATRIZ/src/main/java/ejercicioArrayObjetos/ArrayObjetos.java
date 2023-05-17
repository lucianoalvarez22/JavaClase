package ejercicioArrayObjetos;

public class ArrayObjetos {
	
	public static Rectangulo[] obtenerRectangulos() {
		//Creamos el array DE TAMAÑO 5
				Rectangulo[] arrayRect = new Rectangulo[5];
				
				//CREAMOS LOS OBJETOS DE RECTANGULOS
				Rectangulo r1 = new Rectangulo(1, 2);
				Rectangulo r2 = new Rectangulo(1, 3);
				Rectangulo r3 = new Rectangulo(1, 4);
				Rectangulo r4 = new Rectangulo(1, 5);
				Rectangulo r5 = new Rectangulo(1, 6);
				
				
				//Rellenamos el Array
				arrayRect[0]=r1;
				arrayRect[1]=r2;
				arrayRect[2]=r3;
				arrayRect[3]=r4;
				arrayRect[4]=r5;
				
				//OTRA FORMA DE CREAR E INICIALIZAR EN LA MISMA LINEA
				//Rectangulo[] arrayRect2 = {r1,r2,r3,r4,r5};
				
				//ITERAMOS sobre el array para ver los rectangulos que contiene
				for (Rectangulo rectangulo : arrayRect) {
					System.out.println(rectangulo);
				}
				
				return arrayRect;
		
		 
	}
	
	public static void main(String[] args) {
		//Creamos el array DE TAMAÑO 5
		Rectangulo[] arrayRectMain = obtenerRectangulos();
		
	}

}
