package ex7_1;

public class Minusculo {
	
	private static String custom;
	
	public static void lower(String custom) {
	String change = custom.toLowerCase();
	System.out.println(change);
	}

	public static String getCustom() {
		return custom;
	}

	public static void setCustom(String custom) {
		Minusculo.custom = custom;
	}
}