package eng2020_1_a01;

public class Esfera extends Solido {
	private double raio;

	public Esfera(double raio) {
		this.raio = raio;
	
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio =raio;
	}
   @Override
   public double volume (){
   return ((Math.pow(getRaio(),3)* Math.PI)*4)/3;
   }

	
	@Override
	public String toString() {
		return "Esfera [Raio= " + getRaio() + "]";
	}

}