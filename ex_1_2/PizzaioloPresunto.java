package ex_1_2;

public class PizzaioloPresunto implements Pizzaiolo {

	@Override
	public void fazerPizza() {
		System.out.println("A pizza do dia é Presunto: Queijo + Presunto + Tomate");
	}

	@Override
	public void fazerCalzone() {
		System.out.println("O calzone do dia é Presunto: Queijo + Presunto + Tomate");
	}

}
