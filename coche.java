
public class coche extends vehiculos {
	private int asientos;

	private coche() {

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
			double precioDia, String combustible, int asientos) {
		super(color, matricula, marca, modelo, bastidor, estado, precioDia, combustible);
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
		String mensaje;
		mensaje = "\n\tNúmero de asientos: " + asientos;
		return super.toString() + mensaje;
	}
}
