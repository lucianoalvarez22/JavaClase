package ejercicioMinutero;

public class MiNumero {
	//ATRIBUTOS
	double numero;
	
	
	// CONSTRUCTOR
	MiNumero() {
		numero = 2;
	}
	
	
	//METODOS 
	public void modificaNumero(double NuevoNumero) {
		numero = NuevoNumero;
	}
	
	public double cambioADoble() {
		return numero*2;
	}
	
	public double cambioATriple() {
		return numero*3;
	}
	

	public double cambioACuadruple() {
	return numero*4;
	}


	// MAIN
	public static void main(String[] args) {
		
		MiNumero num1 = new MiNumero();
		num1.modificaNumero(4);
		
		
		
		System.out.println(	num1.cambioADoble());
	}

}
