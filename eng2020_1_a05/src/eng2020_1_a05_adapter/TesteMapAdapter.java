
public class TesteMapAdapter {
	
	public static void main(String args[]) {
		Integer[][] squares = { {2, 4}, {3, 9}, {4, 16}}; 
		MapAdapter adapter = new MapAdapter(squares); 
		System.out.println("adapter map contains : " + adapter); 
		}
}
