package ex7_1;

public class Duplica {
	
	private static String custom;
	
	public static void twice(String custom) {
	String change = custom + " " + custom;
	System.out.println(change);
	}

	public static String getCustom() {
		return custom;
	}

	public static void setCustom(String custom) {
		Duplica.custom = custom;
	}
}