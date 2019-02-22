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

	protected int buscarPosicion(String bastidor) {
		int posicion = -1;
		for (int i = 0; i < listaVehiculos.size(); i++) {
			if (bastidor.equalsIgnoreCase(listaVehiculos.get(i).getBastidor())) {
				posicion = i;
				i = listaVehiculos.size();
				System.out.println("Bastidor encontrado");
			} else if (i == listaVehiculos.size() - 1) {
				System.out.println("Ese bastidor no está asignado a ningun vehiculo registrado. ");
			}
		}
		return posicion;
	}

	protected void modificarVehiculos(int posicion, String valorModificar, String datoNuevo) { //POR FINALIZAR
		int numeroNuevo;
		boolean boolNuevo;
		String valorModificarMinusculas = valorModificar.toLowerCase();
		switch (valorModificarMinusculas) {
		case "color":
			(listaVehiculos.get(posicion)).setColor(datoNuevo);
			System.out.println("Color modificado correctamente");
			System.out.println("Color nuevo: " + (listaVehiculos.get(posicion)).getColor());
			break;
		case "matricula":
			(listaVehiculos.get(posicion)).setMatricula(datoNuevo);
			System.out.println("Matricula modificada correctamente");
			System.out.println("Matricula nueva: " + (listaVehiculos.get(posicion)).getColor());
			break;
		case "marca":
			(listaVehiculos.get(posicion)).setMarca(datoNuevo);
			System.out.println("Marca modificada correctamente");
			System.out.println("Marca nueva: " + (listaVehiculos.get(posicion)).getMarca());
			break;
		case "modelo":
			(listaVehiculos.get(posicion)).setModelo(datoNuevo);
			System.out.println("Modelo modificada correctamente");
			System.out.println("MModelo nueva: " + (listaVehiculos.get(posicion)).getModelo());
			break;
		case "bastidor":
			(listaVehiculos.get(posicion)).setBastidor(datoNuevo);
			System.out.println("Bastidor modificado correctamente");
			System.out.println("Bastidor nuevo: " + (listaVehiculos.get(posicion)).getBastidor());
			break;
		case "estado":
			if (datoNuevo.equalsIgnoreCase("nuevo") || datoNuevo.equalsIgnoreCase("seminuevo")
					|| datoNuevo.equalsIgnoreCase("vendido")) {
				(listaVehiculos.get(posicion)).setColor(datoNuevo);
				System.out.println("Estado modificado correctamente");
				System.out.println("Estado nuevo: " + (listaVehiculos.get(posicion)).getEstado());
			}
			break;
		case "asientos":
			if (listaVehiculos.get(posicion) instanceof coche) {
				numeroNuevo = Integer.parseInt(datoNuevo);
				((coche) (listaVehiculos.get(posicion))).setAsientos(numeroNuevo);
				System.out.println("Numero de asientos modificado correctamente");
				System.out
						.println("Numero de asientos nuevo: " + ((coche) (listaVehiculos.get(posicion))).getAsientos());
			} else if (listaVehiculos.get(posicion) instanceof furgoneta) {
				numeroNuevo = Integer.parseInt(datoNuevo);
				((furgoneta) (listaVehiculos.get(posicion))).setAsientos(numeroNuevo);
				System.out.println("Numero de asientos modificado correctamente");
				System.out.println(
						"Numero de asientos nuevo: " + ((furgoneta) (listaVehiculos.get(posicion))).getAsientos());
			} else {
				System.out.println("Esta operacion no es valida para este tipo de vehiculo");
			}
			break;
		case "estructura de carga":
			if (listaVehiculos.get(posicion) instanceof camion) {
				if (datoNuevo.equalsIgnoreCase("si")) {
					boolNuevo=true;
					((camion) (listaVehiculos.get(posicion))).setEstructura_carga(boolNuevo);
					//POR FINALIZAR
				}
			}
			break;
		case "carga":
			if (listaVehiculos.get(posicion) instanceof furgoneta) {
				numeroNuevo = Integer.parseInt(datoNuevo);
				((furgoneta) (listaVehiculos.get(posicion))).setCarga(numeroNuevo);
				System.out.println("Carga maxima modificada correctamente");
				System.out.println("Carga maxima nueva: " + ((furgoneta) (listaVehiculos.get(posicion))).getCarga());
			} else {
				System.out.println("Esta operacion no es valida para este tipo de vehiculo");
			}
			break;
		case "":
		}
	}
}
