package ex7_1;

public class Maiusculo {
	
	private static String custom;
	
	public static void upper(String custom) {
	String change = custom.toUpperCase();
	System.out.println(change);
	}

	public static String getCustom() {
		return custom;
	}

	public static void setCustom(String custom) {
		Maiusculo.custom = custom;
	}
}