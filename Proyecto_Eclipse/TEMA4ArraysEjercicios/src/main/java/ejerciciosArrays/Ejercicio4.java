package ejerciciosArrays;

public class Ejercicio4 {

	/*
	 * Crear un metodo igual que el anterior que
	 * reciba dos arrays pero en esta ocasión de String y los compare para ver si
	 * tienen los mismos elementos en la misma posición
	 */
	
	public static boolean compararArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }

        return true;
    }
	
	
	public static void main(String[] args) {
		String[] array1 = {"Uno", "Dos", "Tres"};
        String[] array2 = {"Uno", "Dos", "Tres"};
        String[] array3 = {"Dos", "Uno", "Tres"};
        
        System.out.println("Tiene Array1 y Array2 los mismos elementos en la misma posicion): " + compararArrays(array1, array2));
        System.out.println("Tiene Array1 y Array3 los mismos elementos en la misma posicion): " + compararArrays(array1, array3));
        System.out.println("Tiene Array2 y Array3 los mismos elementos en la misma posicion): " + compararArrays(array2, array3));


	}

}
