
public class super_coche extends vehiculos {

	private int super_motor;

	private super_coche() {

	}

	protected super_coche(String color, String matricula, String modelo, String bastidor, String estado) {
		super(color, matricula, modelo, bastidor, estado);
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
		String mensaje = "El super_coche tiene un super_motor: " + super_motor;
		return super.toString() + mensaje;
	}

}
