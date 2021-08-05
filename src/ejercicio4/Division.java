package ejercicio4;

import java.util.InputMismatchException;

public class Division extends Calculo{
	
	//atributos,
	double division;

	//división,
	@Override
	protected void calcular() {
		this.setNumero1();
		this.setNumero2();
		
		this.division = (double)this.num1 / this.num2;	
	}

	@Override
	public String toString() {
		return  "El resultado de división " + this.num1 + " entre " + this.num2 + " es " + this.division;
	}
	
	@Override
	public void setNumero2() {
		do {
			try {
				this.isNotNumber = false;

				this.pedirNumero2();
				this.num2 = teclado.nextInt();
				
				if (this.num2 == 0) {
					throw new ExcepcionCalculo(3);
				}				
			}
			// controlamos si usuario escribe una letra en vez de cifra,
			catch (InputMismatchException ex2) {
				System.out.println("Tienes que introducir un número entero");
				teclado.next();
				this.isNotNumber = true;
			} catch (NumberFormatException ex3) {
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
