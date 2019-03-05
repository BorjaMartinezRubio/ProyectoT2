import java.util.ArrayList;

public class clientes extends personas {
	private String direccion, numCarnet, tipCarnet; // tipCarne (Ej: A, B1, B, A2)
	private char TipConductor; // Pondremos N si es nobel y lleva menos de 2 años con carné o E si es "experto"
								// mas de dos años
	private vehiculos V1;
	private ArrayList<vehiculos> alquileresRealizados = new ArrayList<vehiculos>();

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
		if (this.V1 == null) {
			this.V1 = V1;
		} else {
			System.out.println("Solo puedes alquilar un vehículo al mismo tiempo");
		}

	}

	protected void alquilerCliente(vehiculos V1) {

		alquileresRealizados.add(V1);
	}

	/*
	 * protected void verAlquieresRealizados () {
	 * 
	 * System.out.println(" Lista de vehiculos alquilados "); for ( int i = 0; i<
	 * alquileresRealizados.size(); i++) {
	 * System.out.println(alquileresRealizados.get(i).toString()); } }
	 */

	protected void verAlquieresRealizados() {

		System.out.println(" Lista de vehiculos alquilados ");
		for (int i = 0; i < alquileresRealizados.size(); i++) {
			System.out.println(" Marca: " + alquileresRealizados.get(i).getMarca());
			System.out.println(" Modelo: " + alquileresRealizados.get(i).getModelo());

		}
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
