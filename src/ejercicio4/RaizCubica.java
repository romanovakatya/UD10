package ejercicio4;


public class RaizCubica extends Calculo{
	
	//atributos,
	private double raizCubica;

	
	//raiz cubica,
	@Override
	protected void calcular() {
		
		setNumero1();
		
		raizCubica = Math.cbrt(this.num1);		
	}
	
	@Override
	public String toString() {
		return  "La raíz cubica de " + this.num1 + " es " + this.raizCubica;
	}
	
}
