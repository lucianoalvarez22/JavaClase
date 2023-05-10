package ejercicioArray;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class TestArray {

	// Crear una constante
	private static final int TAMANIO_ARRAY = 5;

	public static void EjercicioArray() {
		// Crear un array del tamaño de la constante
		int[] myArray = new int[TAMANIO_ARRAY];

		// pedir al usuario que inserte el numero de elementos segun la constante
		Scanner entradaEscaner = new Scanner(System.in);

		for (int i = 0; i < TAMANIO_ARRAY; i++) {
			System.out.print("Introduce un numero en la posicion " + i + ": ");
			try {
				// Leo lo que ingresa el usuario en forma de cadena y lo parseo a entero
				int num = entradaEscaner.nextInt();
				// guardo el entero en "myArray"
				myArray[i] = num;
			} catch (InputMismatchException e) { 
				// Si meto otra cosa que no sea numero, salta este error y decremento la i para
				// repetir la iteracion del bucle
				System.out.println("Solo se permiten numeros enteros. Intentalo de nuevo.");
				i--;
		        entradaEscaner.next();
			}
		}

		// mostrar el array entero por pantalla
		System.out.println("Array FINAL:");
		for (int i = 0; i < TAMANIO_ARRAY; i++) {
			System.out.print(myArray[i] + " ");
		}
	}

	public static void main(String[] args) {
		EjercicioArray();
	}
}
