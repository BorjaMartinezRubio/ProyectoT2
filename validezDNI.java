
public class validezDNI {

	protected boolean comprobar(String dniAComprobar) {

		// Array con las letras posibles del dni en su posición
		char[] letraDni = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
				'H', 'L', 'C', 'K', 'E' };

		String num = "";
		int ind = 0;

		// boolean que nos indicara si es un dni correcto o no
		boolean valido = true;

		// existen dnis con 7 digitos numericos, si fuese el caso
		// le añado un cero al principio
		if (dniAComprobar.length() == 8) {
			dniAComprobar = "0" + dniAComprobar;
		}

		// compruebo que el 9º digito es una letra
		if (!Character.isLetter(dniAComprobar.charAt(8))) {
			valido = false;
		}

		// compruebo su longitud que sea 9
		if (dniAComprobar.length() != 9) {
			valido = false;
		}

		// Compruebo que lo 8 primeros digitos sean numeros
		for (int i = 0; i < 8; i++) {

			if (!Character.isDigit(dniAComprobar.charAt(i))) {
				valido = false;
			}
			// si es numero, lo recojo en un String
			num += dniAComprobar.charAt(i);
		}

		// paso a int el string donde tengo el numero del dni
		ind = Integer.parseInt(num);

		// calculo la posición de la letra en el array que corresponde a este dni
		ind %= 23;

		// verifico que la letra del dni corresponde con la del array
		if ((Character.toUpperCase(dniAComprobar.charAt(8))) != letraDni[ind]) {
			valido = false;
		}
		// si el flujo de la funcion llega aquí, es que el dni es correcto
		return valido;
	} // fin comprobar

} // Fin ComprobarNif
