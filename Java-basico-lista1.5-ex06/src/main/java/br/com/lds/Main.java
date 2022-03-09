package br.com.lds;

import java.text.DecimalFormat;
import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main app = new Main();
		app.start();

	}

	private void start() {

		int[] primeiroArray = { 50, -20, 0, 40 };
		int[] segundoArray = { 5, -50, 10, 60 };

		exibirValores(primeiroArray);
		exibirValores(segundoArray);

		int[] arraysCombinados = combinarArrays(primeiroArray, segundoArray);

		int soma = somar(arraysCombinados);

		System.out.println("Soma: " + soma);

		Double media = mediaArray(soma, arraysCombinados.length);
		
		exibirMedia(media);


	}

	private void exibirValores(int[] array) {

		System.out.println("Array: " + Arrays.toString(array));
	}

	private int[] combinarArrays(int[] primeiroArray, int[] segundoArray) {

		int[] arraysCombinados = ArrayUtils.addAll(primeiroArray, segundoArray);

		System.out.println("Arrays combinados: " + Arrays.toString(arraysCombinados));

		return arraysCombinados;

	}

	private int somar(int[] array) {

		int soma = 0;
		for (int i = 0; i < array.length; i++) {

			soma += array[i];

		}

		return soma;

	}

	private Double mediaArray(int soma, int length) {
		return (double) (soma / length);

		
	}
	
	private void exibirMedia(Double media) {
		
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		
		System.out.println("Média: " + decimalFormat.format(media));
	}

}
