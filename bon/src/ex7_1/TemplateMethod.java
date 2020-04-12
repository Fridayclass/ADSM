package ex7_1;

import javax.swing.JOptionPane;

public abstract class TemplateMethod {
	
	public final static void templateMethod() {
		
		String custom = JOptionPane.showInputDialog("String a ser alterada");
		System.out.println("Original: " + custom);
		Maiusculo.upper(custom);
		Minusculo.lower(custom);
		Duplica.twice(custom);
		Reverte.invert(custom);
		
	}
}