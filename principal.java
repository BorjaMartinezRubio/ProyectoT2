
public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PRUEBAS
		GestionVehiculos ges = new GestionVehiculos();
		coche c1 = new coche("Gris antracita", "0021fwx", "megane", "0545112346fx5654", "nuevo", 5);
		ges.insertarVehiculos(c1);
		ges.mostrarVehiculos();
		ges.buscarVehiculos("0545112346fx5654");

	}

}
