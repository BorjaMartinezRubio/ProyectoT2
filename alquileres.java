
public class alquileres {
	
	private String nombre, apellidos, dni, marca, modelo, matricula;

	protected alquileres(String nombre, String apellidos, String dni, String marca, String modelo, String matricula) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getApellidos() {
		return apellidos;
	}

	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	protected String getDni() {
		return dni;
	}

	protected void setDni(String dni) {
		this.dni = dni;
	}

	protected String getMarca() {
		return marca;
	}

	protected void setMarca(String marca) {
		this.marca = marca;
	}

	protected String getModelo() {
		return modelo;
	}

	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}

	protected String getMatricula() {
		return matricula;
	}

	protected void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String toString() {
		
		String mensaje;
		mensaje = "Datos del alquiler: ";
		mensaje += "\n\tMarca: " + marca;
		mensaje += "\n\tModelo: " + modelo;
		mensaje += "\n\tMatricula: " + matricula;
		mensaje += "\n\tNombre: " + nombre;
		mensaje += "\n\tApellidos: " + apellidos;
		mensaje += "\n\tDNI: " + dni;
		return mensaje;
		
	}

}
