package tema4RepasoDos;

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
		return "Frigorifico [temperatura=" + temperatura + ", marca=" + marca + ", modelo=" + modelo
				+ ", consumoWatios=" + consumoWatios + "]";
	}
	
	//EQUALS
	@Override
	public boolean equals(Object obj) {
		Frigorifico frig = (Frigorifico) obj;
		if(this==frig)
			return  true;
		else {
			if(this.temperatura == frig.temperatura && this.marca.equals(marca) && this.modelo.equals(modelo) && this.consumoWatios==frig.consumoWatios)
				return true;
			return false;
		}
	}
	
	//CLONE
	@Override
	public Object clone() throws CloneNotSupportedException {
		return new Frigorifico(this.temperatura, this.marca, this.modelo, this.consumoWatios);
		
	}
	
	
	
	
	
	
	
	
	
}
