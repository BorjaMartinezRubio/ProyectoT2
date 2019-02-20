

public class coche extends vehiculos {
	private boolean asientos;
	private  coche() {
		
	}

	protected coche(String color, String matricula, String modelo, String bastidor, String estado,boolean asientos) {
		super(color, matricula, modelo, bastidor, estado);
		this.asientos=asientos;
		
	}

	protected coche(String matricula, String modelo, String bastidor) {
		super(matricula, modelo, bastidor);
		this.asientos=asientos;
		
	}

	
	

	protected boolean isAsientos() {
		return asientos;
	}

	protected void setAsientos(boolean asientos) {
		this.asientos = asientos;
	}

	@Override
	public String toString() {
	
				String mensaje="El coche tiene asientos:" + asientos ;
				return super.toString()+mensaje;
	}






}
