
public abstract class vehiculos {

	protected String color;
	protected String matricula;
	protected String marca;
	protected String modelo;
	protected String bastidor;
	protected String estado;
	protected double precioDia;
	protected String combustible;

	protected vehiculos() {

	}

	protected vehiculos(String color, String matricula, String marca, String modelo, String bastidor, String estado,
			double precioDia, String combustible) {

		this.color = color;
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.bastidor = bastidor;
		this.estado = estado;
		this.precioDia = precioDia;
		this.combustible = combustible;
	}

	/**
	 * @return the color
	 */
	protected String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	protected void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the matricula
	 */
	protected String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	protected void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return the marca
	 */
	protected String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	protected void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the modelo
	 */
	protected String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the bastidor
	 */
	protected String getBastidor() {
		return bastidor;
	}

	/**
	 * @param bastidor the bastidor to set
	 */
	protected void setBastidor(String bastidor) {
		this.bastidor = bastidor;
	}

	/**
	 * @return the estado
	 */
	protected String getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	protected void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * @return the precioDia
	 */
	protected double getPrecioDia() {
		return precioDia;
	}

	/**
	 * @param precioDia the precioDia to set
	 */
	protected void setPrecioDia(double precioDia) {
		this.precioDia = precioDia;
	}

	/**
	 * @return the combustible
	 */
	protected String getCombustible() {
		return combustible;
	}

	/**
	 * @param combustible the combustible to set
	 */
	protected void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public String toString() {
		String mensaje;
		mensaje = "Datos del vehículo: ";
		mensaje += "\n\tMarca: " + marca;
		mensaje += "\n\tModelo: " + modelo;
		mensaje += "\n\tColor: " + color;
		mensaje += "\n\tBastidor: " + bastidor;
		mensaje += "\n\tMatrícula: " + matricula;
		mensaje += "\n\tEstado: " + estado;
		mensaje += "\n\tPrecio por dia: " + precioDia;
		mensaje += "\n\tCombustible: " + combustible;
		return mensaje;
	}

}
