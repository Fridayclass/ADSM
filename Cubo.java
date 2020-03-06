package eng2020_1_a01;

public  class Cubo extends Solido {
	private double lado;

	public Cubo(double lado) {
		this.lado = lado;
	
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado =lado;
	}
   @Override
   public double volume (){
   return Math.pow(getLado(),3);
   }

	
	@Override
	public String toString() {
		return "Cubo [Lado= " + getLado() + "]";
	}

}