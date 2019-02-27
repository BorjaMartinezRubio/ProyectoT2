import java.util.ArrayList;
import java.util.Iterator;

public class revisiones {
	
	private ArrayList <empleados> listaEmpleados = new ArrayList <empleados>();
	private String fecha, descripcion;
	private int id;
	
	protected revisiones(String fecha, String descripcion, int id) {
		super();
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.id = id;
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
