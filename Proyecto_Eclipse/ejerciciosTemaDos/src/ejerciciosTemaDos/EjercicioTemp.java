package ejerciciosTemaDos;

public class EjercicioTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temperatura myTemp = new Temperatura();
		System.out.println(myTemp.celsiusToFarenheir(18.0));
		
		TemperaturaActual tempActualUno = new TemperaturaActual();
		tempActualUno.darTemperaturaActual(34);
		System.out.println(tempActualUno.devolverTemperatura());
	}

}
