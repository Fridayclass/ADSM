package ex7_1;

public class Reverte {
	
	private static String custom;
	
	public static void invert(String custom) {
	String change = new StringBuilder(custom).reverse().toString();
	System.out.println(change);
	}

	public static String getCustom() {
		return custom;
	}

	public static void setCustom(String custom) {
		Reverte.custom = custom;
	}
}