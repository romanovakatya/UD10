package ejercicio3;

import java.util.Random;

public class RandomNum {

	// atributos,
	protected Random random = new Random();
	protected int numeroGenerado;

	// constructor por defecto,
	public RandomNum() {

		super();
	}

	
	// método que genera un número aleatorio utilizando clase Random,
	private int generarNumeroAleatorio(int valorMin, int valorMax) {

		System.out.println("Generando número aleatorio...");
		return this.random.nextInt((valorMax + valorMin) + valorMin);
	}

	// método que se ejecuta en el main,
	public void init() {

		try {

			//generamos un número aleatorio,
			this.numeroGenerado = this.generarNumeroAleatorio(0, 999);
			
			//mostramos el resultado,
			System.out.println("El número aleatorio generado es: " + this.numeroGenerado);
			
			//creamos una nueva excepción,
			throw new RandomException(this.numeroGenerado);
			
		} catch (RandomException e) {
			//mostramos si número es par o impar,
			System.out.println(e.getMessage());
		}
	}
}
