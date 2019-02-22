
public class moto extends vehiculos {
	private boolean equipamiento;

	protected moto() {

	}
	
	/**
	 * @param color
	 * @param matricula
	 * @param marca
	 * @param modelo
	 * @param bastidor
	 * @param estado
	 * @param equipamiento
	 */
	protected moto(String color, String matricula, String marca, String modelo, String bastidor, String estado,
			boolean equipamiento) {
		super(color, matricula, marca, modelo, bastidor, estado);
		this.equipamiento = equipamiento;
	}

	@Override
	public String toString() {
		String mensaje = "La moto tien  [equipamiento: " + equipamiento;
		return super.toString() + mensaje;
	}

}
