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
		boolean es_vocal;

		resultado= (int)(Math.random()*26+65); //Sumamos al numero de letras (sin ñ) el valor en ASCII
		letra = (char)resultado;
		es_vocal = ((letra=='A') || (letra=='E') || (letra=='I') || (letra=='O') || (letra=='U'));

		System.out.println("Letra obtenida: " + letra);
		System.out.println("¿Es una vocal?: " + es_vocal );
		System.out.println("¿Es una consonante?: " + !es_vocal);
	}

	public static void main(String[] args) {
		ejercicio8();
	}

}
