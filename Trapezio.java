package eng2020_1_a01;

public class Trapezio extends Poligono  {
private double baseMenor;
private double lado;
	public Trapezio(double base, double altura, double baseMenor, double lado) {
		super(base, altura);
      this.lado = lado;
      this.baseMenor = baseMenor;
	}
public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

public double getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(double baseMenor) {
		this.baseMenor =baseMenor ;
	}


	@Override
	public double area() {
		return (getAltura()*(getBase()+getBaseMenor()))/2;
	}
   
   @Override
	public double perimetro() {
		return getBaseMenor()+getBase()+(getLado()*2);
	}
   @Override
	public String toString() {
		return "Trapezio [lado=" + getLado()+"base menor="+getBaseMenor()+"base maior="+getBase()+"altura="+getAltura()+ "]" ;

}

}
