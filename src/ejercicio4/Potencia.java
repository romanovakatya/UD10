package ejercicio4;

import java.util.InputMismatchException;

public class Potencia extends Calculo{
	
	//atributoos,
	int potencia;

	//constructor por defecto,
	public Potencia() {
		
		super();
	}

	//potencia,
	@Override
	protected void calcular() {
		this.setNumero1();
		this.setNumero2();
		
		potencia = (int) Math.pow(this.num1, this.num2);
		
	}

	@Override
	public String toString() {
		return this.num1 + " elevado a la " + this.num2 + " es " + this.potencia;
	}
	
	@Override
	protected void pedirNumero1() {
		System.out.println("Introduce la base");
	}
	
	@Override
	protected void pedirNumero2() {
		System.out.println("Introduce el exponente");
	}
	
	@Override
	public void setNumero2() {
		do {
			try {
				this.isNotNumber = false;

				//System.out.println("Escribe otro número");
				this.pedirNumero2();
				this.num2 = teclado.nextInt();
				
				if (this.num2 < 0) {
					throw new ExcepcionCalculo(1);
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
