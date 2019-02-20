

public class furgoneta extends vehiculos {
	private int carga;
	private int asientos;
	
	protected furgoneta() {
		
	}

	protected furgoneta(String color, String matricula, String modelo, String bastidor, String estado) {
		super(color, matricula, modelo, bastidor, estado);
		this.asientos=asientos;
		this.carga=carga;
	}

	protected furgoneta(String matricula, String modelo, String bastidor) {
		super(matricula, modelo, bastidor);
		this.asientos=asientos;
		this.carga=carga;
	}

	protected int getCarga() {
		return carga;
	}

	protected void setCarga(int carga) {
		this.carga = carga;
	}

	protected  int getAsientos() {
		return asientos;
	}

	protected  void setAsientos(int asientos) {
		this.asientos = asientos;
	}

	@Override
	public String toString() {
		String mensaje= "Lafurgoneta tiene una carga de : " + carga + ",los asientos son: " + asientos ;
		return super.toString()+mensaje;
	}


}
