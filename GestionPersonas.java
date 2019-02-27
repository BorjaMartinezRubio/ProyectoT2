import java.util.ArrayList;

public class GestionPersonas {

	ArrayList<personas> listaPersonas = new ArrayList<personas>();

	// Crear una nueva persona
	private void crearPersona(personas p1) {

		listaPersonas.add(p1);

	}
	
	private void borrarPersona (int posicion) {
		
		listaPersonas.remove(posicion);
	}
	
	//Mostrar clientes
	private void mostrarClientes () {
		
		for(int i = 0; i< listaPersonas.size(); i++) {
			
			if (listaPersonas.get(i) instanceof clientes) {
				
				System.out.println((listaPersonas.get(i)).toString());
				
			}
		}
	}

	// Buscar la posicion en el arraylist de la persona deseada
	private int buscarPosicion(String dni) {

		int posicion = -1;

		for (int i = 0; i < listaPersonas.size(); i++) {

			if (dni.equals(((empleados) listaPersonas.get(i)).getDni())
					|| dni.equals(((clientes) listaPersonas.get(i)).getDni())) {

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
	private void modificarPersona(int posicion, String queModificar, String loModificado) {

		int numModificado;
		double numModificado2;
		char modificado3;

		switch (queModificar) {

		case "nombre":

			(listaPersonas.get(posicion)).setNombre(loModificado);

			break;

		case "Apellidos":

			(listaPersonas.get(posicion)).setApellidos(loModificado);

			break;

		case "telefono":

			numModificado = Integer.parseInt(loModificado);

			(listaPersonas.get(posicion)).setTelefono(numModificado);

			break;

		case "edad":

			numModificado = Integer.parseInt(loModificado);

			(listaPersonas.get(posicion)).setEdad(numModificado);

			break;

		case "antigüedad":

			if (listaPersonas.get(posicion) instanceof empleados) {

				numModificado2 = Double.parseDouble(loModificado);

				((empleados) (listaPersonas.get(posicion))).setAntigüedad(numModificado2);

			} else {

				System.out.println(" Tu eres ********** o que te pasa? No sabes que no eres un empleado?");
			}

			break;

		case "salario":

			if (listaPersonas.get(posicion) instanceof empleados) {

				numModificado2 = Double.parseDouble(loModificado);

				((empleados) (listaPersonas.get(posicion))).setSalario(numModificado2);

			} else {

				System.out.println(" Tu eres ********** o que te pasa? No sabes que no eres un empleado?");
			}

			break;

		case "puesto":

			if (listaPersonas.get(posicion) instanceof empleados) {

				((empleados) (listaPersonas.get(posicion))).setPuesto(loModificado);

			} else {

				System.out.println(" Tu eres ********** o que te pasa? No sabes que no eres un empleado?");
			}

			break;

		case "especialidad":

			if (listaPersonas.get(posicion) instanceof empleados) {

				((empleados) (listaPersonas.get(posicion))).setEspecialidad(loModificado);

			} else {

				System.out.println(" Tu eres ********** o que te pasa? No sabes que no eres un empleado?");
			}

			break;

		case "direccion":

			if (listaPersonas.get(posicion) instanceof clientes) {

				((clientes) (listaPersonas.get(posicion))).setDireccion(loModificado);

			} else {

				System.out.println(" Tu eres ********** o que te pasa? No sabes que no eres un cliente?");
			}

			break;

		case "numero de carnet":

			if (listaPersonas.get(posicion) instanceof clientes) {

				((clientes) (listaPersonas.get(posicion))).setNumCarnet(loModificado);

			} else {

				System.out.println(" Tu eres ********** o que te pasa? No sabes que no eres un cliente?");
			}

			break;

		case "tipo de carnet":

			if (listaPersonas.get(posicion) instanceof clientes) {

				((clientes) (listaPersonas.get(posicion))).setTipCarnet(loModificado);

			} else {

				System.out.println(" Tu eres ********** o que te pasa? No sabes que no eres un cliente?");
			}

			break;

		case "tipo de conductor":

			if (listaPersonas.get(posicion) instanceof clientes) {

				modificado3 = loModificado.charAt(0);

				((clientes) (listaPersonas.get(posicion))).setTipConductor(modificado3);

			} else {

				System.out.println(" Tu eres ********** o que te pasa? No sabes que no eres un cliente?");
			}

			break;

		case "contraseña":

			if (listaPersonas.get(posicion) instanceof clientes) {

				((clientes) (listaPersonas.get(posicion))).setContraseña(loModificado);

			} else {

				System.out.println(" Tu eres ********** o que te pasa? No sabes que no eres un cliente?");
			}

			break;

		default:

			System.out.println(" ********** que eres **********, esa opcion no es ninguna de las disponibles ");

			break;
			
		}

	}

}
