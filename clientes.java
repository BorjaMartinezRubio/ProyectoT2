
public class clientes extends personas {
	protected String direccion, numCarnet, tipCarnet, contrase�a; //tipCarne (Ej: A, B1, B, A2)
	protected char TipConductor; //Pondremos N si es nobel y lleva menos de 2 a�os con carn� o E si es "experto" mas de dos a�os
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

		protected String getContrase�a() {
			return contrase�a;
		}

		protected void setContrase�a(String contrase�a) {
			this.contrase�a = contrase�a;
		}

		protected char getTipConductor() {
			return TipConductor;
		}

		protected void setTipConductor(char tipConductor) {
			TipConductor = tipConductor;
		}

}
