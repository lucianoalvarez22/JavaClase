package ejerciciosFinanzas;

public class finanzas {
	
	//ATRIBUTOSA
	double tipoCambio;
	
	
	//CONSTRUCTOR
	public finanzas() {
		tipoCambio = 1.36;
	}
	
	public finanzas(double cambio) {
		tipoCambio = 1.36;
	}


	//METODOS
	public void modificaTipoCambio(double NuevoCambio) {
		tipoCambio = NuevoCambio;
	}
	
	public double dolaresToEuros(double dolares) {
		return dolares/tipoCambio;
		
	}
	
	
	public double eurosToDolares(double euros) {
		return euros*tipoCambio;
	}
	
	

	public static void main(String[] args) {
		
		finanzas fin2 = new finanzas(1.50);
		
		
		
		finanzas fin1 = new finanzas();
		double resultado = fin1.dolaresToEuros(45.67);
		System.out.println(resultado);
		
		

	}


}
