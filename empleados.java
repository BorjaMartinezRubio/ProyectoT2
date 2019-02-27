
public class empleados extends personas {

	// Atributos
	private double antigüedad, salario;
	private String puesto; // Dependiendo del puesto podrá modificar unas cosas u otras
	private String especialidad; // Especialista en coches, motos, camiones...

	/**
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param contraseña
	 * @param telefono
	 * @param edad
	 * @param antigüedad
	 * @param salario
	 * @param puesto
	 * @param especialidad
	 */
	protected empleados(String nombre, String apellidos, String dni, String contraseña, int telefono, int edad,
			double antigüedad, double salario, String puesto, String especialidad) {
		super(nombre, apellidos, dni, contraseña, telefono, edad);
		this.antigüedad = antigüedad;
		this.salario = salario;
		this.puesto = puesto;
		this.especialidad = especialidad;
	}

	protected double getAntigüedad() {
		return antigüedad;
	}

	protected void setAntigüedad(double antigüedad) {
		this.antigüedad = antigüedad;
	}

	protected double getSalario() {
		return salario;
	}

	protected void setSalario(double salario) {
		this.salario = salario;
	}

	protected String getPuesto() {
		return puesto;
	}

	protected void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	protected String getEspecialidad() {
		return especialidad;
	}

	protected void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see personas#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String mensaje;
		mensaje = "\n\tAños de antigüedad: " + antigüedad;
		mensaje += "\n\tSalario: " + salario;
		mensaje += "\n\tPuesto: " + puesto;
		mensaje += "\n\tEspecialidad: " + especialidad;
		return super.toString() + mensaje;
	}

}
