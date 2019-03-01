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
		personas p = null;
		String nombre, apellidos, dni, contraseña, color, matricula, matriculaMayusculas, marca, modelo, bastidor,
				bastidorMayusculas, estado, combustible, direccion, numCarnet, tipCarnet;
		final String nombreAdmin = "admin";
		final String contraseñaAdmin = "admin123";
		String puesto, especialidad, opcion, cadenaSiNo;
		char TipConductor;
		int telefono, edad, asientos, peso, PMA, carga, cilindrada, super_motor;
		double precioDia;
		boolean estructura_carga;
		boolean equipamiento;
		boolean seguir = true;
		boolean empleadoOAdmin = false;
		boolean cerrarsesion = true;
		do {
			menu.menuPrincipal();
			opcion = sc.nextLine();
			switch (opcion) {
			case "1":
				System.out.println("Introduce tu DNI (nombre de admin si eres el administrador): ");
				dni = sc.nextLine();
				System.out.println("Introduce tu contraseña: ");
				contraseña = sc.nextLine();
				if (dni.equalsIgnoreCase(nombreAdmin) && contraseña.equalsIgnoreCase(contraseñaAdmin)) {
					empleadoOAdmin = true;
				} else {
					p = gesP.buscarPersonas(dni);
					if (p instanceof empleados) {
						if (p.getDni().equalsIgnoreCase(dni) && p.getContraseña().equalsIgnoreCase(contraseña)) {
							empleadoOAdmin = true;
						}
					}
				}
				if (empleadoOAdmin) {
					System.out.println("Has iniciado sesión correctamente");
					do {
						menu.menuEmpleado();
						opcion = sc.nextLine();
						switch (opcion) {
						case "1":
							System.out.println("Introduce la marca: ");
							marca = sc.nextLine();
							System.out.println("Introduce el modelo: ");
							modelo = sc.nextLine();
							System.out.println("Introduce el color: ");
							color = sc.nextLine();
							System.out.println("Introduce la matrícula: ");
							matricula = sc.nextLine();
							matriculaMayusculas = matricula.toUpperCase();
							System.out.println("Introduce el bastidor: ");
							bastidor = sc.nextLine();
							bastidorMayusculas = bastidor.toUpperCase();
							System.out.println("Introduce el estado (nuevo o seminuevo): ");
							estado = sc.nextLine();
							System.out.println("Introduce el precio por dia: ");
							precioDia = sc.nextDouble();
							sc.nextLine();
							System.out.println("Introduce el combustible: ");
							combustible = sc.nextLine();
							menu.menuTiposVehiculos();
							System.out.println("Introduce el tipo de vehículo que estás introduciendo: ");
							opcion = sc.nextLine();
							if (opcion.equalsIgnoreCase("camion")) {
								System.out.println("¿Tiene estructura de carga? (si/no): ");
								cadenaSiNo = sc.nextLine();
								if (cadenaSiNo.equalsIgnoreCase("si")) {
									estructura_carga = true;
								} else if (cadenaSiNo.equalsIgnoreCase("no")) {
									estructura_carga = false;
								} else {
									System.out.println("El texto introducido no es válido, debe ser Si/No");
									System.out.println(
											"Se designará que no tiene estructura de carga, posteriormente podrás modificarlo");
									estructura_carga = false;
								}
								System.out.println("Introduce el peso: ");
								peso = sc.nextInt();
								sc.nextLine();
								System.out.println("Introduce el PMA");
								PMA = sc.nextInt();
								sc.nextLine();
								camion camion1 = new camion(color, matriculaMayusculas, marca, modelo,
										bastidorMayusculas, estado, precioDia, combustible, estructura_carga, peso,
										PMA);
								gesV.insertarVehiculos(camion1);
							} else if (opcion.equalsIgnoreCase("coche")) {
								System.out.println("Introduce el numero de asientos: ");
								asientos = sc.nextInt();
								sc.nextLine();
								coche coche1 = new coche(color, matriculaMayusculas, marca, modelo, bastidorMayusculas,
										estado, precioDia, combustible, asientos);
								gesV.insertarVehiculos(coche1);
							} else if (opcion.equalsIgnoreCase("furgoneta")) {
								System.out.println("Introduce la carga máxima: ");
								carga = sc.nextInt();
								sc.nextLine();
								System.out.println("Introduce el nuemor de asientos: ");
								asientos = sc.nextInt();
								sc.nextLine();
								furgoneta furgoneta1 = new furgoneta(color, matriculaMayusculas, marca, modelo,
										bastidorMayusculas, estado, precioDia, combustible, carga, asientos);
								gesV.insertarVehiculos(furgoneta1);
							} else if (opcion.equalsIgnoreCase("moto")) {
								System.out.println(
										"¿Está el equipamiento (casco, guantes, etc) incluido con la moto? (si/no): ");
								cadenaSiNo = sc.nextLine();
								if (cadenaSiNo.equalsIgnoreCase("si")) {
									equipamiento = true;
								} else if (cadenaSiNo.equalsIgnoreCase("no")) {
									equipamiento = false;
								} else {
									System.out.println("El texto introducido no es válido, debe ser Si/No");
									System.out.println(
											"Se designará que no tiene equipamiento incluido, posteriormente podrás modificarlo");
									equipamiento = false;
								}
								System.out.println("Introduce la cilindrada: ");
								cilindrada = sc.nextInt();
								sc.nextLine();
								moto moto1 = new moto(color, matriculaMayusculas, marca, modelo, bastidorMayusculas,
										estado, precioDia, combustible, equipamiento, cilindrada);
								gesV.insertarVehiculos(moto1);
							} else if (opcion.equalsIgnoreCase("supercoche")) {
								System.out.println("Introduce la potencia (CV): ");
								super_motor = sc.nextInt();
								sc.nextLine();
								super_coche super_coche1 = new super_coche(color, matriculaMayusculas, marca, modelo,
										bastidorMayusculas, estado, precioDia, combustible, super_motor);
								gesV.insertarVehiculos(super_coche1);
							} else {
								System.out.println("La opción introducida no es válida");
							}
							break;
						case "6":
							gesV.mostrarVehiculos();
							break;
						case "7":
							gesP.mostrarClientes();
							break;
						case "9":
							System.out.println("Has cerrado sesión correctamente");
							cerrarsesion = false;
							break;
						default:
							System.out.println("La opción que has introducido no es válida");
							break;
						}
					} while (cerrarsesion);
				} else if (!empleadoOAdmin) {
					System.out.println(
							"No estás autorizado a acceder a esta opción, ya que no eres empleado y/o administrador");
				}
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
