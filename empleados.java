
public class empleados extends personas {

	// Atributos
	protected double antig�edad, salario;
	protected String puesto; // �Utilizamos puestos para que dependiendo de este pueda realizar cambios de
								// unas cosas u otras?
	protected String especialidad; // Especialista en coches, motos, camiones...
	
	
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

	

}
