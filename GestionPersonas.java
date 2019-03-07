import java.util.ArrayList;
import java.util.Iterator;

public class GestionPersonas {

	private ArrayList<personas> listaPersonas = new ArrayList<personas>();

	// Crear una nueva persona
	protected void crearPersona(personas p1) {
		boolean control = true;
		Iterator<personas> personasIterator = listaPersonas.iterator();
		while (personasIterator.hasNext() && control) {
			personas p2 = personasIterator.next();
			if (p2.getDni().equalsIgnoreCase(p1.getDni())) {
				control = false;
			}
		}
		if (control) {
			listaPersonas.add(p1);
			System.out.println("Persona insertada correctamente");
		} else {
			System.out.println("No se ha podido insertar a la persona");
		}
	}

	protected void borrarPersona(String dni) {

		boolean control = true;
		Iterator<personas> personasIterator = listaPersonas.iterator();
		while (personasIterator.hasNext() && control) {
			personas persona1 = personasIterator.next();
			if (persona1.getDni().equalsIgnoreCase(dni)) {
				listaPersonas.remove(persona1);
				control = false;
				System.out.println("Persona eliminada correctamente");
			}
		}
		if (control) {
			System.out.println("Persona no encontrada");
		}
	}

	// Mostrar clientes
	protected void mostrarClientes() {

		for (int i = 0; i < listaPersonas.size(); i++) {

			if (listaPersonas.get(i) instanceof clientes) {

				System.out.println((listaPersonas.get(i)).toString());

			}
		}
		if (listaPersonas.size() <= 0) {
			System.out.println("No hay clientes insertados");
		}
	}

	// Buscar una persona en el arraylist y devolver el objeto
	protected personas buscarPersonas(String dni) {
		boolean control = true;
		Iterator<personas> personasIterator = listaPersonas.iterator();
		personas p3 = null;
		while (personasIterator.hasNext() && control) {
			personas personas1 = personasIterator.next();
			if (personas1.getDni().equalsIgnoreCase(dni)) {
				p3 = personas1;
				System.out.println("Persona encontrada");
				control = false;
				//System.out.println(p3.toString());
			}
		}
		if (control) {
			System.out.println("Persona no encontrada");
		}
		return p3;
	}

	// Buscar la posicion en el arraylist de la persona deseada
	protected int buscarPosicion(String dni) {

		int posicion = -1;

		for (int i = 0; i < listaPersonas.size(); i++) {

			if (dni.equals((listaPersonas.get(i)).getDni())) {

				posicion = i;
				i = listaPersonas.size();

			} else {

				if (i == listaPersonas.size() - 1) {

					System.out.println(" Ese DNI no está asignado a ninguna persona registrada. ");

				}
			}
		}

		return posicion;
	}

