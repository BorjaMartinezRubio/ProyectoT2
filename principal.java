import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Menus menu = new Menus();
		GestionVehiculos gesV = new GestionVehiculos();
		GestionPersonas gesP = new GestionPersonas();
		gestionAlquileres gesA = new gestionAlquileres();
		validezDNI vDNI = new validezDNI();
		personas p = null;
		vehiculos v = null;
		empleados e1 = null;
		alquileres a = null;
		creacionEstatica CrEs = new creacionEstatica();
		String nombre, apellidos, dni, contraseña, color, matricula, matriculaMayusculas, marca, modelo, bastidor,
				bastidorMayusculas, estado, combustible, direccion, numCarnet, tipCarnet;
		String puesto, especialidad, opcion, cadenaSiNo, datoNuevo, fecha, descripcion, valorModificar, dias;
		char TipConductor;
		int telefono, edad, asientos, peso, PMA, carga, cilindrada, super_motor, posicion, antiguedad;
		final int edadMinima = 18;
		double precioDia, salario;
		boolean estructura_carga;
		boolean equipamiento;
		boolean seguir = true;
		boolean empleadoOAdmin = true;
		boolean cerrarsesion = false;
		boolean sesion2 = true;
		CrEs.creacionFormaEstatica();
		do {
			menu.menuPrincipal();
			opcion = sc.nextLine();
			switch (opcion) {
			case "1":
				System.out.println("Introduce tu DNI (nombre de admin si eres el administrador): ");
				dni = sc.nextLine();
				System.out.println("Introduce tu contraseña: ");
				contraseña = sc.nextLine();
				p = gesP.buscarPersonas(dni);
				if (p instanceof empleados) {
					if (p.getDni().equalsIgnoreCase(dni) && p.getContraseña().equalsIgnoreCase(contraseña)) {
						empleadoOAdmin = true;
					}
				} else {
					empleadoOAdmin = false;
				}
				if (empleadoOAdmin) {
					System.out.println("Has iniciado sesión correctamente");
					do {
						p = gesP.buscarPersonas(dni);
						cerrarsesion = false;
						menu.menuEmpleado();
						opcion = sc.nextLine();
						switch (opcion) {
						case "1":
							if (((empleados) p).getPuesto().equalsIgnoreCase("ceo")
									|| ((empleados) p).getPuesto().equalsIgnoreCase("jefe de taller")) {
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
								System.out.println("Introduce el estado (disponible o alquilado): ");
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
									coche coche1 = new coche(color, matriculaMayusculas, marca, modelo,
											bastidorMayusculas, estado, precioDia, combustible, asientos);
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
									super_coche super_coche1 = new super_coche(color, matriculaMayusculas, marca,
											modelo, bastidorMayusculas, estado, precioDia, combustible, super_motor);
									gesV.insertarVehiculos(super_coche1);
								} else {
									System.out.println("La opción introducida no es válida");
								}
							} else {
								System.out.println("No tienes permisos para realizar esta acción");
							}
							break;
						case "2":
							if (!((empleados) p).getPuesto().equalsIgnoreCase("mecanico")) {
								System.out.println("Introduce el bastidor del vehículo que quieres modificar: ");
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
							} else {
								System.out.println("No tienes permisos para realizar esta acción");
							}
							break;
						case "3":
							if (!((empleados) p).getPuesto().equalsIgnoreCase("mecanico")) {
								System.out.println("Introduce el bastidor del vehículo que quieres eliminar: ");
								bastidor = sc.nextLine();
								gesV.borrarVehiculos(bastidor);
							} else {
								System.out.println("No tienes permisos para realizar esta acción");
							}
							break;
						case "4":
							if (((empleados) p).getPuesto().equalsIgnoreCase("mecanico")) {
								p = gesP.buscarPersonas(dni);
								if (p instanceof empleados) {
									e1 = (empleados) p;
									if (e1.getPuesto().equalsIgnoreCase("mecanico")) {
										System.out.println("Introduce la fecha de la revision (dd-mm-aaaa): ");
										fecha = sc.nextLine();
										System.out
												.println("Introduce la descripción de lo que has hecho en la revisión");
										descripcion = sc.nextLine();
										nombre = e1.getNombre();
										apellidos = e1.getApellidos();
										dni = e1.getDni();
										puesto = e1.getPuesto();
										revisiones R1 = new revisiones(fecha, descripcion, nombre, apellidos, dni,
												puesto);
										System.out.println(
												"Introduce el bastidor del vehículo al que le estás haciendo la revisión: ");
										bastidor = sc.nextLine();
										posicion = gesV.buscarPosicion(bastidor);
										gesV.añadirRevision(posicion, R1);
									}
								}
							} else {
								System.out.println("No tienes permisos para realizar esta acción");
							}
							break;
						case "5":
							if (((empleados) p).getPuesto().equalsIgnoreCase("mecanico")) {
								System.out.println("Introduce la fecha de la revisión: ");
								fecha = sc.nextLine();
								System.out
										.println("Introduce el bastidor del vehículo al que se le hizo la revisión: ");
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
							} else {
								System.out.println("No tienes permisos para realizar esta acción");
							}
							break;
						case "6":
							p = gesP.buscarPersonas(dni);
							if (((empleados) p).getPuesto().equalsIgnoreCase("ceo")) {
								System.out.println("Introduce el nombre del empleado: ");
								nombre = sc.nextLine();
								System.out.println("Introduce los apellidos del empleado: ");
								apellidos = sc.nextLine();
								System.out.println("Introduce el dni del empleado: ");
								dni = sc.nextLine();
								if (vDNI.comprobar(dni)) {
									System.out.println("El DNI introducido es válido");
									System.out.println("Introduce la contraseña de acceso que tendrá el empleado: ");
									contraseña = sc.nextLine();
									System.out.println("Introduce el teléfono del empleado: ");
									telefono = sc.nextInt();
									sc.nextLine();
									System.out.println("Introduce la edad del empleado: ");
									edad = sc.nextInt();
									sc.nextLine();
									if (edad >= edadMinima) {
										System.out.println("Introduce la antigüedad del empleado: ");
										antiguedad = sc.nextInt();
										System.out.println("Introduce el salario del empleado: ");
										salario = sc.nextDouble();
										System.out.println(
												"Introduce el puesto del empleado (jefe de taller/mecanico): ");
										puesto = sc.nextLine();
										if (puesto.equalsIgnoreCase("jefe de taller")
												|| puesto.equalsIgnoreCase("mecanico")) {
											System.out.println("Introduce la especialidad del empleado: ");
											especialidad = sc.nextLine();
											empleados empleado1 = new empleados(nombre, apellidos, dni, contraseña,
													telefono, edad, antiguedad, salario, puesto, especialidad);
											gesP.crearPersona(empleado1);
										} else {
											System.out.println("Solo puedes agregar jefes de taller o mecanicos");
										}
									} else {
										System.out.println("El empleado debe tener como mínimo 18 años");
									}
								} else {
									System.out.println("El DNI introducido no es válido");
								}
							} else {
								System.out.println("No puedes realizar esta acción ya que no tienes permisos");
							}
							break;
						case "7":
							if (((empleados) p).getPuesto().equalsIgnoreCase("ceo")) {
								System.out.println("Introduce el DNI del empleado que quieres eliminar: ");
								dni = sc.nextLine();
								p = gesP.buscarPersonas(dni);
								if (p instanceof empleados) {
									gesP.borrarPersona(dni);
								} else {
									System.out.println("La persona que estás intentando no es un empleado");
								}
							} else {
								System.out.println("No tienes permiso para realizar esta acción");
							}
							break;
						case "8":
							System.out.println("Introduce el bastidro del vehículo: ");
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
							System.out.println("Has cerrado sesión correctamente");
							cerrarsesion = true;
							empleadoOAdmin = false;
							break;
						default:
							System.out.println("La opción que has introducido no es válida");
							break;
						}
					} while (!cerrarsesion);
				} else if (!empleadoOAdmin) {
					System.out.println("Usuario y/o contraseña incorrecta");
				}
				break;

			case "2":

				sesion2 = true;
				while (sesion2) {

					menu.menuCliente2();
					opcion = sc.nextLine();
					switch (opcion) {

					case "1":

						System.out.println("Introduzaca su nombre");
						nombre = sc.nextLine();
						System.out.println("Introduzaca sus apellidos");
						apellidos = sc.nextLine();
						System.out.println("Introduzaca su dni (8 numeros y una letra");
						dni = sc.nextLine();
						if (vDNI.comprobar(dni)) {
							System.out.println("El DNI introducido es válido");
							System.out.println("Introduzca su contraseña ");
							contraseña = sc.nextLine();
							System.out.println("Introduzca su telefono ");
							telefono = sc.nextInt();
							sc.nextLine();
							System.out.println("Introduzca su edad ");
							edad = sc.nextInt();
							sc.nextLine();
							if (edad >= edadMinima) {
								System.out.println("Introduzca su direccion");
								direccion = sc.nextLine();
								System.out.println("Introduzca su numero de carnet");
								numCarnet = sc.nextLine();
								System.out.println("Introduzca el tipo de carnet (A, B, C)");
								tipCarnet = sc.nextLine();
								if (tipCarnet.equalsIgnoreCase("A") || tipCarnet.equalsIgnoreCase("B")
										|| tipCarnet.equalsIgnoreCase("C")) {
									System.out.println("Introduzca la antigüedad del carnet");
									antiguedad = sc.nextInt();
									sc.nextLine();
									if (antiguedad < 2) {
										TipConductor = 'N';
									} else {
										TipConductor = 'E';
									}
									clientes cliente1 = new clientes(nombre, apellidos, dni, contraseña, telefono, edad,
											direccion, numCarnet, tipCarnet, TipConductor);
									gesP.crearPersona(cliente1);
								} else {
									System.out.println(
											" Tipo de carnet incorrecto, recuerde que los tipos son 'A', 'B' o 'C'");
								}
							} else {
								System.out.println("Has de tener al menos 18 años para poder registrarte");
							}
						} else {
							System.out.println("El DNI introducido no es válido");
						}

						break;

					case "2":

						System.out.println("Introduce tu DNI: ");
						dni = sc.nextLine();
						System.out.println("Introduce tu contraseña: ");
						contraseña = sc.nextLine();
						p = gesP.buscarPersonas(dni);
						if (p instanceof clientes) {
							if (p.getDni().equalsIgnoreCase(dni) && p.getContraseña().equalsIgnoreCase(contraseña)) {
								empleadoOAdmin = true;
							} else {
								empleadoOAdmin = false;
							}
						}
						if (empleadoOAdmin) {
							System.out.println("Has iniciado sesión correctamente");
							do {
								cerrarsesion = false;
								menu.menuCliente();
								opcion = sc.nextLine();
								switch (opcion) {

								case "1":

									System.out.println(
											"Por favor introduce la matricula del vehiculo que desea alquilar");
									System.out.println(
											"Recuerde que para poder alquilar un vehiculo ha de tener el carnet correspondiente");
									System.out.println(
											"Recuerde tambien que en el caso de los super coches se necesita ser un conductor experto (mas de 2 años de carnet)");

									matricula = sc.nextLine();
									v = gesV.buscarVehiculos(matricula);
									System.out.println("Introduce el numero de días que vas a alquilar el vehículo: ");
									dias = sc.nextLine();
									v.calcularPrecioTotal(dias);
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
											gesA.añadirAlquiler(a);

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
											gesA.añadirAlquiler(a);

											System.out.println("Vehiculo asignado correctamente");
										} else

										if (v instanceof camion
												&& ((clientes) p).getTipCarnet().equalsIgnoreCase("C")) {

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
											gesA.añadirAlquiler(a);

											System.out.println("Vehiculo asignado correctamente");
										} else

										if (v instanceof super_coche
												&& ((clientes) p).getTipCarnet().equalsIgnoreCase("B")
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
											gesA.añadirAlquiler(a);

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
									System.out.println("¿Que campo desea modificar?");
									valorModificar = sc.nextLine();
									System.out.println("¿Cual es el nuevo valor que desea introducir?");
									datoNuevo = sc.nextLine();
									gesP.modificarPersona(posicion, valorModificar, datoNuevo);

									break;

								case "5":

									System.out.println("Has cerrado sesión correctamente");
									cerrarsesion = true;

									break;

								default:

									System.out.println("La opción que has introducido no es válida");

									break;

								}

							} while (!cerrarsesion);

						} else if (!empleadoOAdmin) {

							System.out.println("Los datos introducidos no son correctos");
						}

						break;

					case "3":

						System.out.println("Has decidido salir");
						sesion2 = false;

						break;

					default:

						System.out.println("La opción que has introducido no es válida");

						break;

					}
				}

				break;

			case "3":
				do {
					menu.menuInvitado();
					opcion = sc.nextLine();
					switch (opcion) {
					case "1":
						gesV.mostrarVehiculos2();
						break;
					case "2":
						System.out.println("Has decidido salir de la sesión de invitado");
						cerrarsesion = true;
						break;
					default:
						break;
					}
				} while (!cerrarsesion);
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
