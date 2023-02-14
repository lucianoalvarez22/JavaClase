package ejerciciosNumero;

public class EjercicioNumero {
	
	//ATRIBUTO
	int numero;
	
	
	//CONSTRUCTOR
	public EjercicioNumero() {
		numero = 0;
	}
	
	//METODOS
	public int aniade(int numeroAniade) {
		return numero + numeroAniade;
	}
	
	public int resta(int numeroResta) {
		return numero - numeroResta;
	}
	
	
	//GETTERS SETTERS
	public int getValor() {  //Devuelve el valor interno
		return numero;
	}
	
	public int getDoble( int numeroDoble) {
		return numero*numeroDoble;
	}
	
	public int getTriple(int numeroTriple) {
		return numero*numeroTriple;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public static void main(String[] args) {
		
		EjercicioNumero num1 = new EjercicioNumero();
		num1.setNumero(5);
		
	
		System.out.println(num1.aniade(6));
		System.out.println(num1.resta(5));
		System.out.println(num1.getValor());
		System.out.println(num1.getDoble(4));
		System.out.println(num1.getTriple(3));
		
		//SET
		

	}

}
