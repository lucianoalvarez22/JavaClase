package tema4RepasoDos;

public class Electrodomestico {
	
	//ATRIBUTOS
	protected String marca;
	protected String modelo;
	protected int consumoWatios;
	
	
	
	//CONSTRUCTOR
	public Electrodomestico(String marca, String modelo, int consumoWatios) {
		this.marca = marca;
		this.modelo = modelo;
		this.consumoWatios = consumoWatios;
	}
	
	//CONSTRUCTOR COPIA
	public Electrodomestico(Electrodomestico Ele) {
		this.marca = Ele.marca;
		this.modelo = Ele.modelo;
		this.consumoWatios = Ele.consumoWatios;
	}

	//GET AND SET
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getConsumoWatios() {
		return consumoWatios;
	}

	public void setConsumoWatios(int consumoWatios) {
		this.consumoWatios = consumoWatios;
	}

	//TO STRING
	@Override
	public String toString() {
		return "Electrodomestico [marca=" + marca + ", modelo=" + modelo + ", consumoWatios=" + consumoWatios + "]";
	}
	
	//EQUALS
	@Override
	public boolean equals(Object obj) {
		Electrodomestico Elec = (Electrodomestico) obj;
		if(this==Elec) 
			return true;
			else {
				if (this.marca.equals(Elec.marca) && this.modelo.equals(Elec.modelo) && this.consumoWatios==Elec.consumoWatios)
					return true;
				return false;
			}
		}
	
	//CLONE
	@Override
	public Object clone() throws CloneNotSupportedException {
		return new Electrodomestico(this.marca, this.modelo, this.consumoWatios); 
	}
	}
