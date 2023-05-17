package ejerciciosString;

import java.util.Iterator;
import java.util.Scanner;

public class EjerciciosString {

	// 1.- Pedir una cadena por consola y mostrar por pantalla la cantidad de
	// vocales que tiene. Ejemplo: Entrada: cad = "Hola tu" Salida: La cantidad de
	// vocales es 3

	public static String cantidadVocales() {
		int contadorVocales = 0;
		String palabra;
		char[] arrayVocales = { 'a', 'e', 'i', 'o', 'u' };

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una palabra: ");

		palabra = entrada.nextLine();

		for (int i = 0; i < palabra.length(); i++) {
			char letra = palabra.charAt(i);

			for (char c : arrayVocales) {
				if (c == letra) {
					contadorVocales++;

				}
			}
		}

		return "La palabra tiene: " + contadorVocales + " vocales";
	}

	// 2.- Pedir una cadena por consola, invertir la misma y mostrar por pantalla.
	// Ejemplo: Entrada: "casa blanca" Salida: "acnalb asac"

	public static String invertirCadena() {
		String palabra;
		String vacio = "";
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una palabra: ");

		palabra = entrada.nextLine();

		for (int i = palabra.length() - 1; i >= 0; i--) {
			vacio += palabra.charAt(i);
		}

		return "Palabra original: " + palabra + "\n" + "Palabra invertida: " + vacio;
	}

	// 3.- Pedir una cadena cad por consola y un caracter char, verificar cuántas
	// veces se repite el carácter char en la cadena cad, por ejemplo: Entrada: cad
	// =
	// "casa blanca", car = 'a' Salida: El caracter 'a' se repite 4 veces

	public static String verificarCaracter() {
		int contadorVocales = 0;

		// SCANNER PARA INTRODUCIR LA PALABRA
		String palabra;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Cad: ");
		palabra = entrada.nextLine();

		// SCANNER PARA INTRODUCIR EL CARACTER
		char caracter;
		Scanner entradaCaracter = new Scanner(System.in);
		System.out.println("Car: ");
		caracter = entradaCaracter.next().charAt(0);

		for (int i = 0; i < palabra.length(); i++) {
			char letra = palabra.charAt(i);

			if (caracter == letra) {
				contadorVocales++;

			}
		}

		return "El caracter " + caracter + " se repite " + contadorVocales + " veces";
	}

	/*
	 * 4.- Pedir dos String por consola: Comparar los dos strings y decir si son
	 * iguales crear otro string «c» con la concatenación de a y b crear otro string
	 * «d» con la concatenacion de a y b otra vez Comparar los string c y d y decir
	 * si son iguales indicar cuantos caracteres tiene cada una de los strings
	 * Copiar la string a en el string b Utilizar replace, para modificar el string
	 * a Presentar en consola el contenido de la string a y de la string b.
	 */

	public static void compararString() {
		// Pedir dos String por consola
		String a;
		Scanner entradaA = new Scanner(System.in);
		System.out.println("String A: ");
		a = entradaA.nextLine();

		String b;
		Scanner entradaB = new Scanner(System.in);
		System.out.println("String B: ");
		b = entradaB.nextLine();

		// Comparar los dos strings y decir si son iguales
		if (a.equalsIgnoreCase(b)) {
			System.out.println("Los string 'B' y 'B' Son iguales");
		} else {
			System.out.println("Los string 'A' y 'B' son diferentes");
		}

		// Crear otro String «c» con la concatenación de a y b
		String c = a.concat(b);
		// Crear otro String «d» con la concatenación de a y b
		String d = a.concat(b);

		// Comparar los string c y d y decir si son iguales
		if (c.equalsIgnoreCase(d)) {
			System.out.println("Los string 'C' y 'D' Son iguales");
		} else {
			System.out.println("Los string 'C' y 'D' son diferentes");
		}

		// Indicar cuantos caracteres tiene cada una de los strings
		System.out.println("El string A tiene: " + a.length() + " caracteres");
		System.out.println("El string B tiene: " + b.length() + " caracteres");
		System.out.println("El string C tiene: " + c.length() + " caracteres");
		System.out.println("El string D tiene: " + d.length() + " caracteres");

		// STRING ORIGINALES A Y B
		System.out.println("El String 'A' original es: " + a);
		System.out.println("El String 'B' original es: " + b);

		// COPIA DE A = B
		a = b;
		System.out.println("El String 'A' copiado de 'B' es: " + a);

		// Utilizar replace, para modificar el string a
		System.out.println("La string 'A' modificado es: " + a.replace(a, "luciano"));

		// Presentar en consola el contenido de la string a y de la string b.
		System.out.println("El String 'A' FINAL es: " + a);
		System.out.println("El String 'B' FINAL es: " + b);
	}

	// Pedir por consola un numero y guardarlo en un String. Convertirlo a Integer y
	// despues a int

	public static int convertirInt() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce numero: ");

		String numero = entrada.nextLine();

		// Convertirlo a integer y despues a int
		
		Integer numeroInteger = Integer.valueOf(numero);
        int numeroInt = numeroInteger.intValue();
	

		return numeroInt;
	}

	// Pedir por consola un numero y guardarlo en un String. Convertirlo a Float y
	// despues a float
	
	public static Float convertirFloat() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce numero: ");

		String numero = entrada.nextLine();
		
		Float numeroFloat = Float.valueOf(numero);
        float numeroFloatValor = numeroFloat.floatValue();
		
		return numeroFloatValor;
	}

	public static void main(String[] args) {

		// System.out.println(cantidadVocales());
		// System.out.println(invertirCadena());
		// System.out.println(verificarCaracter());
		// compararString();
		//System.out.println(convertirInt());
		//System.out.println(convertirFloat());

	}

}
