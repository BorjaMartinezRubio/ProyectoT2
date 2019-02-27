
public abstract class personas {

	// Atributos
	protected String nombre, apellidos, dni, contraseña;
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
	 * @param contraseña
	 * @param telefono
	 * @param edad
	 */
	protected personas(String nombre, String apellidos, String dni, String contraseña, int telefono, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.contraseña = contraseña;
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
	 * @return the contraseña
	 */
	protected String getContraseña() {
		return contraseña;
	}

	/**
	 * @param contraseña the contraseña to set
	 */
	protected void setContraseña(String contraseña) {
		this.contraseña = contraseña;
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
