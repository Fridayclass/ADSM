package eng2020_1_a05_adapter;

public class TesteCliente {

	public static void main(String[] args) {
		SomadorExistente existente = new SomadorExistente();
		ExistenteToEsperado adapter = new ExistenteToEsperado(existente);
		
		Cliente cliente = new Cliente(adapter);
		
		cliente.executar();

	}

}