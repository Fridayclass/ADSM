package ex_1_2;

public class PizzaioloPresunto implements Pizzaiolo {

	@Override
	public void fazerPizza() {
		System.out.println("A pizza do dia � Presunto: Queijo + Presunto + Tomate");
	}

	@Override
	public void fazerCalzone() {
		System.out.println("O calzone do dia � Presunto: Queijo + Presunto + Tomate");
	}

}
