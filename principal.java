import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * GestionVehiculos gesV = new GestionVehiculos(); coche c1 = new coche ("Rojo",
		 * "5555YVN","Misco", "Jones", "sos505", " Nuevo", 25000, "nemes", 2);
		 * gesV.insertarVehiculos(c1); c1.mostrarRevisiones(); int posicion =
		 * gesV.buscarPosicion("sos505"); revisiones R1 = new revisiones ("69-69-6969",
		 * " Tu coche no vale para nada, tiralo", 1); gesV.añadirRevision(posicion, R1);
		 * c1.mostrarRevisiones(); int posicion2=c1.buscarRevision(1);
		 * c1.modificarRevisiones(posicion2, "descripcion",
		 * "Tu coche es peor que un Fiat Multipla"); c1.mostrarRevisiones();
		 */
		Scanner sc = new Scanner(System.in);
		Menus menu = new Menus();
		GestionVehiculos gesV = new GestionVehiculos();
		GestionPersonas gesP = new GestionPersonas();
		String nombre, apellidos, dni, contraseña, color, matricula, marca, modelo, bastidor, estado, combustible,
				direccion, numCarnet, tipCarnet;
		final String nombreAdmin="admin";
		final String contraseñaAdmin="admin123";
		String puesto, especialidad, opcion;
		char TipConductor;
		int telefono, edad, asientos, peso, PMA, carga, cilindrada, super_motor;
		double precioDia;
		boolean estructura_carga;
		boolean equipamiento;
		boolean seguir = true;
		do {
			menu.menuPrincipal();
			opcion = sc.nextLine();
			switch (opcion) {
			case "1":
				System.out.println("Introduce tu DNI: ");
				dni=sc.nextLine();
				System.out.println("Introduce tu contraseña: ");
				contraseña=sc.nextLine();
				//if (dni.equalsIgnoreCase(nombreAdmin) && contraseña.equalsIgnoreCase())
				break;
			case "4":
				System.out.println("Has decidido salir del programa");
				seguir = false;
				break;
			default:
				System.out.println("La opción que has introducido no es válida");
				break;
			}
		} while (seguir);
		sc.close();

	}

}
