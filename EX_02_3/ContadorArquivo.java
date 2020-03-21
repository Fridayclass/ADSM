package EX_02_3;

import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class ContadorArquivo implements Contador {

	public void contar() {
		
		PrintWriter writer = null;
		
		try {
			writer = new PrintWriter("log.txt");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

		for(int i = 0; i <= 10; i++) 
			writer.println(i);
		
		writer.close();
		
	}
}
