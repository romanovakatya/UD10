package ejercicio2;

public class CustomException extends Exception{

	private static final long serialVersionUID = 1L;
	
	//atributos,
	
	protected String message;
	protected int codeMessage;
	
	
	//constructores,
	public CustomException() {		
		super();		
	}

	public CustomException(int codeMessage) {
		
		this.codeMessage = codeMessage;		
	}

	@Override
	public String getMessage() {
		
		if (this.codeMessage == 1) {
			return "Excepción capturada con mensaje: Esto es un objeto Exception";
		}
		else {
			return "Excepción capturada con mensaje: el código desconocido";
		}
	}		
}
