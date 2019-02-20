

	public class camion extends vehiculos  {
		private boolean estructura_carga;
		private int peso;
		private int PMA;
		
		protected camion() {
			
		}

		protected camion(String color, String matricula, String modelo, String bastidor, String estado) {
			super(color, matricula, modelo, bastidor, estado);
			this.estructura_carga=estructura_carga;
			this.peso=peso;
			this.PMA=PMA;
		}

		protected camion(String matricula, String modelo, String bastidor) {
			super(matricula, modelo, bastidor);
			this.PMA=PMA;
		}

		public boolean isEstructura_carga() {
			return estructura_carga;
		}

		public void setEstructura_carga(boolean estructura_carga) {
			this.estructura_carga = estructura_carga;
		}

		public int getPeso() {
			return peso;
		}

		public void setPeso(int peso) {
			this.peso = peso;
		}

		public int getPMA() {
			return PMA;
		}

		public void setPMA(int pMA) {
			PMA = pMA;
		}

		@Override
		public String toString() {
			String mensaje="El camion tiene estructura_carga: " + estructura_carga + ",su peso es:" + peso + " y su PMA es: " + PMA ;
		
			return super.toString()+mensaje;
		
		}

		
		
		
}
