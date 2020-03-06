package eng2020_1_a01;

import java.util.ArrayList;

public class Geometria {

	public Geometria() {
			}
	
	public static void main(String[] args) {
		ArrayList<Figura> figuras = new ArrayList();
		ArrayList<Solido> solidos = new ArrayList();

		figuras.add(new Circulo(10.0));
		figuras.add(new Retangulo(5,10));
		figuras.add(new Quadrado(10));
      figuras.add(new Triangulo(10,20));
      figuras.add(new Paralelogramo(10, 5, 7));
      figuras.add(new Trapezio(20, 5, 5,7));
		
		
		for(Figura figura: figuras) {
			System.out.println("**********************************************");
			System.out.println(figura);
			System.out.println("Area = "+figura.area());
         System.out.println("Perimetro = "+figura.perimetro());

			if (figura instanceof Diagonal) {
				Diagonal d = (Diagonal)figura;
				System.out.println("Diagonal = "+d.diagonal());
			}
		}
      
      solidos.add(new Cubo(10));
      solidos.add(new Cilindro(3,10));
      solidos.add(new Esfera(4));
      solidos.add(new Piramide(6,6,6));
      
      for(Solido solido: solidos) {
			System.out.println("**********************************************");
			System.out.println(solido);
			System.out.println("Volume = "+solido.volume());

	}
  }
}