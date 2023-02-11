package ejerciciosClasroom;

public class EjerciciosPropuestos11 {
	
	public static void ejercicio11() {
		
		
		int t= 8675;
		int hora = t/3600;
		int minutos = ((t-hora*3600)/60);
		int segundos = t-(hora*3600+minutos*60);
		
		System.out.println("HORA:");
		System.out.println(hora+"h" + ":"  + minutos +"m " + segundos+"s" );
		
	}

	public static void main(String[] args) {
		ejercicio11();

	}

}
