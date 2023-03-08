package ejercicioGestionEspecificasGenericas;

import java.util.Random;

public class PruebaEdadPersonas {
	
	
	
public void generaExcepcionEdad(int edad) throws InfantilException, AdultoException, MayorException {
	if (edad < 18) {
		throw new InfantilException("InfantilException");
	}
	else if (edad >= 18 && edad < 65) {
		throw new AdultoException("AdultoException");
	}
	else {
		throw new MayorException("MayorException");
	}
}
	
	
	//MAIN
	public static void main(String[] args) {
		
	}

}
