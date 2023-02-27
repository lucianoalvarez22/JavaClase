package libreriaUsar;

import libreria.Calculadora;

public class UsaLibreriaCalculadora {

	static void pruebaUnitaria() {
		Calculadora mycalculadora = new Calculadora();
		int sumando1 = 1;
		int sumando2 = 2;
		int primeraSuma = mycalculadora.suma(sumando1, sumando2);

		// PRUEBA UNITARIA

		if (primeraSuma != 2) {
			System.out.println("La prueba unitaria está mal");
		}

	}

	public static void main(String[] args) {

		pruebaUnitaria();

	}

}