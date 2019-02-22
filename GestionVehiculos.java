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
			if (vehiculo1 instanceof camion) {
				System.out.println(((camion) vehiculo1).toString());
			} else if (vehiculo1 instanceof coche) {
				System.out.println(((coche) vehiculo1).toString());
			} else if (vehiculo1 instanceof furgoneta) {
				System.out.println(((furgoneta) vehiculo1).toString());
			} else if (vehiculo1 instanceof moto) {
				System.out.println(((moto) vehiculo1).toString());
			} else if (vehiculo1 instanceof super_coche) {
				System.out.println(((super_coche) vehiculo1).toString());
			}

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
				if (v3 instanceof camion) {
					System.out.println(((camion) v3).toString());
				} else if (v3 instanceof coche) {
					System.out.println(((coche) v3).toString());
				} else if (v3 instanceof furgoneta) {
					System.out.println(((furgoneta) v3).toString());
				} else if (v3 instanceof moto) {
					System.out.println(((moto) v3).toString());
				} else if (v3 instanceof super_coche) {
					System.out.println(((super_coche) v3).toString());
				}
			}
		}
		if (control) {
			System.out.println("Vehiculo no encontrado");
		}
		return v3;
	}

}
