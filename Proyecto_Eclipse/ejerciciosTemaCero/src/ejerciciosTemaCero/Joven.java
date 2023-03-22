package ejerciciosTemaCero;

public class Joven {

	static int edad = 20;
	static int nivelDeEstudios = 4;
	static int ingresos = 28888;
	static boolean jasp;
	
	public static void ejercicio6() {
		int i = 0x100;
		//i >>>=1;
		System.out.println(i);
	}

	public void ejercicio5() {

		if (edad <= 28 && nivelDeEstudios > 3 && ingresos > 28000) {
			jasp = true;
		}

		System.out.println(jasp);
	}

	public static void main(String[] args) {
		Joven joven1 = new Joven();
		joven1.ejercicio5();

	}

}
