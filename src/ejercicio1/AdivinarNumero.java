package ejercicio1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AdivinarNumero {

	// atributos,
	protected Scanner teclado = new Scanner(System.in);
	protected int numero;

	// constructor,
	public AdivinarNumero() {
		super();
	}

	// métodos,

	// método para generar un número aleatorio,
	private static int generarNumero(int valorMin, int valorMax) {

		return (int) Math.floor(Math.random() * ((valorMax - valorMin) + 1) + valorMin);
	}

	// método para dar pistas al usuario para ayudar a adivinar el número,
	private void darPistas(int numUser) {

		if (numUser > this.numero) {
			System.out.println("El número es menor que has introducido");

		} else if (numUser < this.numero) {
			System.out.println("El número es mayor que has introducido");

		}
	}

	// el método principal que se ejecuta en el main,
	public void jugar() {
		int contador = 0;
		int numUser = 0;
	
		//generamos un número aleatoreo,
		this.numero = generarNumero(1, 500);
		System.out.println(this.numero);

		//mientras no se adivina el número,
		do {
			//pedimoslo,
			try {
				System.out.println("Adivina el número:");			
				numUser = teclado.nextInt();
				
				//mostramos pistas,
				this.darPistas(numUser);
				
			} catch (InputMismatchException e) {
				//para controlar si lo que introduce usuario no es un número, 
				System.out.println("Debe ingresar un número");
				teclado.next();

			}
			//contamos intentos,
			contador++;

		} while (numUser != this.numero);

		//mostramos el resultado al acabar,
		System.out.println("Has adivinado el número con " + contador + " intentos");

	}
}
