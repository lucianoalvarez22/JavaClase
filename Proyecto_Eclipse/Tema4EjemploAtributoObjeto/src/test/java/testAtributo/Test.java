package testAtributo;


import ejemploAtributoObjeto.Direccion;
import ejemploAtributoObjeto.Localidad;
import ejemploAtributoObjeto.Mascota;
import ejemploAtributoObjeto.Persona;

public class Test {
	
	public void TestEjemplo() throws CloneNotSupportedException {
		
		Mascota m = new Mascota("Toby");
		Localidad loc = new Localidad("Sevilla", 41001);
		Direccion dir1 = new Direccion ("Calle", 1, loc, 1);
		Persona p1 = new Persona(20, "Alex", "11111", dir1, m);
		
		Persona perClone = (Persona) p1.clone();	}

}
