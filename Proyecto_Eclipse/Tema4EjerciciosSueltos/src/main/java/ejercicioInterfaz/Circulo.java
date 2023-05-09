package ejercicioInterfaz;

public class Circulo extends Figura implements Area {

	private double radio;
	private final double PI = 3.14;

	public Circulo(double radio, String color) {
		super(color);
		this.radio = radio;
	}

	public double obtenerArea() {
		return PI * (this.radio * this.radio);
	}

	@Override
	public boolean equals(Object obj) {
		Circulo cirEqu = (Circulo) obj;
		if (this == cirEqu)
			return true;
		if (cirEqu == null)
			return false;
		else {
			if (super.equals(cirEqu)) {
				if (this.radio == cirEqu.radio)
					return true;
			}
			return false;
		}

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Figura figuraclon = (Figura) super.clone();
		return new Circulo(this.radio, figuraclon.color);
	}
}
