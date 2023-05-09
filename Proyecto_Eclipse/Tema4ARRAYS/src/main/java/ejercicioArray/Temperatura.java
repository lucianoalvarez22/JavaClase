package ejercicioArray;

public class Temperatura {
	
	
	public static void main(String[] args) {
		byte [] temperaturas = {11,11,12,13,15,16,17,18,18};
		
		//System.out.println(temperaturas);
		
		for (byte b : temperaturas) {
			System.out.print(b + ",");
		}
		
		byte [] temperaturasClon = temperaturas.clone();
		System.out.println("-----------------------------------");
		
		for (byte b : temperaturasClon) {
			System.out.println(b);
		}
		
		byte[] temperaturasCopia = temperaturas;
		System.out.println("\n -------------------------");
		
		if(temperaturas.equals(temperaturasClon)) {
			System.out.println("temperatura == temperaturaClon");
		} else {
			System.out.println("temperatura != temperaturaClon");
		}
	}
}
