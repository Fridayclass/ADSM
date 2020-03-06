package eng2020_1_a01;

public  class Piramide extends Solido {
	private double lado;
   private double altura;
   private double profundidade;

	public Piramide(double lado,double altura,double profundidade) {
		this.lado = lado;
      this.altura = altura;
      this.profundidade=profundidade;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado =lado;
	}
   public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura =altura;
	}
   
    public double getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(double profundidade) {
		this.profundidade = profundidade;
	}
   
   
   @Override
   public double volume (){
   return (getProfundidade()*getLado()*getAltura())/3;
   }

	
	@Override
	public String toString() {
		return "Piramide [Lado= " + getLado() +"Profundidade= "+getProfundidade()+"altura= "+getAltura()+ "]";
	}

}