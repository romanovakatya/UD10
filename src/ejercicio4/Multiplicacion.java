package ejercicio4;

public class Multiplicacion extends Calculo{
	
	//atributos,
	int multiplicacion;
	
	
	//constructor por defecto,
	public Multiplicacion() {
		super();

	}

	//multiplicar,
	@Override
	protected void calcular() {
		
		this.setNumero1();
		this.setNumero2();

		this.multiplicacion = this.num1 * this.num2;
	}

	@Override
	public String toString() {
		return this.num1 + " * " + this.num2 + " = " + this.multiplicacion;
	}
}
