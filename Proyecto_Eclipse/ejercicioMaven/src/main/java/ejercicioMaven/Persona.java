package ejercicioMaven;

public class Persona {
	// ATRIBUTOS
	private String nombre;
	private int edad;
	private String DNI;
	private final String sexo;
	private int peso;
	private int altura;

	// ATRIBUTOS PARA EL METODO DE CALCULAR EL PESOIDEAL
	private final int peso_ideal = -1;
	private final int no_pesoideal = 0;
	private final int sobrepeso = 1;

	// Constructor por defecto
	public Persona() {
		super();
		nombre = "";
		edad = 0;
		this.DNI = generaDNI();
		sexo = "H";
		peso = 0;
		altura = 0;
	}

	// Constructor NOMBRE, EDAD Y SEXO
	public Persona(String nombre, int edad, String sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		if (!comprobarSexo(sexo)) {
			this.sexo = "H";
		} else {
			this.sexo = sexo;
		}
		this.DNI = generaDNI();
		peso = 0;
		altura = 0;
	}

	// Constructor con todos los atributos como parametros
	public Persona(String nombre, int edad, String DNI, String sexo, int peso, int altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = DNI;
		if (!comprobarSexo(sexo)) {
			this.sexo = "H";
		} else {
			this.sexo = sexo;
		}
		this.peso = peso;
		this.altura = altura;
	}

	// METODO CALCULA PESO IDEAL
//	public int calcularIMC() {
//		int pesoIdeal = peso / (altura * altura);
//
//		if (pesoIdeal < 20) {
//			return peso_ideal;
//		} else if (pesoIdeal >= 20 && pesoIdeal <= 25) {
//			System.out.println("Estas por debajo de tu peso ideal");
//			return no_pesoideal;
//		}
//		System.out.println("Tienes sobrepeso");
//		return sobrepeso;
//	}

	// METODO IMC PROFESOR JAVA
	public int dameIMC() throws IMCException {
		// DEVOLVER UN ARTIMETC EXCEPTION SI PESO <5 Y ALTURA >40
		int imc = 0;
		if (peso < 5 || altura < 40) {
			throw new IMCException("PESO Y ALTURA INCORRECTO");
		} else {
			imc = peso / (altura * altura);
			return imc; 
			
		}

	}

	// METODO MAYORIA DE EDAD
	//SI EDAD ES 0 QUE SALTE UNA EXEPICON = EDAD EXCEPTION
	public boolean esMayorDeEdad() throws EdadException {
		if(edad>0) {
			return edad >=18;
		} else {
			throw new EdadException("EDAD NO VALIDA");
		}
	}
	
	
	
	
	
//	public boolean esMayorDeEdad() {
//		if (this.edad >= 18) {
//			System.out.println("Mayor de edad");
//			return true;
//		}
//		System.out.println("Menor de edad");
//		return false;
//
//		 Forma simplificada de hacerlo
//		return this.edad >= 18;	
//	}

	// METODO COMPRUEBA SEXO
	private boolean comprobarSexo(String sexo) {
		if (sexo.equalsIgnoreCase("H") || sexo.equalsIgnoreCase("M")) {
			return true;
		}
		return false;
	}

	// TODA LA INFO DEL OBJETO TOSTRING
	public String toString() {
		return "Persona: Nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura;
	}

	// METODO PARA GENERAR DNI - NO VISIBLE AL EXTERIOR
	private String generaDNI() {
		double ochoDigitos = (int) 10000000 + Math.random() * 90000000;
		int posicionLetra = (int) ochoDigitos % 23;
		if (posicionLetra > 0) {
			posicionLetra = posicionLetra - 1;
		}
		char letra = (char) ('A' + posicionLetra);
		return String.valueOf((int) ochoDigitos) + letra;
	}

	// METODO SET DE TODOS LOS ATRIBUTOS EXCEPTO DNI Y TAMPOCO EL SEXO PORQUE ES UNA
	// CONSTANTE Y NO SE PUEDE MODIFICAR
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public static void main(String[] args) {

	}
}
