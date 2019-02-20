

public class moto extends vehiculos  {
	private boolean equipamiento;
	
	
	protected moto() {
		
	}


	protected moto(String color, String matricula, String modelo, String bastidor, String estado,boolean equipamieto) {
		super(color, matricula, modelo, bastidor, estado);
		this.equipamiento=equipamiento;
		
	}


	protected moto(String matricula, String modelo, String bastidor) {
		super(matricula, modelo, bastidor);
		this.equipamiento=equipamiento;
	
	}


	
	public String toString() {
		String mensaje= "La moto tien  [equipamiento: " + equipamiento ;
		return super.toString()+mensaje;
	}


}
