package ejerciciosArrays;

import java.util.Scanner;

public class Ejercicio1 {

	/*
	 
	 * Crea un array de 10 posiciones de números con valores pedidos por teclado.
	 * Muestra por consola el indice y el valor al que corresponde. Haz dos métodos,
	 * uno para rellenar valores y otro para mostrar.
	
	 */
	
	public static void rellenarValores(int[] array) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce el valor para la posicion " + i + ": ");
            array[i] = scanner.nextInt();
        }
    }
	
	public static void mostrarValores(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Indice " + i + ": " + array[i]);
        }
    }
	
	
	public static void main(String[] args) {
		
		int[] myArray = new int[10];

        rellenarValores(myArray);
        mostrarValores(myArray);

	}

}
