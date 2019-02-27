
public class moto extends vehiculos {
	private boolean equipamiento;
	private int cilindrada;
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
	 * @param cilindrada
	 */
	protected moto(String color, String matricula, String marca, String modelo, String bastidor, String estado, double precioDia, String combustible,
			boolean equipamiento, int cilindrada) {
		super(color, matricula, marca, modelo, bastidor, estado, precioDia, combustible);
		this.equipamiento = equipamiento;
		this.cilindrada = cilindrada;
	}
	
	/**
	 * @return the equipamiento
	 */
	protected boolean isEquipamiento() {
		return equipamiento;
	}

	/**
	 * @param equipamiento the equipamiento to set
	 */
	protected void setEquipamiento(boolean equipamiento) {
		this.equipamiento = equipamiento;
	}

	/**
	 * @return the cilindrada
	 */
	protected int getCilindrada() {
		return cilindrada;
	}

	/**
	 * @param cilindrada the cilindrada to set
	 */
	protected void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		String mensaje="";
		if (equipamiento) {
			mensaje="\n\tLa moto tiene equipamiento incluido";
		} else if (!equipamiento) {
			mensaje="\n\tLa moto no tiene equipamiento incluido";
		}
		mensaje+="\n\tCilindrada: " + cilindrada + "cc";
		return super.toString() + mensaje;
	}

}
