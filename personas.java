
public abstract class personas {

	// Atributos
	protected String nombre, apellidos, dni, contrase�a;
	protected int telefono, edad;

	/**
	 * 
	 */
	protected personas() {
		super();
	}

	/**
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param contrase�a
	 * @param telefono
	 * @param edad
	 */
	protected personas(String nombre, String apellidos, String dni, String contrase�a, int telefono, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.contrase�a = contrase�a;
		this.telefono = telefono;
		this.edad = edad;
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

	protected int getTelefono() {
		return telefono;
	}

	protected void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	protected int getEdad() {
		return edad;
	}

	protected void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the contrase�a
	 */
	protected String getContrase�a() {
		return contrase�a;
	}

	/**
	 * @param contrase�a the contrase�a to set
	 */
	protected void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String mensaje;
		mensaje = "Datos personales: ";
		mensaje += "\n\tNombre: " + nombre;
		mensaje += "\n\tApellidos: " + apellidos;
		mensaje += "\n\tDNI: " + dni;
		mensaje += "\n\tTelefono: " + telefono;
		mensaje += "\n\tEdad: " + edad;
		return mensaje;
	}

}
