package ejercicio4;

public class Resta extends Calculo {

	// atributos,

	// private int num2 = 0;
	private int resta = 0;

	// constructor por defecto,
	public Resta() {
		super();
	}

	// restar,
	@Override
	public void calcular() {

		this.setNumero1();
		this.setNumero2();

		this.resta = this.num1 - this.num2;

	}

	@Override
	public String toString() {
		return this.num1 + " - " + this.num2 + " = " + this.resta;
	}

}
