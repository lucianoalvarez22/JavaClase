package ejercicioInterfaz;

public class Rectangulo extends Figura implements Area {

	private double altura;
	private double anchura;

	public Rectangulo(double altura, double anchura, String color) {
		super(color);
		this.altura = altura;
		this.anchura = anchura;
	}

	public double obtenerArea() {
		return this.altura * this.anchura;
	}

	@Override
	public boolean equals(Object obj) {
		Rectangulo recEqu = (Rectangulo) obj;
		if (this == recEqu)
			return true;
		if (recEqu == null)
			return false;
		if(!(recEqu instanceof Rectangulo))
			return false;
		else {
			if (super.equals(recEqu)) {
				if (this.altura == recEqu.altura && this.anchura == recEqu.anchura)
					return true;
			}
			return false;
		}
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Figura figu = (Figura) super.clone();
		return new Rectangulo(this.altura, this.anchura, figu.color);
	}

}
