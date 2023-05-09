package ejerciciosArrays;

import java.util.Arrays;

public class Ejercicio5 {

	/*
	 * Dado un array de números de 5 posiciones con los siguiente
	 * valores {1,2,3,4,5}, guardar los valores de este array en otro array distinto
	 * pero con los valores invertidos, es decir, que el segundo array debera tener
	 * los valores {5,4,3,2,1}.
	 */

	public static void main(String[] args) {
		
		int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = new int[array1.length];
        
//        for (int i = 0; i < array1.length; i++) {
//        	array2[i] = array1[array1.length - 1 - i];
//        }
        
        for (int i = array1.length - 1; i >=0; i--) {
        	array2[array1.length - 1 - i] = array1[i];
        }

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
		

	}

}
