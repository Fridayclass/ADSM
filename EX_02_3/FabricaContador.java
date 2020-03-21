package EX_02_3;

public class FabricaContador {

	static Contador getContador(String tipo) {
		
		if(tipo.equals("Arquivo")) 
			return new ContadorArquivo();
		
		if(tipo.equals("Console")) 
			return new ContadorConsole();
		
		return null;
	}
}


