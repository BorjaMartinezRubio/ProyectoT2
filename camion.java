
public class camion extends vehiculos {
	private boolean estructura_carga;
	private int peso;
	private int PMA;

	protected camion() {

	}

	protected camion(String color, String matricula, String modelo, String bastidor, String estado) {
		super(color, matricula, modelo, bastidor, estado);
		this.estructura_carga = estructura_carga;
		this.peso = peso;
		this.PMA = PMA;
	}

	/**
	 * @return the estructura_carga
	 */
	protected boolean isEstructura_carga() {
		return estructura_carga;
	}

	/**
	 * @param estructura_carga the estructura_carga to set
	 */
	protected void setEstructura_carga(boolean estructura_carga) {
		this.estructura_carga = estructura_carga;
	}

	/**
	 * @return the peso
	 */
	protected int getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	protected void setPeso(int peso) {
		this.peso = peso;
	}

	/**
	 * @return the pMA
	 */
	protected int getPMA() {
		return PMA;
	}

	/**
	 * @param pMA the pMA to set
	 */
	protected void setPMA(int pMA) {
		PMA = pMA;
	}

	@Override
	public String toString() {
		String mensaje = ". El camion tiene estructura_carga: " + estructura_carga + ",su peso es:" + peso
				+ " y su PMA es: " + PMA;

		return super.toString() + mensaje;

	}

}
