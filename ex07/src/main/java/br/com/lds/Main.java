package br.com.lds;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

import org.apache.commons.lang3.ArrayUtils;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main app = new Main();
		app.start();

	}

	private final int VALOR_MINIMO_DO_TAMANHO_DO_ARRAY = 2;
	private final int VALOR_MAXIMO_DO_TAMANHO_DO_ARRAY = 5;

	private final int VALOR_MINIMO_DO_CONTEUDO_DO_ARRAY = -100;
	private final int VALOR_MAXIMO_DO_CONTEUDO_DO_ARRAY = 100;

	private int[] gerarArrayComValoresAleatorios() {

		int tamanhoDoArray = obterValorAleatorio(VALOR_MINIMO_DO_TAMANHO_DO_ARRAY, VALOR_MAXIMO_DO_TAMANHO_DO_ARRAY);

		int[] arrayDinamico = new int[tamanhoDoArray];

		for (int i = 0; i < arrayDinamico.length; i++) {
			arrayDinamico[i] = obterValorAleatorio(VALOR_MINIMO_DO_CONTEUDO_DO_ARRAY, VALOR_MAXIMO_DO_CONTEUDO_DO_ARRAY);
		}
		
		return arrayDinamico;

	}

	private int obterValorAleatorio(int minimo, int maximo) {

		Random random = new Random();

		return random.nextInt((maximo - minimo) + 1) + minimo;
	}

	private void start() {

//		int[] primeiroArray = { 50, -20, 0, 40 };
		int[] primeiroArray = gerarArrayComValoresAleatorios();
		int[] segundoArray = gerarArrayComValoresAleatorios();

		exibirValores(primeiroArray);
		exibirValores(segundoArray);

		int[] arraysCombinados = combinarArrays(primeiroArray, segundoArray);

		int soma = somar(arraysCombinados);

		System.out.println("Soma: " + soma);

		double media = mediaArray(soma, arraysCombinados.length);

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

	private double mediaArray(int soma, int length) {
		return (double) soma / length;

	}

	private void exibirMedia(double media) {

		DecimalFormat decimalFormat = new DecimalFormat("#.##");

		System.out.println("Media: " + decimalFormat.format(media));
	}

}
