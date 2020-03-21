package EX_02_3;

public class Teste {

	public static void main(String[] args) {
		
		Contador cont = FabricaContador.getContador("Arquivo");
		cont.contar();
	}
	
}

