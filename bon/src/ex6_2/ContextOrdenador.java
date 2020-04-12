package ex6_2;

public class ContextOrdenador {
	
	private final Ordenadores ordenador;
	
	public ContextOrdenador(Ordenadores ordenador) {
		this.ordenador = ordenador;
	}
	
	public int[] organizar(int vetor[]) {
		ordenador.ordenar(vetor);		
		return vetor;
	}

}