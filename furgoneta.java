
public class furgoneta extends vehiculos {
	private int carga;
	private int asientos;

	protected furgoneta() {

	}

	/**
	 * @param color
	 * @param matricula
	 * @param marca
	 * @param modelo
	 * @param bastidor
	 * @param estado
	 * @param carga
	 * @param asientos
	 */
	protected furgoneta(String color, String matricula, String marca, String modelo, String bastidor, String estado,
			double precioDia, String combustible, int carga, int asientos) {
		super(color, matricula, marca, modelo, bastidor, estado, precioDia, combustible);
		this.carga = carga;
		this.asientos = asientos;
	}

	protected int getCarga() {
		return carga;
	}

	protected void setCarga(int carga) {
		this.carga = carga;
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
		mensaje = "\n\tCarga maxima: " + carga;
		mensaje += "\n\tNumero de asientos: " + asientos;
		return super.toString() + mensaje;
	}

}
