
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
		System.out.println("|-----------------------------------|");
		System.out.println("| 1.- Añadir vehículos              |");
		System.out.println("| 2.- Modificar vehículos           |");
		System.out.println("| 3.- Borrar un vehículo            |");
		System.out.println("| 4.- Hacer revisión a un vehículo  |");
		System.out.println("| 5.- Modificar una revisión        |");
		System.out.println("| 6.- Ver lista de vehículos        |");
		System.out.println("| 7.- Ver lista de clientes         |");
		System.out.println("| 8.- Ver lista de alquileres       |");
		System.out.println("| 9.- Salir                         |");
		System.out.println("|-----------------------------------|");
	}
}
