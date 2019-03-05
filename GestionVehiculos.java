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
			System.out.println(vehiculoInsertar.toString());
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
		if (control) {
			System.out.println("El bastidor introducido no coincide con ningún vehículo registrado");
		}
	}

	protected void mostrarVehiculos() {
		boolean existenVehiculos = false;
		Iterator<vehiculos> vehiculoIterator = listaVehiculos.iterator();
		while (vehiculoIterator.hasNext()) {
			vehiculos vehiculo1 = vehiculoIterator.next();
			System.out.println(vehiculo1.toString());
			existenVehiculos = true;
		}
		if (!vehiculoIterator.hasNext() && existenVehiculos) {
			System.out.println("No hay más vehículos insertados");
		} else if (!vehiculoIterator.hasNext() && !existenVehiculos) {
			System.out.println("No hay vehículos insertados");
		}
	}

	protected void mostrarVehiculosDisponibles() {
		boolean existenVehiculos = false;
		Iterator<vehiculos> vehiculoIterator = listaVehiculos.iterator();
		while (vehiculoIterator.hasNext()) {
			vehiculos vehiculo1 = vehiculoIterator.next();
			if (vehiculo1.getEstado().equalsIgnoreCase("disponible")) {
				System.out.println(vehiculo1.toString());
				existenVehiculos = true;
			}
		}
		if (!vehiculoIterator.hasNext() && existenVehiculos) {
			System.out.println("No hay más vehículos disponibles");
		} else if (!vehiculoIterator.hasNext() && !existenVehiculos) {
			System.out.println("No hay vehículos disponibles");
		}
	}
	
	protected void mostrarVehiculos2() {
		
		System.out.println("Estos son los coches disponibles");
		for (int i = 0; i<listaVehiculos.size(); i++ ) {
			if (listaVehiculos.get(i) instanceof coche && listaVehiculos.get(i).getEstado().equalsIgnoreCase("disponible")) {
				System.out.println(listaVehiculos.get(i).toString());
			}
		}
		
		System.out.println("Estas son las furgonetas disponibles");
		for (int i = 0; i<listaVehiculos.size(); i++ ) {
			if (listaVehiculos.get(i) instanceof furgoneta && listaVehiculos.get(i).getEstado().equalsIgnoreCase("disponible")) {
				System.out.println(listaVehiculos.get(i).toString());
			}
		}
		
		System.out.println("Estos son los camiones disponibles");
		for (int i = 0; i<listaVehiculos.size(); i++ ) {
			if (listaVehiculos.get(i) instanceof camion && listaVehiculos.get(i).getEstado().equalsIgnoreCase("disponible")) {
				System.out.println(listaVehiculos.get(i).toString());
			}
		}
		
		System.out.println("Estas son las motos disponibles");
		for (int i = 0; i<listaVehiculos.size(); i++ ) {
			if (listaVehiculos.get(i) instanceof moto && listaVehiculos.get(i).getEstado().equalsIgnoreCase("disponible")) {
				System.out.println(listaVehiculos.get(i).toString());
			}
		}
		
		System.out.println("Estos son los super coches disponibles");
		for (int i = 0; i<listaVehiculos.size(); i++ ) {
			if (listaVehiculos.get(i) instanceof super_coche && listaVehiculos.get(i).getEstado().equalsIgnoreCase("disponible")) {
				System.out.println(listaVehiculos.get(i).toString());
			}
		}
			
	}

	protected vehiculos buscarVehiculos(String datoIntroducido) { // necesario para asignar vehiculos
		boolean control = true;
		Iterator<vehiculos> vehiculoIterator = listaVehiculos.iterator();
		vehiculos v3 = null;
		while (vehiculoIterator.hasNext() && control) {
			vehiculos vehiculo1 = vehiculoIterator.next();
			if (vehiculo1.getBastidor().equalsIgnoreCase(datoIntroducido)  || vehiculo1.getMatricula().equalsIgnoreCase(datoIntroducido)) {
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

	protected int buscarPosicion(String datoIntroducido) {
		int posicion = -1;
		for (int i = 0; i < listaVehiculos.size(); i++) {
			if (datoIntroducido.equalsIgnoreCase(listaVehiculos.get(i).getBastidor()) || datoIntroducido.equalsIgnoreCase(listaVehiculos.get(i).getMatricula())) {
				posicion = i;
				i = listaVehiculos.size();
				System.out.println("Dato encontrado");
			} else if (i == listaVehiculos.size() - 1) {
				System.out.println("Ese dato no está asignado a ningun vehiculo registrado. ");
			}
		}
		return posicion;
	}

	protected void modificarVehiculos(int posicion, String valorModificar, String datoNuevo) { // pendiente de mejoras
		int numeroNuevo;
		double decimalNuevo;
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
			if (datoNuevo.equalsIgnoreCase("disponible") || datoNuevo.equalsIgnoreCase("alquilado")) {
				(listaVehiculos.get(posicion)).setColor(datoNuevo);
				System.out.println("Estado modificado correctamente");
				System.out.println("Estado nuevo: " + (listaVehiculos.get(posicion)).getEstado());
			} else {
				System.out.println("El valor introducido no es valido");
			}
			break;
		case "precio por dia":
			decimalNuevo = Double.parseDouble(datoNuevo);
			(listaVehiculos.get(posicion)).setPrecioDia(decimalNuevo);
			System.out.println("Precio por dia modificado correctamente");
			System.out.println("Nuevo precio por dia: " + (listaVehiculos.get(posicion)).getPrecioDia());
			break;
		case "combustible":
			(listaVehiculos.get(posicion)).setCombustible(datoNuevo);
			System.out.println("Tipo de combustible modificado correctamente");
			System.out.println("Tipo de combustible nuevo: " + (listaVehiculos.get(posicion)).getCombustible());
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
					boolNuevo = true;
					((camion) (listaVehiculos.get(posicion))).setEstructura_carga(boolNuevo);
					System.out.println("Estructura de carga modificada correctamente");
					System.out.println("Nuevo valor de la estructura de carga: "
							+ ((camion) (listaVehiculos.get(posicion))).isEstructura_carga());
				} else if (datoNuevo.equalsIgnoreCase("no")) {
					boolNuevo = false;
					((camion) (listaVehiculos.get(posicion))).setEstructura_carga(boolNuevo);
					System.out.println("Estructura de carga modificada correctamente");
					System.out.println("Nuevo valor de la estructura de carga: "
							+ ((camion) (listaVehiculos.get(posicion))).isEstructura_carga());
				}
			} else {
				System.out.println("Esta operacion no es valida para este tipo de vehiculo");
			}
			break;
		case "peso":
			if (listaVehiculos.get(posicion) instanceof camion) {
				numeroNuevo = Integer.parseInt(datoNuevo);
				((camion) (listaVehiculos.get(posicion))).setPeso(numeroNuevo);
				System.out.println("Peso modificado correctamente");
				System.out.println("Peso nuevo: " + ((camion) (listaVehiculos.get(posicion))).getPeso());
			} else {
				System.out.println("Esta operacion no es valida para este tipo de vehiculo");
			}
			break;
		case "pma":
			if (listaVehiculos.get(posicion) instanceof camion) {
				numeroNuevo = Integer.parseInt(datoNuevo);
				((camion) (listaVehiculos.get(posicion))).setPMA(numeroNuevo);
				System.out.println("PMA modificado correctamente");
				System.out.println("PMA nuevo: " + ((camion) (listaVehiculos.get(posicion))).getPMA());
			} else {
				System.out.println("Esta operacion no es valido para este tipo de vehiculo");
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
		case "equipamiento":
			if (listaVehiculos.get(posicion) instanceof moto) {
				if (datoNuevo.equalsIgnoreCase("si")) {
					boolNuevo = true;
					((moto) (listaVehiculos.get(posicion))).setEquipamiento(boolNuevo);
					System.out.println("Equipamiento modificado correctamente");
					System.out.println("Equipamiento nuevo: " + ((moto) listaVehiculos.get(posicion)).isEquipamiento());
				} else if (datoNuevo.equalsIgnoreCase("no")) {
					boolNuevo = false;
					((moto) (listaVehiculos.get(posicion))).setEquipamiento(boolNuevo);
					System.out.println("Equipamiento modificado correctamente");
					System.out.println("Equipamiento nuevo: " + ((moto) listaVehiculos.get(posicion)).isEquipamiento());
				}
			} else {
				System.out.println("Esta operacion no es valida para este tipo de vehiculo");
			}
			break;
		case "cilindrada":
			if (listaVehiculos.get(posicion) instanceof moto) {
				numeroNuevo = Integer.parseInt(datoNuevo);
				((moto) (listaVehiculos.get(posicion))).setCilindrada(numeroNuevo);
				System.out.println("Cilindrada modificada correctamente");
				System.out.println("Cilindrada nueva: " + ((moto) (listaVehiculos.get(posicion))).getCilindrada());
			} else {
				System.out.println("Esta operacion no es valida para este tipo de vehiculo");
			}
			break;
		case "super motor":
			if (listaVehiculos.get(posicion) instanceof super_coche) {
				numeroNuevo = Integer.parseInt(datoNuevo);
				((super_coche) (listaVehiculos.get(posicion))).setSuper_motor(numeroNuevo);
				System.out.println("CV del super motor modificado correctamente");
				System.out.println(
						"CV del super motor nuevo: " + ((super_coche) (listaVehiculos.get(posicion))).getSuper_motor());
			} else {
				System.out.println("Esta operacion no es valida para este tipo de vehiculo");
			}
			break;
		default:
			System.out.println("La opción que has introducido es erronea");
			break;
		}
	}

	protected void añadirRevision(int posicion, revisiones R1) {
		if (posicion >= 0) {
			listaVehiculos.get(posicion).getListaRevisiones().add(R1);
			System.out.println("Revisión añadida correctamente");
			System.out.println(listaVehiculos.get(posicion).getListaRevisiones().toString());
		} else {
			System.out.println("Bastidor no encontrado");
		}
	}

	protected void reescribirVehiculo(int posicion, vehiculos v) {

		listaVehiculos.set(posicion, v);

	}

}
