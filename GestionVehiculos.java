import java.util.ArrayList;
import java.util.Iterator;

public class GestionVehiculos {
	ArrayList<vehiculos> listaVehiculos = new ArrayList<vehiculos>();

	protected void insertarVehiculos(vehiculos vehiculoInsertar) {
		boolean control = true;
		Iterator<vehiculos> vehiculoIterator = listaVehiculos.iterator();
		while (vehiculoIterator.hasNext() && control) {
			vehiculos vehiculo1 = vehiculoIterator.next();
			if (vehiculo1.getBastidor().equalsIgnoreCase(vehiculoInsertar.getBastidor())) {
				control = false;
			}
		}
		if (control) {
			listaVehiculos.add(vehiculoInsertar);
			System.out.println("Vehiculo insertado correctamente");
		} else {
			System.out.println("No se ha podido insertar el vehiculo");
		}
	}

	protected void borrarVehiculos(String bastidor) {
		boolean control = true;
		Iterator<vehiculos> vehiculoIterator = listaVehiculos.iterator();
		while (vehiculoIterator.hasNext() && control) {
			vehiculos vehiculo1 = vehiculoIterator.next();
			if (vehiculo1.getBastidor().equalsIgnoreCase(bastidor)) {
				listaVehiculos.remove(vehiculo1);
				control = false;
				System.out.println("Vehiculo eliminado correctamente");
			}
		}
	}

	protected void mostrarVehiculos() {
		Iterator<vehiculos> vehiculoIterator = listaVehiculos.iterator();
		while (vehiculoIterator.hasNext()) {
			vehiculos vehiculo1 = vehiculoIterator.next();
			System.out.println(vehiculo1.toString());

		}
	}

	protected vehiculos buscarVehiculos(String bastidor) {
		boolean control = true;
		Iterator<vehiculos> vehiculoIterator = listaVehiculos.iterator();
		vehiculos v3 = null;
		while (vehiculoIterator.hasNext() && control) {
			vehiculos vehiculo1 = vehiculoIterator.next();
			if (vehiculo1.getBastidor().equalsIgnoreCase(bastidor)) {
				v3 = vehiculo1;
				System.out.println("Vehiculo encontrado");
				control = false;
				System.out.println(v3.toString());
			}
		}
		if (control) {
			System.out.println("Vehiculo no encontrado");
		}
		return v3;
	}

}
