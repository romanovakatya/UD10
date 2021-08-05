package ejercicio4;

public class Suma extends Calculo {

	// atributos,
	private int sum = 0;

	// constructor por defecto,
	public Suma() {
		super();
	}

	// métodos para hacer cálculos simples,

	// sumar,
	@Override
	public void calcular() {

		this.setNumero1();
		this.setNumero2();

		this.sum = this.num1 + this.num2;

	}

	@Override
	public String toString() {
		return this.num1 + " + " + this.num2 + " = " + this.sum;
	}

}
