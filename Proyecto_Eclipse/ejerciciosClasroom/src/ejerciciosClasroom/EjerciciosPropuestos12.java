package ejerciciosClasroom;
import java.util.Scanner;

public class EjerciciosPropuestos12 {
	
	public static void ejercicio12() {
		
		System.out.println("Ingresa la cantidad en euros: ");
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		scanner.close();
		
		int billetes[]= {500,200,100,50,20,10,5};
		int numero_desglosado[];
		numero_desglosado = new int [7];
		
		for (int i = 0; i < billetes.length; i++){
			int desglose = numero / billetes[i];
			numero_desglosado[i] = desglose;
			numero = numero % billetes[i];
		}
		
		for (int i = 0; i < numero_desglosado.length; i++){
			
			if (numero_desglosado[i] > 0) {
				System.out.println(numero_desglosado[i] + " Billete de " + billetes[i]);
			}
			
		}
		
		System.out.println("Sobran " + numero + " euros");
		
		
	}

	public static void main(String[] args) {
		ejercicio12();
	}

}
