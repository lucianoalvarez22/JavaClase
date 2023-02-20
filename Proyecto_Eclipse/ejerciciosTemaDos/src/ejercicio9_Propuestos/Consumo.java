package ejercicio9_Propuestos;

public class Consumo {
	
	//ATRIBUTOS
	float km;
	float litros;
	float vmed;
	float precio_gaso;
	
	
	//CONSTRUCTOR 
	public Consumo(float km, float litros, float vmed, float precio_gaso) {
		this.km = km;
		this.litros = litros;
		this.vmed = vmed;
		this.precio_gaso = precio_gaso;
	}

	//METODOS EJERCICIO 9
	
	float getTiempo() {
		return km/vmed;
	}
	
	public float consumoMedio() {
		return (litros*100)/km; 
	}
	
	
	public float consumoEuros() {
		return consumoMedio()*precio_gaso; 
	}
	
	//EJERCICIO 10 METODOS MODIFICAR LOS ATRIBUTOS DE LA CLASE
	
	public void setKm(float km) {
		this.km = km;
	}
	

	public void setLitros(float litros) {
		this.litros = litros;
	}
	

	public void setVmed(float vmed) {
		this.vmed = vmed;
	}
	

	public void setPrecio_gaso(float precio_gaso) {
		this.precio_gaso = precio_gaso;
	}
	
	
	//METODO MAIN

	public static void main(String[] args) {
		Consumo consumo1 = new Consumo(90.0F, 20.5F, 80.0F, 50.0F);
		
		System.out.println(consumo1.getTiempo()); 
		System.out.println(consumo1.consumoMedio()); 
		System.out.println(consumo1.consumoEuros());

	}

}
