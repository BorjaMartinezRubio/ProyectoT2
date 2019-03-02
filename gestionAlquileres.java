import java.util.ArrayList;

public class gestionAlquileres {

	ArrayList<alquileres> listaAlquileres = new ArrayList<alquileres>();

	protected void añadirAlquiler(alquileres A1) {
		
		listaAlquileres.add(A1); // no hacemos ningun control de datos, ya que el mismo cliente puede alquilar el mismo vehiculo varias veces

	}

	protected void mostrarAlquileres() {

		for (int i = 0; i < listaAlquileres.size(); i++) {

			System.out.println((listaAlquileres.get(i)).toString());

		}
		if (listaAlquileres.size() <= 0) {

			System.out.println("No se ha realizado ningun alquiler");
		}
	}

}
