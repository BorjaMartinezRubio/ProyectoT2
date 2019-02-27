import java.util.ArrayList;

public class revisiones {
	
	protected ArrayList <empleados> listaEmpleados = new ArrayList <empleados>();
	protected String fecha, descripcion;
	protected int id;
	
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
	
	protected int getId() {
		return id;
	}
	protected void setId(int id) {
		this.id = id;
	}
	
	public String toString() {
		String mensaje;
		mensaje = "Datos de las revisiones: ";
		mensaje += "\n\tId: " + id;
		mensaje += "\n\tFecha: " + fecha;
		mensaje += "\n\tDescripcion: " + descripcion;
		return mensaje;
	}
	
	
}
