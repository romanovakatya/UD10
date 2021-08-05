package ejercicio4;

import java.util.InputMismatchException;

public class RaizCuadrada extends Calculo{
	
	//atributos,
	private double raizCuadrada;

	//raiz cuadrada,
	@Override
	protected void calcular() {
		
		setNumero1();
		
		raizCuadrada = Math.sqrt(this.num1);		
	}
	
	@Override
	public String toString() {
		return  "La raíz cuadrada de " + this.num1 + " es " + this.raizCuadrada;
	}
	
	// comprobación para el número uno,
		protected void setNumero1() {

			do {
				try {
					this.isNotNumber = false;

					this.pedirNumero1();
					this.num1 = teclado.nextInt();
					
					if (this.num1 < 0) {
						throw new ExcepcionCalculo(2);
					}

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
				catch (ExcepcionCalculo e) {
					
					System.out.println(e.getMessage());				
					
					this.isNotNumber = true;
				}

			} while (this.isNotNumber);
		}

}
