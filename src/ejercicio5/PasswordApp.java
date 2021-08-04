package ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PasswordApp {

	public static void main(String[] args) {

		// introduzco variables,
		Scanner teclado = new Scanner(System.in);

		int arrayLength = 0;
		int passwordsLength = 0;
		Password[] passwordsArray;
		boolean[] isFuerteArray;
		boolean continua;

		// pido la longitud de array de contraseñas,
		//hasta que no sea un número,
		do {
			try {
				continua = false;
				
				System.out.println("Diga el tamaño de array");
				arrayLength = teclado.nextInt();
			}
			catch (InputMismatchException ex) {
				System.out.println("El tamaño de array puede ser solo un número entero");
				teclado.next();
				continua = true;
			}
		} while (continua);

		// pido la longitud de las contraseñas,
		//hasta que no sea un número,
		do {
			try {
				continua = false;
				
				System.out.println("Diga de que longuitud crear contraseñas");
				passwordsLength = teclado.nextInt();
			}

			catch (InputMismatchException ex) {
				System.out.println("La longitud de contraseñas puede ser solo un número entero.");
				teclado.next();
				continua = true;
			}
		} while (continua);

		
		// inicializamos los arrays,
		passwordsArray = new Password[arrayLength];
		isFuerteArray = new boolean[arrayLength];

		// guardo en un array las contraseñas creadas,
		// y en otro si es fuerte o no,
		for (int i = 0; i < passwordsArray.length; i++) {
			passwordsArray[i] = new Password(passwordsLength);

			isFuerteArray[i] = passwordsArray[i].esFuerte2();
		}

		// mostramos datos de las contraseñas,

		for (int i = 0; i < passwordsArray.length; i++) {
			System.out.println(passwordsArray[i].getContrasenya() + " " + isFuerteArray[i]);
		}

		teclado.close();
	}

}
