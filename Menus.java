
public class Menus {
	protected void menuPrincipal() {
		System.out.println("|-------------------------------|");
		System.out.println("| 1.- Entrar como empleado      |");
		System.out.println("| 2.- Entrar como cliente       |");
		System.out.println("| 3.- Entrar como invitado      |");
		System.out.println("| 4.- Salir                     |");
		System.out.println("|-------------------------------|");
		System.out.print("Selecciona una opcion: ");
	}

	protected void menuInvitado() {
		System.out.println("|-----------------------------------|");
		System.out.println("| 1.- Ver vehículos disponibles     |");
		System.out.println("| 2.- Salir                         |");
		System.out.println("|-----------------------------------|");
		System.out.print("Selecciona una opcion: ");
	}

	protected void menuCliente() {
		System.out.println("|--------------------------------|");
		System.out.println("| 1.- Alquilar vehiculo          |");
		System.out.println("| 2.- Ver vehiculos disponibles  |");
		System.out.println("| 3.- Modificar datos personales |");
		System.out.println("| 4.- Cerrar sesión              |");
		System.out.println("|--------------------------------|");
		System.out.print("Selecciona una opcion: ");
	}

	protected void menuEmpleado() {
		System.out.println("|--------------------------------------------|");
		System.out.println("| 1.- Añadir vehículos                       |");
		System.out.println("| 2.- Modificar vehículos                    |");
		System.out.println("| 3.- Borrar un vehículo                     |");
		System.out.println("| 4.- Hacer revisión a un vehículo           |");
		System.out.println("| 5.- Modificar una revisión                 |");
		System.out.println("| 6.- Añadir empleado                        |");
		System.out.println("| 7.- Dar de baja empleado                   |");
		System.out.println("| 8.- Ver lista de revisiones de un vehiculo |");
		System.out.println("| 9.- Ver lista de vehículos                 |");
		System.out.println("| 10.- Ver lista de clientes                 |");
		System.out.println("| 11.- Ver lista de alquileres               |");
		System.out.println("| 12.- Cerrar sesión                         |");
		System.out.println("|--------------------------------------------|");
		System.out.print("Selecciona una opcion: ");
	}
	
	protected void menuModificarVehiculos() {
		System.out.println("|--------------------------|");
		System.out.println("| 1.- Color                |");
		System.out.println("| 2.- Matricula            |");
		System.out.println("| 3.- Marca                |");
		System.out.println("| 4.- Modelo               |");
		System.out.println("| 5.- Bastidor             |");
		System.out.println("| 6.- Estado               |");
		System.out.println("| 7.- Precio por dia       |");
		System.out.println("| 8.- Combustible          |");
		System.out.println("| 9.- Asientos             |");
		System.out.println("| 10.- Estructura de carga |");
		System.out.println("| 11.- Peso                |");
		System.out.println("| 12.- PMA                 |");
		System.out.println("| 13.- Carga               |");
		System.out.println("| 14.- Equipamiento        |");
		System.out.println("| 15.- Cilindrada          |");
		System.out.println("| 16.- Super motor (CV)    |");
		System.out.println("|--------------------------|");
		System.out.print("Selecciona una opcion (introduce el nombre, no el numero): ");
	}
	
	protected void menuModificarPersonas() {
		System.out.println("|--------------------------|");
		System.out.println("| 1.- Nombre               |");
		System.out.println("| 2.- Apellidos            |");
		System.out.println("| 3.- Telefono             |");
		System.out.println("| 4.- Edad                 |");
		System.out.println("| 5.- Antigüedad           |");
		System.out.println("| 6.- Salario              |");
		System.out.println("| 7.- Puesto               |");
		System.out.println("| 8.- Especialidad         |");
		System.out.println("| 9.- Direccion            |");
		System.out.println("| 10.- Numero de carnet    |");
		System.out.println("| 11.- Tipo de carnet      |");
		System.out.println("| 12.- Tipo de conductor   |");
		System.out.println("| 13.- Contraseña          |");
		System.out.println("|--------------------------|");
		System.out.print("Selecciona una opcion (introduce el nombre, no el numero): ");
	}
	
	protected void menuTiposVehiculos() {
		System.out.println("Tipo de vehículos disponibles: camion, coche, furgoneta, moto y supercoche");
	}
	
	protected void menuModificarRevisiones() {
		System.out.println("|-------------------|");
		System.out.println("| 1.- Fecha         |");
		System.out.println("| 2.- Descripcion   |");
		System.out.println("|-------------------|");
		System.out.print("Selecciona una opcion (introduce el nombre, no el numero): ");
	}
}
