
public class empleados extends personas {

	// Atributos
	protected double antigüedad, salario;
	protected String puesto; // ¿Utilizamos puestos para que dependiendo de este pueda realizar cambios de
								// unas cosas u otras?
	protected String especialidad; // Especialista en coches, motos, camiones...
	
	
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

	

}
