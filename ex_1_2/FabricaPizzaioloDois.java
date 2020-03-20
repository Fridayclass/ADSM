package ex_1_2;

public class FabricaPizzaioloDois implements FabricaPizzaiolo {

	@Override
	public Pizzaiolo getInstance() {
		return new PizzaioloPresunto();
	}

}
