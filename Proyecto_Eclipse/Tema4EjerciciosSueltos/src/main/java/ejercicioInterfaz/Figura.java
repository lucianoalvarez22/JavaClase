package ejercicioInterfaz;

public class Figura {

	protected String color;

	public Figura(String color) {
		this.color = color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	@Override
	public boolean equals(Object obj) {
		Figura f1 = (Figura) obj;
		if (this == f1)
			return true;
		if (f1 == null)
			return false;
		if(!(f1 instanceof Figura))
			return false;
		else {
			if (this.color.equals(f1.color))
				return true;
			return false;
		}
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//return super.clone(); ESTO TAMBIÉN VALDRÍA
		return new Figura(this.color);
	}

}
