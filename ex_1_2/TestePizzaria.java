package ex_1_2;

public class TestePizzaria {

	public static void main(String[] args) {
		
		FabricaPizzaiolo fabrica = ProdutorFabricaPizzaiolo.getFabrica();
		Pizzaiolo pizzaiolo = fabrica.getInstance();
		pizzaiolo.fazerPizza();
	}

}
