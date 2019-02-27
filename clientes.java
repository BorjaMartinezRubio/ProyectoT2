
public class clientes extends personas {
	protected String direccion, numCarnet, tipCarnet, contraseña; //tipCarne (Ej: A, B1, B, A2)
	protected char TipConductor; //Pondremos N si es nobel y lleva menos de 2 años con carné o E si es "experto" mas de dos años
	protected vehiculos V1;
	
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

		protected String getContraseña() {
			return contraseña;
		}

		protected void setContraseña(String contraseña) {
			this.contraseña = contraseña;
		}

		protected char getTipConductor() {
			return TipConductor;
		}

		protected void setTipConductor(char tipConductor) {
			TipConductor = tipConductor;
		}

}
