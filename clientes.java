
public class clientes extends personas {
	protected String direccion, numCarnet, tipCarnet; // tipCarne (Ej: A, B1, B, A2)
	protected char TipConductor; // Pondremos N si es nobel y lleva menos de 2 años con carné o E si es "experto"
									// mas de dos años
	protected vehiculos V1;

	/**
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param contraseña
	 * @param telefono
	 * @param edad
	 * @param direccion
	 * @param numCarnet
	 * @param tipCarnet
	 * @param tipConductor
	 * @param v1
	 */
	protected clientes(String nombre, String apellidos, String dni, String contraseña, int telefono, int edad,
			String direccion, String numCarnet, String tipCarnet, char tipConductor) {
		super(nombre, apellidos, dni, contraseña, telefono, edad);
		this.direccion = direccion;
		this.numCarnet = numCarnet;
		this.tipCarnet = tipCarnet;
		TipConductor = tipConductor;
	}

	// getter y setters
	protected String getDireccion() {
		return direccion;
	}

	protected void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	protected String getNumCarnet() {
		return numCarnet;
	}

	protected void setNumCarnet(String numCarnet) {
		this.numCarnet = numCarnet;
	}

	protected String getTipCarnet() {
		return tipCarnet;
	}

	protected void setTipCarnet(String tipCarnet) {
		this.tipCarnet = tipCarnet;
	}

	protected vehiculos getV1() {
		return V1;
	}

	protected void setV1(vehiculos v1) {
		V1 = v1;
	}

	protected char getTipConductor() {
		return TipConductor;
	}

	protected void setTipConductor(char tipConductor) {
		TipConductor = tipConductor;
	}

	protected void AsignarVehiculo(vehiculos V1) {

		this.V1 = V1;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see personas#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String mensaje;
		mensaje = "\n\tDireccion: " + direccion;
		mensaje += "\n\tNumero de carnet: " + numCarnet;
		mensaje += "\n\tTipo de carnet: " + tipCarnet;
		mensaje += "\n\tTipo de conductor: " + TipConductor;
		return super.toString() + mensaje;
	}

}
