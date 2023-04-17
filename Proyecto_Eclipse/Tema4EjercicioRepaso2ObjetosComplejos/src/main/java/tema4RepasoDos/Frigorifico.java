package tema4RepasoDos;

import java.security.cert.X509CRLSelector;

public class Frigorifico extends Electrodomestico {
	
	//ATRIBUTO
	private int temperatura;
	
	//CONSTRUCTOR
	public Frigorifico(int temperatura, String marca, String modelo, int consumoWatios) {
		super(marca, modelo, consumoWatios);
		this.temperatura = temperatura;
	}
	
	//CONSTRUCTOR DE OTRA FORMA
	public Frigorifico(int temperatura, Electrodomestico Elec) {
		super(Elec);
		this.temperatura = temperatura;
	}
	
	//CONSTRUCTOR COPIA
	public Frigorifico(Frigorifico frigo) {
		super(frigo.marca, frigo.modelo, frigo.consumoWatios);
		this.temperatura = frigo.temperatura;
	}

	//GET AND SET
	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	
	//TO STRING
	@Override
	public String toString() {
		return "Frigorifico: " + super.toString() + " -Temperatura: " + this.temperatura;
	}
	
	//EQUALS
	@Override
	public boolean equals(Object obj) {
		Frigorifico frig = (Frigorifico) obj;
		if(this==frig)
			return  true;
		else {
			if(this.temperatura == frig.temperatura)
				return super.equals(obj);
				return false; 	
		} 
	}
	
	//CLONE
	@Override
	public Object clone() throws CloneNotSupportedException {
		Electrodomestico elecPadre = (Electrodomestico) super.clone(); //HACEMOS UN OBJETO DEL PADRE Y LO CLONAMOS
		return new Frigorifico(this.temperatura, elecPadre.marca, elecPadre.modelo, elecPadre.consumoWatios);
		
	}	
}
