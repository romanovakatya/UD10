package ejercicio2;

public class CustomExceptionApp {

	public static void main(String[] args) {
		
		try {
			
			System.out.println("Mensaje mostrado por pantalla");
			
			CustomException customException = new CustomException(1);
			
			throw customException;
			
		}
		catch (CustomException exception) {
			
			System.out.println(exception.getMessage());
		}

		finally {
			System.out.println("Programa terminado");
		}

	}

}
