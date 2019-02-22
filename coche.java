

public class coche extends vehiculos {
	private int asientos;
	private  coche() {
		
	}

	protected coche(String color, String matricula, String modelo, String bastidor, String estado,int asientos) {
		super(color, matricula, modelo, bastidor, estado);
		this.asientos=asientos;
		
	}

	protected int isAsientos() {
		return asientos;
	}

	protected void setAsientos(int asientos) {
		this.asientos = asientos;
	}

	@Override
	public String toString() {
				String mensaje=". El coche tiene " + asientos  + " asientos";
				return super.toString()+mensaje;
	}
}
