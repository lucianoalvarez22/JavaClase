package testRepaso2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import tema4RepasoDos.Electrodomestico;
import tema4RepasoDos.Frigorifico;

public class TestRepasoDos {
	
	@Test
	public void TestObjetosComplejos() throws CloneNotSupportedException {
		
		Electrodomestico elec1 = new Electrodomestico("Samsung", "Sam01", 140);
		Electrodomestico elec2 = new Electrodomestico("Siemens", "Siem54", 350);
		Electrodomestico elec3 = new Electrodomestico("Balay", "BalRTX", 220);
		Electrodomestico elec4 = elec1;
		Electrodomestico elecClon = (Electrodomestico) elec2.clone();
		Electrodomestico elec5 = new Electrodomestico(elec3);
		
		//ASSERTS
		assertFalse("Deberia ser falso", elec1 == elec2);
		assertTrue("Deberia ser true", elec4==elec1);
		assertFalse("Deberia ser falso", elec5 == elec3);
		assertFalse("Deberia ser falso", elecClon==elec2);
		
		//ASSERTS CON EQUALS
		assertFalse("Deberia ser falso", elec1.equals(elec2));
		assertFalse("Deberia ser falso", elec1.equals(elec5));
		assertTrue("Deberia ser true", elec4.equals(elec1));
		
		
		
		
		//TEST DE CLASE FRIGORIFICO
		Frigorifico frigo1 = new Frigorifico(30, elec1);
		Frigorifico frigo2 = new Frigorifico(30, elec2);
		Frigorifico frigo3 = new Frigorifico(30, elec3);
		Frigorifico frigo4 = (Frigorifico) frigo2.clone();
		Frigorifico frigo5 = frigo2;
		
		//ASSERTS FRIGORIFICO
		assertFalse("Deberia ser falso", frigo1 == frigo2);
		assertTrue("Deberia ser true", frigo5==frigo2);
		//EQUALS FRIGORIFICO
		assertTrue("Deberia ser true", frigo5.equals(frigo2));
		assertFalse("Deberia ser falso", frigo1.equals(frigo2));
		
		Frigorifico frigo6 = new Frigorifico(30, elec2);
		assertFalse("Deberia ser falso", frigo6 == frigo2);
		assertTrue("Deberia ser true", frigo6.equals(frigo2));
	}

}
