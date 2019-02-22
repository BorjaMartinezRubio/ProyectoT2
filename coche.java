

public class coche extends vehiculos {
	private int asientos;
	private  coche() {
		
	}

	/**
	 * @param color
	 * @param matricula
	 * @param marca
	 * @param modelo
	 * @param bastidor
	 * @param estado
	 * @param asientos
	 */
	protected coche(String color, String matricula, String marca, String modelo, String bastidor, String estado,
			int asientos) {
		super(color, matricula, marca, modelo, bastidor, estado);
		this.asientos = asientos;
	}



	protected int getAsientos() {
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
