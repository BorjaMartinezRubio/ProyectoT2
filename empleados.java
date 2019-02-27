
public class empleados extends personas {

	// Atributos
	private double antig�edad, salario;
	private String puesto; // Dependiendo del puesto podr� modificar unas cosas u otras
	private String especialidad; // Especialista en coches, motos, camiones...

	/**
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 * @param contrase�a
	 * @param telefono
	 * @param edad
	 * @param antig�edad
	 * @param salario
	 * @param puesto
	 * @param especialidad
	 */
	protected empleados(String nombre, String apellidos, String dni, String contrase�a, int telefono, int edad,
			double antig�edad, double salario, String puesto, String especialidad) {
		super(nombre, apellidos, dni, contrase�a, telefono, edad);
		this.antig�edad = antig�edad;
		this.salario = salario;
		this.puesto = puesto;
		this.especialidad = especialidad;
	}

	protected double getAntig�edad() {
		return antig�edad;
	}

	protected void setAntig�edad(double antig�edad) {
		this.antig�edad = antig�edad;
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
		mensaje = "\n\tA�os de antig�edad: " + antig�edad;
		mensaje += "\n\tSalario: " + salario;
		mensaje += "\n\tPuesto: " + puesto;
		mensaje += "\n\tEspecialidad: " + especialidad;
		return super.toString() + mensaje;
	}

}
