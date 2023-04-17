package ejerciciosArrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio6 {

	/*
	 * Crear una matriz (array de dos dimensiones de 4x4 elementos aleatorios. Crear
	 * un metodo para leer la matriz por filas, otro metodo para la lectura por
	 * columnas, otros dos que hagan lo mismo pero desde el final hacia delante y
	 * otro metodo que saque la diagonal de la matriz.
	 */
	
	 public static int[][] crearMatrizAleatoria(int filas, int columnas) {
	        Random random = new Random();
	        int[][] matriz = new int[filas][columnas];

	        for (int i = 0; i < filas; i++) {
	            for (int j = 0; j < columnas; j++) {
	                matriz[i][j] = random.nextInt(10);
	            }
	        }

	        return matriz;
	    }
	 
	 public static void imprimirMatriz(int[][] matriz) {
	        for (int i = 0; i < matriz.length; i++) {
	            System.out.println(Arrays.toString(matriz[i]));
	        }
	    }
	 
	 public static void leerPorFilas(int[][] matriz) {
	        System.out.println("Lectura por filas:");

	        for (int i = 0; i < matriz.length; i++) {
	            System.out.println(Arrays.toString(matriz[i]));
	        }
	    }
	 
	 
	 public static void leerPorColumnas(int[][] matriz) {
	        System.out.println("Lectura por columnas:");

	        for (int j = 0; j < matriz[0].length; j++) {
	            int[] columna = new int[matriz.length];

	            for (int i = 0; i < matriz.length; i++) {
	                columna[i] = matriz[i][j];
	            }

	            System.out.println(Arrays.toString(columna));
	        }
	    }
	 
	 public static void leerPorFilasAlReves(int[][] matriz) {
	        System.out.println("Lectura por filas al revés:");

	        for (int i = matriz.length - 1; i >= 0; i--) {
	            System.out.println(Arrays.toString(matriz[i]));
	        }
	    }
	 
	 public static void leerPorColumnasAlReves(int[][] matriz) {
	        System.out.println("Lectura por columnas al reves:");

	        for (int j = matriz[0].length - 1; j >= 0; j--) {
	            int[] columna = new int[matriz.length];

	            for (int i = matriz.length - 1; i >= 0; i--) {
	                columna[matriz.length - 1 - i] = matriz[i][j];
	            }

	            System.out.println(Arrays.toString(columna));
	        }
	    }
	 
	 
	 public static void leerDiagonal(int[][] matriz) {
	        System.out.println("Diagonal:");

	        for (int i = 0; i < matriz.length; i++) {
	            System.out.print(matriz[i][i] + " ");
	        }

	        System.out.println();
	    }
	
	 

	public static void main(String[] args) {
		
		int[][] matriz = crearMatrizAleatoria(4, 4);
		imprimirMatriz(matriz);
        leerPorFilas(matriz);
        leerPorColumnas(matriz);
        leerPorFilasAlReves(matriz);
        leerPorColumnasAlReves(matriz);
        leerDiagonal(matriz);
        
	}

}
