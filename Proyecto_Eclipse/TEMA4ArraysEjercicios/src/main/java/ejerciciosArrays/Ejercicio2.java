package ejerciciosArrays;

import java.util.Scanner;

public class Ejercicio2 {

	/*
	 * Crea un array de números donde le indicamos por teclado el tamaño del array,
	 * rellenaremos el array con números aleatorios entre 0 y 9, al final muestra
	 * por pantalla el valor de cada posición y la suma de todos los valores. Haz un
	 * método para rellenar el array (que tenga como parámetros los números entre
	 * los que tenga que generar), para mostrar el contenido y la suma del array y
	 * un método privado para generar número aleatorio (lo puedes usar para otros
	 * ejercicios).
	 */
	
	//GENERO NUM ALEATORIOS
	private static int generarNumeroAleatorio(int min, int max) {
		return (int) (Math.random() * (max - min + 1) + min);
	}
	
	//RELLENO ARRAY
	 public static void rellenarArray(int[] array, int min, int max) {
	        for (int i = 0; i < array.length; i++) {
	            array[i] = generarNumeroAleatorio(min, max);
	        }
	    }
	 
	 //LO MUESTRO POR PANTALLA
	 public static void mostrarArray(int[] array) {
	        for (int i = 0; i < array.length; i++) {
	            System.out.println("Posicion " + i + ": " + array[i]);
	        }
	    }
	 
	 
	 
	 
	 //SUMAR EL ARRAY
	 public static int sumarArray(int[] array) {
	        int suma = 0;

	        for (int i = 0; i < array.length; i++) {
	            suma += array[i];
	        }

	        return suma;
	    }
	 
	
	
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Introduce el tamanyo del array: ");
	        int tam = scanner.nextInt();
	        int[] array = new int[tam];

	        rellenarArray(array, 0, 9);
	        mostrarArray(array);
	        System.out.println("La suma total de los valores del array es: " + sumarArray(array));

	}

}
