package ejercicio3;

public class RandomException extends Exception {
	
	private static final long serialVersionUID = 1L;
	protected int numeroGenerado;

	public RandomException(int numeroGenerado) {

		super();
		this.numeroGenerado = numeroGenerado;
	}


	//reescribimos el método getMessage,
	//para comprobar si número es par o impar,
	@Override
	public String getMessage() {

		if (this.numeroGenerado % 2 == 0) {
			return "Es par";
		} else {
			return "Es impar";
		}
	}
}
