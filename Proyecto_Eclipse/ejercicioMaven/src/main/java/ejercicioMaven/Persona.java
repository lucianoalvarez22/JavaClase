package ejercicioMaven;

public class Persona {
	//ATRIBUTOS
	private String nombre;
	private int edad;
	private String DNI;
	private final String sexo;
	private double peso;
	private double altura;
	
	//ATRIBUTOS PARA EL METODO DE CALCULAR EL PESOIDEAL
	private final int peso_ideal = -1;
	private final int no_pesoideal = 0;
	private final int sobrepeso = 1;
	
	//Constructor por defecto
	public Persona() {
		nombre = "";
		edad = 0;
		this.DNI = generaDNI();
		sexo = "H";
		peso = 0.0;
		altura = 0.0;
	}


	//Constructor NOMBRE, EDAD Y SEXO
	public Persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		if (!comprobarSexo(sexo)){
			  this.sexo = "H";
			}else{
			  this.sexo=sexo;
			}
		this.DNI = generaDNI();
		peso = 0.0;
		altura = 0.0; 
	}
	
	//Constructor con todos los atributos como parametros
	public Persona(String nombre, int edad, String DNI, String sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = DNI;
		if (!comprobarSexo(sexo)){
			  this.sexo = "H";
			}else{
			  this.sexo=sexo;
			}
		this.peso = peso;
		this.altura = altura;
	}

	//METODO CALCULA PESO IDEAL
	public int calcularIMC() {
		double pesoIdeal = this.peso/(Math.pow(this.altura, 2));
		
		if(pesoIdeal<20) {
			return peso_ideal;
		} else if(pesoIdeal>=20 && pesoIdeal<=25) {
			System.out.println("Estas por debajo de tu peso ideal");
			return no_pesoideal;
		}
		System.out.println("Tienes sobrepeso"); 
		return sobrepeso;
	}
	
	//METODO MAYORIA DE EDAD
	public boolean esMayorDeEdad() {
		if(this.edad>=18) {
			System.out.println("Mayor de edad");
			return true;
		}
		System.out.println("Menor de edad");
		return false;
		
		//Forma simplificada de hacerlo
//		return this.edad >= 18;	
	}
	
	//METODO COMPRUEBA SEXO
	private boolean comprobarSexo(String sexo){
		if(sexo.equalsIgnoreCase("H") || sexo.equalsIgnoreCase("M")) {
	        return true;
	    }
	    return false;
	}
	
	
	//TODA LA INFO DEL OBJETO TOSTRING
	public String toString() {
		return "Persona: Nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura;
	}
	
	//METODO PARA GENERAR DNI - NO VISIBLE AL EXTERIOR
	private String generaDNI() {
		double ochoDigitos = (int)10000000 + Math.random() * 90000000;
		int posicionLetra = (int)ochoDigitos%23;
		if(posicionLetra>0) {
			posicionLetra = posicionLetra-1;
		}
		char letra = (char)('A' + posicionLetra);  
		return String.valueOf((int)ochoDigitos) + letra;
	}
	
	//METODO SET DE TODOS LOS ATRIBUTOS EXCEPTO DNI Y TAMPOCO EL SEXO PORQUE ES UNA CONSTANTE Y NO SE PUEDE MODIFICAR
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}



	public static void main(String[] args) {
		Persona persona1 = new Persona(); //CONSTRUCTOR 1
		Persona persona2 = new Persona("Luciano", 28, "H"); //CONSTRUCTOR 2
		Persona persona3 = new Persona("Alexis", 28, "1234567L", "abc", 60.0, 1.71); //CONSTRUCTOR 3
		
		System.out.println(persona1.toString());
		System.out.println(persona2.toString());
		System.out.println(persona3.toString());

	}
}
