package ejercicioCoche;

public class MainCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche coche1 = new Coche();
		System.out.println(coche1.getVelocidad());
		
		//Aumentar la velocidad
		coche1.acelera(120);
		System.out.println(coche1.getVelocidad());
		
		//Disminuir velocidad
		coche1.frena(50);
		System.out.println(coche1.getVelocidad());
		
	}

}
