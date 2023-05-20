package temaClaseString;

public class StringBufferJava {
	
	//STRING BUFFER
	//ES MUTABLE, PUEDE CAMBIAR DE VALOR
	//PRINCIPALES OPERAICONES APPEND - INSERT
	
	public static void main(String[] args) {
		
		//ASI SE CREAN LOS OBJETOS DE STRINGBUFFER
		StringBuffer nombre = new StringBuffer("Pepe");
		//System.out.println(nombre.capacity()); //IMPRIME 20 PORQUE POR DEFECTO ES 16 Y LA LONGITUD ES 4. 16+4=20
		
		
		StringBuffer apellidos = new StringBuffer("Alvarez"); //RESERVA UN ESPACIO EN MEMORIA PARA CAPACIDAD 80
		StringBuffer apellidos2 = new StringBuffer("Ochoa"); 
		apellidos.append(apellidos2); //METODO APPEND
		
		//System.out.println(apellidos);
		
		StringBuffer direccion = new StringBuffer();
		
		
		//CREAR UN STRINGBUFFER Y UTILIZAR CON LOS METODOS VISTOS
		// CONSTRUCTOR CONS STRING
		StringBuffer stringB = new StringBuffer("Luciano");
		//length
		System.out.println(stringB.length());
		//capacity
		System.out.println(stringB.capacity());
		//insert
		System.out.println(stringB.insert(0, "Alvarez"));
		//reverse
		System.out.println(stringB.reverse());
		//reservse nuevamente
		System.out.println(stringB.reverse());
		//delete
		System.out.println(stringB.delete(0, 7));
		//replace
		System.out.println(stringB.replace(0, 7, "Hola"));
		//substring
		System.out.println(stringB.substring(2));
		//toString
		System.out.println(stringB.toString());
		//chatArt
		System.out.println(stringB.charAt(3));
		//setChar
		stringB.setCharAt(2, 'o'); //TENGO QUE MODIFICARLO PRIMERO Y LUEGO IMPRIMIRLO PORQUE EL SETCHAT NO DEVUELVE NADA
		System.out.println(stringB);
		
		
		
		
	}

}
