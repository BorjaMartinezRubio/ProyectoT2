/*

public class lista_coche {


	protected coche arrayCoche[] = new coche[15];
	
	protected void insertaVehiculo() {
		boolean bastidorNoExiste = true;
		for (int i = 0; i < arrayCoche.length; i++) {
			if (arrayCoche[i] != null && arg0.getBastidor().equalsIgnoreCase(arrayCoche[i].getBastidor())) {
				bastidorNoExiste = false;
				System.out.println("El bastidor ya existe");
				i = arrayCoche.length;
			}
		}
		if (bastidorNoExiste) {
			for (int i = 0; i < arrayCoche.length; i++) {
				if (arrayCoche[i] == null) {
					arrayCoche[i] = arg0;
					System.out.println("Coche agregado");
					i = arrayCoche.length;
				}
			}
		}
		return bastidorNoExiste;
		
	}

	
	protected void modificaVehiculo() {
		
	}
	
	protected void eliminaVehiculo(String bastidor,String marca,String modelo) {
		boolean existe
		
		
	}

	protected void buscaVehiculo() {
		protected void buscarVehículos(String nombrePedido) {
			int contador = 0;
			for (int i = 0; i < arrayCoche.length; i++) {
				if (arrayCoche[i] != null && arrayCoche[i].getNombreDueño().equalsIgnoreCase(nombrePedido)) {
					contador++;
					System.out.println("Numero de bastidor del coche numero " + contador + " de " + nombrePedido + ": "
							+ arrayCoche[i].getBastidor());
				} else if (arrayCoche[i] == null) {
					i = arrayCoche.length;
				}
			}
			System.out.println("Numero de coches de " + nombrePedido + ": " + contador);
		}
		
	}
	
	
	
	protected void muestraVehicluo() {
		for (int i = 0; i < arrayCoche.length; i++) {
			if (arrayCoche[i]!=null) {
				System.out.println("Matrícula: " + arrayCoche[i].getMatricula());
				System.out.println("Nombre del propietario: " + arrayCoche[i].getNombreDueño());
				System.out.println("Numero de bastidor: " + arrayCoche[i].getBastidor());
			}
		}
	}
	}


}*/
