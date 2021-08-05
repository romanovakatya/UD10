package ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Calculo {

	// atributos,
	protected boolean isNotNumber;
	protected int num1;
	protected int num2;
	protected Scanner teclado = new Scanner(System.in);

	// constructor por defecto,
	public Calculo() {
		super();

	}

	// método para hacer cálculos simples,
	protected abstract void calcular();

	// comprobación para el número uno,
	protected void setNumero1() {

		do {
			try {
				this.isNotNumber = false;

				this.pedirNumero1();
				num1 = teclado.nextInt();

			}
			// controlamos si usuario escribe una letra en vez de cifra,
			catch (InputMismatchException ex) {
				System.out.println("Tiene que ser un número entero");
				teclado.next();
				this.isNotNumber = true;
			} catch (NumberFormatException ex1) {
				System.out.println("No es un número");
				teclado.next();
				this.isNotNumber = true;
			}

		} while (this.isNotNumber);
	}

	// comprobación para el número dos,
	public void setNumero2() {
		do {
			try {
				this.isNotNumber = false;

				this.pedirNumero2();
				num2 = teclado.nextInt();

			}
			// controlamos si usuario escribe una letra en vez de cifra,
			catch (InputMismatchException ex2) {
				System.out.println("Tienes que introducir un número entero");
				teclado.next();
				this.isNotNumber = true;
			} catch (NumberFormatException ex3) {
				System.out.println("No es un número");
				teclado.next();
				this.isNotNumber = true;
			}

		} while (this.isNotNumber);
	}
	
	//para poder adaptar mensajes a cada tipo de cálculos,
	protected void pedirNumero1() {
		System.out.println("Escribe un número");
	}
	
	protected void pedirNumero2() {
		System.out.println("Escribe otro número");
	}
}
