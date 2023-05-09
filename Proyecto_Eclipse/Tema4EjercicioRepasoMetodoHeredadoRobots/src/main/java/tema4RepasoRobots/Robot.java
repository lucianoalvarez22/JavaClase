package tema4RepasoRobots;

public class Robot {

	// ATRIBUTOS
	private int name;
	private int model;
	private int clase;

	// ATRIBUTO DE CLASE
	private static int numeroDeRobots = 0;

	// Constructor
	public Robot(int name, int model, int clase) {
		this.name = name;
		this.model = model;
		this.clase = clase;
		numeroDeRobots++;
	}

	// CONSTRUCTOR COPIA

	public Robot(Robot r) {
		this(r.name, r.model, r.clase); // SE METE EN EL CONSTRUCTOR DE ARRIBA
	}

	// GET AND SET

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public int getClase() {
		return clase;
	}

	public void setClase(int clase) {
		this.clase = clase;
	}

	public static int getNumeroDeRobots() {
		return numeroDeRobots;
	}

	// TO STRING
	@Override
	public String toString() {
		return "Robot: name=" + name + ", model=" + model + ", clase=" + clase + "Numero de Robots: "
				+ Robot.numeroDeRobots;
	}

	// EQUALS
	@Override
	public boolean equals(Object obj) {
		Robot robotEq = (Robot) obj;
		if (this == robotEq)
			return true;
		if (robotEq == null)
			return false;
		else {
			if (this.name == robotEq.name && this.model == robotEq.model && this.clase == robotEq.clase)
				return true;
			return false;
		}
	}

	// CLONE
	@Override
	public Object clone() throws CloneNotSupportedException {
		return new Robot(this.name, this.model, this.clase);
	}

}
