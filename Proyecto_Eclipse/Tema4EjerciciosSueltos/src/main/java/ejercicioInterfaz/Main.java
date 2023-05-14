package ejercicioInterfaz;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Circulo c1=new Circulo(5, "Azul");
		Figura f1=c1;
		
		Rectangulo r1=new Rectangulo(4,7, "Rojo");
		
		c1.obtenerArea();
		c1.obtenerArea();
				
		r1.obtenerArea();
		r1.getColor();
		
		Area Area1=c1;
		Area1.obtenerArea();
		
		Area Area2=r1;
		Area2.obtenerArea();	
		
		//---------------------
		
		Figura fig1=new Figura("Rojo");
		Figura fig2=new Figura("Azul");
		Figura fig3=fig2;
		Figura fig4=(Figura)fig2.clone();
	}

}
