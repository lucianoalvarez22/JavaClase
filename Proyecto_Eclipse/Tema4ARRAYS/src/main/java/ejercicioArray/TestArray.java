package ejercicioArray;

import java.util.Iterator;
import java.util.Scanner;

public class TestArray {
	
	//Crear una constante
	private static final int TAMANIO_ARRAY=5;
	
	
	public static void main(String[] args) {
		//Crear un array del tamaño de la constante
		int[] myArray = new int[TAMANIO_ARRAY];
		
		 //pedir al usuario que inserte el numero de elementos segun la constante
		Scanner entradaEscaner = new Scanner (System.in); 
		System.out.println("Introduce " + TAMANIO_ARRAY + " numeros:");
		for(int i=0; i<TAMANIO_ARRAY; i++) {
			 //meter los elementos en el array
			myArray[i] = entradaEscaner.nextInt();
		}
		
		 //mostrar el array entero por pantalla
		System.out.println("Array FINAL:");
	    for (int i = 0; i < TAMANIO_ARRAY; i++) {
	      System.out.print(myArray[i] + " ");
	    }
		
	}
	

	   

	   //mostrar el array entero por pantalla
}
