
public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GestionVehiculos gesV = new GestionVehiculos();
		coche c1 = new coche ("Rojo", "5555YVN","Misco", "Jones", "sos505", " Nuevo", 25000, "nemes", 2);
		gesV.insertarVehiculos(c1);
		c1.mostrarRevisiones();
		int posicion = gesV.buscarPosicion("sos505");
		revisiones R1 = new revisiones ("69-69-6969", " Tu coche no vale para nada, tiralo", 1);
		gesV.añadirRevision(posicion, R1);
		c1.mostrarRevisiones();

	}

}
