package matrices;

public class Matrices {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("Recorrido por filas");
		for (int i = 0; i < matrix.length; i++) {
			for (int x = 0; x < matrix[i].length; x++) {
				System.out.print(matrix[i][x] + " ");
			}

			System.out.println();

		}

		System.out.println("---------------------");

		System.out.println("Recorrido por columnas");
		for (int i = 0; i < matrix.length; i++) {
			for (int x = 0; x < matrix[i].length; x++) {
				System.out.print(matrix[x][i] + " ");
			}
			
			System.out.println();

		}
		
		System.out.println("------------------------");
		
		System.out.println("Recorrido diagonal");
		for (int i = 0; i < matrix.length; i++) {
			for (int x = 0; x < matrix[i].length; x++) {
				if(x==i)
					System.out.print(matrix[x][i] + " ");
			}
			
			System.out.println();
		

	}
}

}