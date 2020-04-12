package ex6_2;

public class SelectionS implements Ordenadores {

	public SelectionS() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int[] ordenar(int[] vetor) {
		int i, j, min, x;
		for (i = 0; i < vetor.length - 1; ++i) {
			min = i;
			for (j = i + 1; j < vetor.length; ++j) {
				if (vetor[j] < vetor[min])
					min = j;
			}
			x = vetor[i];
			vetor[i] = vetor[min];
			vetor[min] = x;
		}
		return vetor;
	}

}