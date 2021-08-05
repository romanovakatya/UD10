package ejercicio4;

public class ExcepcionCalculo extends Exception {

	//atributos,
	private static final long serialVersionUID = 1L;
	int code;

	//constructores,
	public ExcepcionCalculo() {
		super();

	}

	public ExcepcionCalculo(int code) {
		this.code = code;
	}

	// mensajes para excepciones nuevos,
	public String getMessage() {
		String message = "";
		switch (code) {
		// para potencia
		case 1:
			message = "El exponente no puede ser menor que 0";
			break;
		// para raiz cuadrada,
		case 2:
			message = "Tiene que ser un número positivo";
			break;
		case 3:
			message = "No se puede dividir entre 0";
			break;
		default:
			break;
		}
		return message;
	}

}
