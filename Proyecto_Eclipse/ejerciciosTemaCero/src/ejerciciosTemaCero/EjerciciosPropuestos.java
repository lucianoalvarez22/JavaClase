package ejerciciosTemaCero;

public class EjerciciosPropuestos {
	static double pi = 3.14;
	
	public static void ejercicio3() {
		
		int numero = 2,
		cuad=numero * numero;
		System.out.println("El cuadrado de " + numero +" es: " + cuad);
	}
	
	public static void ejercicio4() {
		int radio = 4;
		double calculoFinal = radio * pi * 2;
		System.out.println(calculoFinal);	
	}
	
	public static void ejercicio8() {
		
		int resultado;
		char letra;

		resultado= (int)(Math.random()*26+65); //sumo 26 num del abecedario (sin la ñ) el valor en ASCII
		
		letra = (char)resultado; //lo casteo a char para que me dé la letra
		System.out.println("Letra: " + letra);
		
		if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
			System.out.println("Es una vocal");
		} else {
			System.out.println("Es una consonante");
		}

	}

	public static void main(String[] args) {
		ejercicio8();
	}

}
