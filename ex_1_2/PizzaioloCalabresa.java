package ex_1_2;

public class PizzaioloCalabresa implements Pizzaiolo {

	@Override
	public void fazerPizza() {
		System.out.println("A pizza do dia � Calabresa: Queijo + Calabresa + Tomate");
	}

	@Override
	public void fazerCalzone() {
		System.out.println("O calzone do dia � Calabresa: Queijo + Calabresa + Tomate");
	}

}
