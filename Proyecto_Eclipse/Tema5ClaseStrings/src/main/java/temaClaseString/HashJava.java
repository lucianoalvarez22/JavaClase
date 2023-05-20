package temaClaseString;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashJava {
	//TABLAS HASH
	//UNA CLASE DE CLAVE - VALOR (KEY-VALUE)
	//PUT PARA METER DATOS Y GET PARA OBTENER
	public static void main(String[] args) {
		
		//CREAR UNA TABLA HASH Y METER DENTRO NOMBRE, APELLIDOS, EDAD, DIRECCION, TELEFONO
		//RECUPERAR LOS DATOS Y MOSTRARLO POR PANTALLA DE MANERA DIRECTA A TRAVES DE LA KEYS
		Hashtable<String, String> dic = new Hashtable<String, String>();
		
		String key1 = new String("Nombre");
		String key2 = new String("Apellidos");
		String key3 = new String("Edad");
		String key4 = new String("Direccion");
		String key5 = new String("Telefono");
		
		dic.put(key1, "Luciano");
		dic.put(key2, "Alvarez");
		dic.put(key3, "29");
		dic.put(key4, "C/Hornos");
		dic.put(key5, "123");
		
//		System.out.println(dic.get(key1));
//		System.out.println(dic.get(key2));
//		System.out.println(dic.get(key3));
//		System.out.println(dic.get(key4));
//		System.out.println(dic.get(key5));
		
		
		//RECUPERAR E ITERAR LAS KEYS PARA SACAR LOS DATOS A TRAVEZ DE LAS KEYS Y POR CADA KEYS QUE SALGA EL VALOR
		//RECUPERAR E ITERAR LOS VALORES PARA SACAR LOS DATOS A TRAVEZ DE LOS VALORES
		
		Enumeration<String> en = dic.keys(); 
		
		while (en.hasMoreElements()) {
			
			String key = en.nextElement();
			
			System.out.println("key: " + key);
			System.out.println(dic.get(key));
		} 
		
		
		
		
		

	}

}
