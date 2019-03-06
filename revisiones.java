public class revisiones {

	private String nombre, apellidos, dni, puesto;
	private String fecha, descripcion;

	protected revisiones(String fecha, String descripcion, String nombre, String apellidos, String dni,
			String puesto) {
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.puesto = puesto;
	}

	protected String getFecha() {
		return fecha;
	}

	protected void setFecha(String fecha) {
		this.fecha = fecha;
	}

	protected String getDescripcion() {
		return descripcion;
	}

	protected void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the nombre
	 */
	protected String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos
	 */
	protected String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the dni
	 */
	protected String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	protected void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the puesto
	 */
	protected String getPuesto() {
		return puesto;
	}

	/**
	 * @param puesto the puesto to set
	 */
	protected void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	@Override
	public String toString() {
		String mensaje;
		mensaje = "Datos de las revisiones: ";
		mensaje += "\n\tFecha: " + fecha;
		mensaje += "\n\tDescripcion: " + descripcion;
		mensaje += "\n\tRevisión realizada por: ";
		mensaje += "\n\t\tNombre: " + nombre;
		mensaje += "\n\t\tApellidos: " + apellidos;
		mensaje += "\n\t\tDNI: " + dni;
		mensaje += "\n\t\tPuesto: " + puesto;
		return mensaje;
	}

}
