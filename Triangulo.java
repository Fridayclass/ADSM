package eng2020_1_a01;

public class Triangulo extends Poligono  {

	public Triangulo(double base, double altura) {
		super(base, altura);
	}

	
	@Override
	public double area() {
		return (getAltura()*getBase())/2;
	}
   @Override
	public double perimetro() {
		return (Math.sqrt(Math.pow(getAltura(),2)+Math.pow((getBase()/2),2)))*2+getBase();
	}

@Override
	public String toString() {
		return "Triangulo [base=" + getBase() + ", altura=" + getAltura() + ", lado"+Math.sqrt(Math.pow(getAltura(),2)+Math.pow((getBase()/2),2))+ "]";

}
}