	// Modificar persona
	protected void modificarPersona(int posicion, String queModifica, String loModificado) {

		int numModificado;
		double numModificado2;
		char modificado3;
		String queModificar = queModifica.toLowerCase();

		switch (queModificar) {

		case "nombre":

			(listaPersonas.get(posicion)).setNombre(loModificado);
			System.out.println("Nombre modificado correctamente");
			System.out.println("Nuevo nombre: " + listaPersonas.get(posicion).getNombre());

			break;

		case "apellidos":

			(listaPersonas.get(posicion)).setApellidos(loModificado);
			System.out.println("Apellidos modificados correctamente");
			System.out.println("Nuevos apellidos: " + listaPersonas.get(posicion).getApellidos());

			break;

		case "telefono":

			numModificado = Integer.parseInt(loModificado);

			(listaPersonas.get(posicion)).setTelefono(numModificado);
			System.out.println("Teléfono modificada correctamente");
			System.out.println("Teléfono nuevo: " + listaPersonas.get(posicion).getTelefono());

			break;

		case "edad":

			numModificado = Integer.parseInt(loModificado);

			(listaPersonas.get(posicion)).setEdad(numModificado);
			System.out.println("Edad modificada correctamente");
			System.out.println("Edad nueva: " + listaPersonas.get(posicion).getEdad());

			break;

		case "antigüedad":

			if (listaPersonas.get(posicion) instanceof empleados) {

				numModificado2 = Double.parseDouble(loModificado);

				((empleados) (listaPersonas.get(posicion))).setAntigüedad(numModificado2);
				System.out.println("Antigüedad modificada correctamente");
				System.out.println("Nueva antigüedad: " + ((empleados) (listaPersonas.get(posicion))).getAntigüedad());

			} else {

				System.out.println("Esta operación no es válida para este tipo de persona");
			}

			break;

		case "salario":

			if (listaPersonas.get(posicion) instanceof empleados) {

				numModificado2 = Double.parseDouble(loModificado);

				((empleados) (listaPersonas.get(posicion))).setSalario(numModificado2);
				System.out.println("Salario modificado correctamente");
				System.out.println("Nuevo salario: " + ((empleados) (listaPersonas.get(posicion))).getSalario());

			} else {

				System.out.println("Esta operación no es válida para este tipo de persona");
			}

			break;

		case "puesto":

			if (listaPersonas.get(posicion) instanceof empleados) {

				((empleados) (listaPersonas.get(posicion))).setPuesto(loModificado);
				System.out.println("Puesto de trabajo modificado correctamente");
				System.out
						.println("Nuevo puesto de trabajo: " + ((empleados) (listaPersonas.get(posicion))).getPuesto());

			} else {

				System.out.println("Esta operación no es válida para este tipo de persona");
			}

			break;

		case "especialidad":

			if (listaPersonas.get(posicion) instanceof empleados) {

				((empleados) (listaPersonas.get(posicion))).setEspecialidad(loModificado);
				System.out.println("Especialidad modificada correctamente");
				System.out.println(
						"Nueva especialidad: " + ((empleados) (listaPersonas.get(posicion))).getEspecialidad());

			} else {

				System.out.println("Esta operación no es válida para este tipo de persona");
			}

			break;

		case "direccion":

			if (listaPersonas.get(posicion) instanceof clientes) {

				((clientes) (listaPersonas.get(posicion))).setDireccion(loModificado);

			} else {

				System.out.println("Esta operación no es válida para este tipo de persona");
			}

			break;

		case "numero de carnet":

			if (listaPersonas.get(posicion) instanceof clientes) {

				((clientes) (listaPersonas.get(posicion))).setNumCarnet(loModificado);
				System.out.println("Número de carnet modificado correctamente");
				System.out.println(
						"Nuevo número de carnet: " + ((clientes) (listaPersonas.get(posicion))).getNumCarnet());

			} else {

				System.out.println("Esta operación no es válida para este tipo de persona");
			}

			break;

		case "tipo de carnet":

			if (listaPersonas.get(posicion) instanceof clientes) {

				((clientes) (listaPersonas.get(posicion))).setTipCarnet(loModificado);
				System.out.println("Tipo de carnet modificado correctamente");
				System.out
						.println("Nuevo tipo de carnet: " + ((clientes) (listaPersonas.get(posicion))).getTipCarnet());

			} else {

				System.out.println("Esta operación no es válida para este tipo de persona");
			}

			break;

		case "tipo de conductor":

			if (listaPersonas.get(posicion) instanceof clientes) {

				modificado3 = loModificado.charAt(0);

				((clientes) (listaPersonas.get(posicion))).setTipConductor(modificado3);
				System.out.println("Tipo de conductor modificado correctamente");
				System.out.println(
						"Nuevo tipo de conductor: " + ((clientes) (listaPersonas.get(posicion))).getTipConductor());

			} else {

				System.out.println("Esta operación no es válida para este tipo de persona");
			}

			break;

		case "contraseña":

			(listaPersonas.get(posicion)).setContraseña(loModificado);
			System.out.println("Contraseña modificada correctamente");

			break;

		default:

			System.out.println("La opción que has introducido es errónea");

			break;

		}

	}

	protected void reescribirPersona(int posicion, personas p) {

		listaPersonas.set(posicion, p);

	}

}
