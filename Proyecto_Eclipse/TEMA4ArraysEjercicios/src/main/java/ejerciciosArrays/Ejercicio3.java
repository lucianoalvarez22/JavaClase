package ejerciciosArrays;

public class Ejercicio3 {

	/*
	 * Crear un metodo que reciba dos arrays de enteros y los compare para ver si
	 * tienen los mismos elementos en la misma posición
	 */
	
	public static boolean compararArrays(int[] array1, int[] array2) {
		//COMPRUEBO PRIMERO LA LONGITUD, EN CASO DE QUE NO SEA IGUAL ES FALSO
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }
	
	public static void main(String[] args) {
		//DECLARAMOS E INCILIZAMOS DOS ARRAYS
		
		int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = {1, 2, 3};

        System.out.println("Array1 y Array2 tienen los mismos elementos en la misma posicion? " + compararArrays(array1, array2));
        System.out.println("Array1 y Array3 tienen los mismos elementos en la misma posicion? " + compararArrays(array1, array3));
        System.out.println("Array2 y Array3 tienen los mismos elementos en la misma posicion? " + compararArrays(array2, array3));
        
	}

}
