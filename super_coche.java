
public class super_coche extends vehiculos {

	private int super_motor;

	private super_coche() {

	}

	/**
	 * @param color
	 * @param matricula
	 * @param marca
	 * @param modelo
	 * @param bastidor
	 * @param estado
	 * @param super_motor
	 */
	protected super_coche(String color, String matricula, String marca, String modelo, String bastidor, String estado,
			double precioDia, String combustible, int super_motor) {
		super(color, matricula, marca, modelo, bastidor, estado, precioDia, combustible);
		this.super_motor = super_motor;
	}

	protected int getSuper_motor() {
		return super_motor;
	}

	protected void setSuper_motor(int super_motor) {
		this.super_motor = super_motor;
	}

	@Override
	public String toString() {
		String mensaje;
		mensaje = "\n\tLa potencia del motor del supercoche es: " + super_motor + "cv";
		return super.toString() + mensaje;
	}

}
