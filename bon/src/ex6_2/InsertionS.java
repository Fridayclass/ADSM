package ex6_2;

public class InsertionS implements Ordenadores {

	public InsertionS() {
	}

	@Override
	public int[] ordenar(int[] vetor) {
		
		int i, j, x;
		for (j = 1; j < vetor.length; ++j) {
			x = vetor[j];
			for (i = j - 1; i >= 0 && vetor[i] > x; --i) {
				vetor[i + 1] = vetor[i];
			}
			vetor[i + 1] = x;
		}
		return vetor;
	}

}