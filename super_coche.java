
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
	protected void calcularPrecioTotal(String dias) {
		// TODO Auto-generated method stub
		final double complemento=75;
		double resultado;
		double diasDouble=Double.parseDouble(dias);
		resultado=diasDouble*(complemento+precioDia);
		System.out.println("Complemento por d�a (supercoche): " + complemento);
		System.out.println("El precio total del alquiler es: " + resultado);
	}
	
	@Override
	public String toString() {
		String mensaje;
		mensaje = "\n\tLa potencia del motor del supercoche es: " + super_motor + "cv";
		return super.toString() + mensaje;
	}

}
