import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * GestionVehiculos gesV = new GestionVehiculos(); coche c1 = new coche ("Rojo",
		 * "5555YVN","Misco", "Jones", "sos505", " Nuevo", 25000, "nemes", 2);
		 * gesV.insertarVehiculos(c1); c1.mostrarRevisiones(); int posicion =
		 * gesV.buscarPosicion("sos505"); revisiones R1 = new revisiones ("69-69-6969",
		 * " Tu coche no vale para nada, tiralo", 1); gesV.a�adirRevision(posicion, R1);
		 * c1.mostrarRevisiones(); int posicion2=c1.buscarRevision(1);
		 * c1.modificarRevisiones(posicion2, "descripcion",
		 * "Tu coche es peor que un Fiat Multipla"); c1.mostrarRevisiones();
		 */
		Scanner sc = new Scanner(System.in);
		Menus menu = new Menus();
		GestionVehiculos gesV = new GestionVehiculos();
		GestionPersonas gesP = new GestionPersonas();
		gestionAlquileres gesA = new gestionAlquileres();
		personas p = null;
		vehiculos v = null;
		empleados e1 = null;
		alquileres a = null;
		clientes cliente1 = new clientes("Ivan", "Camps", "05994241G", "1234", 633961105, 18, "Calle de miscojones", "51056432A", "B", 'N');
		gesP.crearPersona(cliente1);
		// empleados e2 = new empleados("Ivan", "Camps", "05994241G", "1234", 633961105,
		// 18, 1, 2500, "Mecanico", "Motor");
		// gesP.crearPersona(e2);
		String nombre, apellidos, dni, contrase�a, color, matricula, matriculaMayusculas, marca, modelo, bastidor,
				bastidorMayusculas, estado, combustible, direccion, numCarnet, tipCarnet;
		final String nombreAdmin = "admin";
		final String contrase�aAdmin = "admin123";
		String puesto, especialidad, opcion, cadenaSiNo, datoNuevo, fecha, descripcion, valorModificar;
		char TipConductor;
		int telefono, edad, asientos, peso, PMA, carga, cilindrada, super_motor, posicion;
		double precioDia;
		boolean estructura_carga;
		boolean equipamiento;
		boolean seguir = true;
		boolean empleadoOAdmin = true;
		boolean cerrarsesion = false;
		do {
			menu.menuPrincipal();
			opcion = sc.nextLine();
			switch (opcion) {
			case "1":
				System.out.println("Introduce tu DNI (nombre de admin si eres el administrador): ");
				dni = sc.nextLine();
				System.out.println("Introduce tu contrase�a: ");
				contrase�a = sc.nextLine();
				if (dni.equalsIgnoreCase(nombreAdmin) && contrase�a.equalsIgnoreCase(contrase�aAdmin)) {
					empleadoOAdmin = true;
				} else {
					p = gesP.buscarPersonas(dni);
					if (p instanceof empleados) {
						if (p.getDni().equalsIgnoreCase(dni) && p.getContrase�a().equalsIgnoreCase(contrase�a)) {
							empleadoOAdmin = true;
						}
					} else {
						empleadoOAdmin = false;
					}
				}
				if (empleadoOAdmin) {
					System.out.println("Has iniciado sesi�n correctamente");
					do {
						cerrarsesion=false;
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
							System.out.println("Introduce la matr�cula: ");
							matricula = sc.nextLine();
							matriculaMayusculas = matricula.toUpperCase();
							System.out.println("Introduce el bastidor: ");
							bastidor = sc.nextLine();
							bastidorMayusculas = bastidor.toUpperCase();
							System.out.println("Introduce el estado (disponible o alquilado): ");
							estado = sc.nextLine();
							System.out.println("Introduce el precio por dia: ");
							precioDia = sc.nextDouble();
							sc.nextLine();
							System.out.println("Introduce el combustible: ");
							combustible = sc.nextLine();
							menu.menuTiposVehiculos();
							System.out.println("Introduce el tipo de veh�culo que est�s introduciendo: ");
							opcion = sc.nextLine();
							if (opcion.equalsIgnoreCase("camion")) {
								System.out.println("�Tiene estructura de carga? (si/no): ");
								cadenaSiNo = sc.nextLine();
								if (cadenaSiNo.equalsIgnoreCase("si")) {
									estructura_carga = true;
								} else if (cadenaSiNo.equalsIgnoreCase("no")) {
									estructura_carga = false;
								} else {
									System.out.println("El texto introducido no es v�lido, debe ser Si/No");
									System.out.println(
											"Se designar� que no tiene estructura de carga, posteriormente podr�s modificarlo");
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
								System.out.println("Introduce la carga m�xima: ");
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
										"�Est� el equipamiento (casco, guantes, etc) incluido con la moto? (si/no): ");
								cadenaSiNo = sc.nextLine();
								if (cadenaSiNo.equalsIgnoreCase("si")) {
									equipamiento = true;
								} else if (cadenaSiNo.equalsIgnoreCase("no")) {
									equipamiento = false;
								} else {
									System.out.println("El texto introducido no es v�lido, debe ser Si/No");
									System.out.println(
											"Se designar� que no tiene equipamiento incluido, posteriormente podr�s modificarlo");
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
								System.out.println("La opci�n introducida no es v�lida");
							}
							break;
						case "2":
							System.out.println("Introduce el bastidor del veh�culo que quieres modificar: ");
							bastidor = sc.nextLine();
							posicion = gesV.buscarPosicion(bastidor);
							if (posicion >= 0) {
								menu.menuModificarVehiculos();
								opcion = sc.nextLine();
								System.out.println("Valor que quieres modificar: " + opcion);
								System.out.println("Introduce el dato nuevo: ");
								datoNuevo = sc.nextLine();
								gesV.modificarVehiculos(posicion, opcion, datoNuevo);
							}
							break;
						case "3":
							System.out.println("Introduce el bastidor del veh�culo que quieres eliminar: ");
							bastidor = sc.nextLine();
							gesV.borrarVehiculos(bastidor);
							break;
						case "4":
							p = gesP.buscarPersonas(dni);
							if (p instanceof empleados) {
								e1 = (empleados) p;
								if (e1.getPuesto().equalsIgnoreCase("mecanico")) {
									System.out.println("Introduce la fecha de la revision (dd-mm-aaaa): ");
									fecha = sc.nextLine();
									System.out.println("Introduce la descripci�n de lo que has hecho en la revisi�n");
									descripcion = sc.nextLine();
									nombre = e1.getNombre();
									apellidos = e1.getApellidos();
									dni = e1.getDni();
									puesto = e1.getPuesto();
									revisiones R1 = new revisiones(fecha, descripcion, nombre, apellidos, dni, puesto);
									System.out.println(
											"Introduce el bastidor del veh�culo al que le est�s haciendo la revisi�n: ");
									bastidor = sc.nextLine();
									posicion = gesV.buscarPosicion(bastidor);
									gesV.a�adirRevision(posicion, R1);
								}
							}
							break;
						case "5":
							System.out.println("Introduce la fecha de la revisi�n: ");
							fecha = sc.nextLine();
							System.out.println("Introduce el bastidor del veh�culo al que se le hizo la revisi�n: ");
							bastidor = sc.nextLine();
							v = gesV.buscarVehiculos(bastidor);
							posicion = v.buscarRevision(dni, bastidor, fecha, v);
							if (posicion >= 0) {
								menu.menuModificarRevisiones();
								opcion = sc.nextLine();
								System.out.println("Introduce el dato nuevo: ");
								datoNuevo = sc.nextLine();
								v.modificarRevisiones(posicion, opcion, datoNuevo);
							}
							break;
						case "6":
							break;
						case "7":
							break;
						case "8":
							System.out.println("Introduce el bastidro del veh�culo: ");
							bastidor = sc.nextLine();
							v = gesV.buscarVehiculos(bastidor);
							if (v != null) {
								v.mostrarRevisiones();
							}
							break;
						case "9":
							gesV.mostrarVehiculos();
							break;
						case "10":
							gesP.mostrarClientes();
							break;
						case "11":
							gesA.mostrarAlquileres();
							break;
						case "12":
							System.out.println("Has cerrado sesi�n correctamente");
							cerrarsesion = true;
							empleadoOAdmin = false;
							break;
						default:
							System.out.println("La opci�n que has introducido no es v�lida");
							break;
						}
					} while (!cerrarsesion);
				} else if (!empleadoOAdmin) {
					System.out.println("Usuario y/o contrase�a incorrecta");
				}
				break;

			case "2":

				System.out.println("Introduce tu DNI: ");
				dni = sc.nextLine();
				System.out.println("Introduce tu contrase�a: ");
				contrase�a = sc.nextLine();
				p = gesP.buscarPersonas(dni);
				if (p instanceof clientes) {
					if (p.getDni().equalsIgnoreCase(dni) && p.getContrase�a().equalsIgnoreCase(contrase�a)) {
						empleadoOAdmin = true;
					}
				}
				if (empleadoOAdmin) {
					System.out.println("Has iniciado sesi�n correctamente");
					do {
						cerrarsesion=false;
						menu.menuCliente();
						opcion = sc.nextLine();
						switch (opcion) {

						case "1":

							System.out.println("Por favor introduce la matricula del vehiculo que desea alquilar");
							System.out.println(
									"Recuerde que para poder alquilar un vehiculo ha de tener el carnet correspondiente");
							System.out.println(
									"Recuerde tambien que en el caso de los super coches se necesita ser un conductor experto (mas de 2 a�os de carnet)");

							matricula = sc.nextLine();
							v = gesV.buscarVehiculos(matricula);

							if (v != null) {
								if (v instanceof coche && ((clientes) p).getTipCarnet().equalsIgnoreCase("B")) {

									posicion = gesP.buscarPosicion(dni);
									p = gesP.buscarPersonas(dni);
									((clientes) p).AsignarVehiculo(v);
									((clientes) p).alquilerCliente(v);
									gesP.reescribirPersona(posicion, p);

									posicion = gesV.buscarPosicion(matricula);
									v.setEstado("alquilado");
									gesV.reescribirVehiculo(posicion, v);
									nombre = p.getNombre();
									apellidos = p.getApellidos();
									dni = p.getDni();
									marca = v.getMarca();
									modelo = v.getModelo();

									a = new alquileres(nombre, apellidos, dni, marca, modelo, matricula);
									gesA.a�adirAlquiler(a);

									System.out.println("Vehiculo asignado correctamente");
								} else

								if (v instanceof moto && ((clientes) p).getTipCarnet().equalsIgnoreCase("A")) {

									posicion = gesP.buscarPosicion(dni);
									p = gesP.buscarPersonas(dni);
									((clientes) p).AsignarVehiculo(v);
									((clientes) p).alquilerCliente(v);
									gesP.reescribirPersona(posicion, p);

									posicion = gesV.buscarPosicion(matricula);
									v.setEstado("alquilado");
									gesV.reescribirVehiculo(posicion, v);
									nombre = p.getNombre();
									apellidos = p.getApellidos();
									dni = p.getDni();
									marca = v.getMarca();
									modelo = v.getModelo();

									a = new alquileres(nombre, apellidos, dni, marca, modelo, matricula);
									gesA.a�adirAlquiler(a);

									System.out.println("Vehiculo asignado correctamente");
								} else

								if (v instanceof camion && ((clientes) p).getTipCarnet().equalsIgnoreCase("C")) {

									posicion = gesP.buscarPosicion(dni);
									p = gesP.buscarPersonas(dni);
									((clientes) p).AsignarVehiculo(v);
									((clientes) p).alquilerCliente(v);
									gesP.reescribirPersona(posicion, p);

									posicion = gesV.buscarPosicion(matricula);
									v.setEstado("alquilado");
									gesV.reescribirVehiculo(posicion, v);
									nombre = p.getNombre();
									apellidos = p.getApellidos();
									dni = p.getDni();
									marca = v.getMarca();
									modelo = v.getModelo();

									a = new alquileres(nombre, apellidos, dni, marca, modelo, matricula);
									gesA.a�adirAlquiler(a);

									System.out.println("Vehiculo asignado correctamente");
								} else

								if (v instanceof super_coche && ((clientes) p).getTipCarnet().equalsIgnoreCase("B")
										&& ((clientes) p).getTipConductor() == ('E')) {

									posicion = gesP.buscarPosicion(dni);
									p = gesP.buscarPersonas(dni);
									((clientes) p).AsignarVehiculo(v);
									((clientes) p).alquilerCliente(v);
									gesP.reescribirPersona(posicion, p);

									posicion = gesV.buscarPosicion(matricula);
									v.setEstado("alquilado");
									gesV.reescribirVehiculo(posicion, v);
									nombre = p.getNombre();
									apellidos = p.getApellidos();
									dni = p.getDni();
									marca = v.getMarca();
									modelo = v.getModelo();

									a = new alquileres(nombre, apellidos, dni, marca, modelo, matricula);
									gesA.a�adirAlquiler(a);

									System.out.println("Vehiculo asignado correctamente");
								} else {

									System.out.println(
											"Lo siento pero no se puede completar el alquiler del vehiculo solicitado");
								}
							}
							v = null;
							break;

						case "2":

							gesV.mostrarVehiculos2();

							break;

						case "3":

							p = gesP.buscarPersonas(dni);
							((clientes) p).verAlquieresRealizados();

							break;

						case "4":

							posicion = gesP.buscarPosicion(dni);
							System.out.println("�Que campo desea modificar?");
							valorModificar = sc.nextLine();
							System.out.println("�Cual es el nuevo valor que desea introducir?");
							datoNuevo = sc.nextLine();
							gesP.modificarPersona(posicion, valorModificar, datoNuevo);

							break;

						case "5":

							System.out.println("Has cerrado sesi�n correctamente");
							cerrarsesion = true;

							break;

						default:

							System.out.println("La opci�n que has introducido no es v�lida");

							break;

						}

					} while (!cerrarsesion);

				} else if (!empleadoOAdmin) {

					System.out.println("Los datos introducidos no son correctos");
				}

				break;

			case "4":
				System.out.println("Has decidido salir del programa");
				seguir = false;
				break;
			default:
				System.out.println("La opci�n que has introducido no es v�lida");
				break;
			}
		} while (seguir);
		sc.close();

	}

}
