package ejercicio5;

import java.util.Random;

public class Password {

	// atributos,
	private int longitud;
	private String contrasenya;
	private final int LONGITUD_DEFECTO = 8;
	private final String passwordBase = "0123456789AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
	private Random rng = new Random();

	// constructores,
	// por defecto,
	public Password() {
		super();
		this.longitud = this.LONGITUD_DEFECTO;
		this.contrasenya = "";
	}

	// con el parámetro longitud,
	public Password(int longitud) {

		this.longitud = longitud;
		this.generarPassword();
	}

	// métodos,
	// los getters y setters,
	public int getLongitud() {
		return this.longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasenya() {
		return this.contrasenya;
	}

	//comprobación de una contraseña con Regex,
	public boolean esFuerte() {

		String pattern = "([A-Z]{3,}[a-z]{2,}\\d{6,})";
		if (this.contrasenya.matches(pattern)) {
			return true;
		} else {
			return false;
		}
	}

	//comprobación de contraseña si es fuerte contando simbolos requieredos,
	public boolean esFuerte2() {
		int countMayusculas = 0;
		int countMinusculas = 0;
		int countNumbers = 0;

		String[] arrayPassword = this.contrasenya.split("");

		for (int i = 0; i < arrayPassword.length; i++) {

			if (Character.isUpperCase(arrayPassword[i].charAt(0))) {
				countMayusculas++;
			}
			if (Character.isLowerCase(arrayPassword[i].charAt(0))) {
				countMinusculas++;
			}
			if (isNumeric(arrayPassword[i])) {
				countNumbers++;
			}
		}

		if ((countMayusculas > 2) && (countMinusculas > 1) && (countNumbers > 5)) {
			return true;
		} else {
			return false;
		}
	}

	// método que genera un password,
	public void generarPassword() {

		char[] text = new char[this.longitud];

		for (int i = 0; i < this.longitud; i++) {
			text[i] = this.passwordBase.charAt(this.rng.nextInt(this.passwordBase.length()));
		}

		this.contrasenya = new String(text);
	}

	// método que comprueba si un String se puede convertir en un número,
	public boolean isNumeric(String cadena) {

		boolean resultado;

		try {
			Integer.parseInt(cadena);
			resultado = true;
		} catch (NumberFormatException excepcion) {
			resultado = false;
		}

		return resultado;
	}
}
