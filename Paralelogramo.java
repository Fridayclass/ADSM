package eng2020_1_a01;

public class Paralelogramo extends Poligono  {
private double lado;//referente ao lado inclinado do paralelogramo
	public Paralelogramo (double base, double altura, double lado) {
		super(base, altura);
      this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double area() {
		return getAltura()*getBase();
	}
   
     @Override
	public double perimetro() {
		return 2*(getBase()+getLado()) ;
	}
   
   @Override
	public String toString() {
		return "Paralelogramo [Base=" + getBase() + ", Altura=" + getAltura() +"Lado menor= "+getLado()+ "]";
	}


}
