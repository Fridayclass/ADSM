package ex6_2;

import java.util.Arrays;

public class Teste {

	public static void main(String[] args) {
		
		int[] vetor = new int[200];
		
		for(int i = 0; i < vetor.length; i++) {
			int numero = (int)(1000*Math.random());
			vetor[i] = numero;
		}
		System.out.println(Arrays.toString(vetor));
		
		Ordenadores ordenador = new InsertionS();
		ContextOrdenador context = new ContextOrdenador(ordenador);
		context.organizar(vetor);
		
		System.out.println(Arrays.toString(vetor));
	}

}