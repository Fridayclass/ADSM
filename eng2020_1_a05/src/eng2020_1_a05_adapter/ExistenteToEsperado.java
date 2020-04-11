package eng2020_1_a05_adapter;

import java.util.ArrayList;
import java.util.List;

public class ExistenteToEsperado implements SomadorEsperado {
	
	public final SomadorExistente existente;
	
	public ExistenteToEsperado(SomadorExistente existente) {
		this.existente = existente;
	}
	
	public int somaVetor(int[] vetor) {
		List<Integer> lista = new ArrayList<Integer>();
		for(int i:vetor) {
			lista.add(i);
		}
		return existente.somaLista(lista);
	}
	
}