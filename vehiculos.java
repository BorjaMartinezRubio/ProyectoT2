

public class vehiculos {
	
	protected String nombreDueño;
	
	


	protected String color;
	protected String matricula;
	protected String modelo;
	protected String bastidor;
	protected String estado;
	
	
	
	protected vehiculos() {
		
	}


	protected vehiculos(String matricula, String modelo, String bastidor) {
		
		this.matricula = matricula;
		this.modelo = modelo;
		this.bastidor = bastidor;
	}







	protected vehiculos(String color, String matricula, String modelo, String bastidor, String estado) {
		
		this.color = color;
		this.matricula = matricula;
		this.modelo = modelo;
		this.bastidor = bastidor;
		this.estado = estado;
	}


	protected String getColor() {
		return color;
	}


	protected void setColor(String color) {
		this.color = color;
	}


	protected String getMatricula() {
		return matricula;
	}


	protected void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	protected String getModelo() {
		return modelo;
	}


	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}


	protected String getBastidor() {
		return bastidor;
	}


	protected void setBastidor(String bastidor) {
		this.bastidor = bastidor;
	}


	protected String getEstado() {
		return estado;
	}


	protected void setEstado(String estado) {
		this.estado = estado;
	}


	public String getNombreDueño() {
		return nombreDueño;
	}


	public void setNombreDueño(String nombreDueño) {
		this.nombreDueño = nombreDueño;
	}
	
	public String toString() {
		return "El nombre del cliente es: "+nombreDueño+"El color del vehiculo es:" + color + ",la matricula es: " + matricula + ",el modelo es:" + modelo + ",el numero de bastidor es:  bastidor="
				+ bastidor + "y su estado es:" + estado ;
	}

	







}
