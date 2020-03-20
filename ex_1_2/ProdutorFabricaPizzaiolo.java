package ex_1_2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class ProdutorFabricaPizzaiolo {

	private ProdutorFabricaPizzaiolo() {
	}
	public static FabricaPizzaiolo getFabrica() {
		GregorianCalendar dNow = new GregorianCalendar(2020, 02, 17);
		Date now = dNow.getTime();
		SimpleDateFormat ft = new SimpleDateFormat("E");
		String s2 = ft.format(now);
		String s = s2.toLowerCase();
		System.out.println("Hoje é " + s);
		return getFabrica(s);
	}
	
	private static FabricaPizzaiolo getFabrica(String dia) {
		
		switch(dia) {
		case "seg":
			return new FabricaPizzaioloUm();
		case "ter":
			return new FabricaPizzaioloDois();
		case "qua":
			return new FabricaPizzaioloUm();
		case "qui":
			return new FabricaPizzaioloDois();
		case "sex":
			return new FabricaPizzaioloUm();
		case "sab":
			return new FabricaPizzaioloDois();
		case "dom":
			System.out.println("Pizzaria fechada.");
		}
		return null;
	}
}
