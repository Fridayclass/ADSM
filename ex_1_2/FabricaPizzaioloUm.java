package ex_1_2;

public class FabricaPizzaioloUm implements FabricaPizzaiolo {

	@Override
	public Pizzaiolo getInstance() {
		return new PizzaioloCalabresa();
	}

}
