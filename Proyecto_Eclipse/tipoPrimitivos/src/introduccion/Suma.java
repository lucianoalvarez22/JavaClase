package introduccion;

public class Suma {
	
	static int n1=50; // Variable MIEMBRO de la clase. Esta variable se puede utilizar dentro de toda la clase
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n2 = 30, suma=0; //Variables locales, solo se uso dentro del método en este caso el método MAIN
		suma = n1 + n2;
		System.out.println("LA SUMA ES: " + suma);
		
	}

}
