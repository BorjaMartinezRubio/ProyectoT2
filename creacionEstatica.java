public class creacionEstatica {

	protected void creacionFormaEstatica() {

		GestionPersonas gesP = new GestionPersonas();
		GestionVehiculos gesV = new GestionVehiculos();
		
		//Creacion del ceo
		empleados ceo = new empleados("Javier", "Fernandez Sanchez", "41147918K", "ceo123", 622142364, 26, 5, 5000,
				"CEO", "Negocios y personal");
		gesP.crearPersona(ceo);
		
		//Creacion de los camiones
		camion ca1 = new camion("Morado", "1105VNS", "Mercedes", "Nitus", "1VN1CMPS052000", "disponible", 500,
				"gasolina", true, 36000, 22000);
		gesV.insertarVehiculos(ca1);
		camion ca2 = new camion("Negro", "8888HHH", "Pegaso", "Ivnita", "ff15ori11tr00l", "disponible", 479.99,
				"gasolina", true, 28000, 15000);
		gesV.insertarVehiculos(ca2);
		//Creacion de los coches
		coche co1 = new coche("Rojo", "8907JHR", "Renault", "Megane", "fb4b37b48bf", "disponible", 42, "diesel", 5);
		gesV.insertarVehiculos(co1);
		coche co2 = new coche("Azul", "4324JJB", "Ford", "Fiesta", "bf846f7fhmnd9d", "disponible", 39.99, "diesel", 5);
		gesV.insertarVehiculos(co2);
		//Creacion de las furgonetas
		furgoneta fu1 = new furgoneta("Blanco", "0000FTP", "Ford", "Furgonetus", "nf45v4f54v815dfd", "disponible", 100,
				"gasolina", 150, 3);
		gesV.insertarVehiculos(fu1);
		furgoneta fu2 = new furgoneta("Negro", "1234GVQ", "Nissan", "JoseG0D", "vef6gter815g347te5", "disponible",
				94.99, "gasolina", 125, 3);
		gesV.insertarVehiculos(fu2);
		//Creacion de las motos
		moto mo1 = new moto ("Amarillo", "8976HJH", "Yamaha", "GuillMUS", "846TRH5189REG4", "disponible", 74.99, "gasolina", false, 90);
		gesV.insertarVehiculos(mo1);
		moto mo2 = new moto ("Naranja", "6354HJF", "Honda", "SergBeast", "v47yf4bgd8n74yd5", "disponible", 349.99, "gasolina", false, 215);
		gesV.insertarVehiculos(mo2);
		//Creacion de los supercoches
		super_coche supc1 = new super_coche ("Negro", "0000KLM" , "Chevrolet", "Camaro", "g68r4y8r45v8654tbrf", "disponible", 589.99, "gasolina", 512);
		gesV.insertarVehiculos(supc1);
		super_coche supc2 = new super_coche ("Rosa", "6996JVR" , "Lamborghini", "Huracan Performante", "vdsfrehe8541vrere7451ve", "disponible", 1499.99, "gasolina", 640);
		gesV.insertarVehiculos(supc2);
	}

}
