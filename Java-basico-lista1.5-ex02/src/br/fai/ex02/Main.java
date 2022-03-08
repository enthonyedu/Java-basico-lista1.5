package br.fai.ex02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main app = new Main();
		app.start();

	}

	Scanner s = new Scanner(System.in);

	private void start() {

		double soma = 0.0;

		int i = 0;
		boolean emExecucao = true;
		while (emExecucao) {

			System.out.print("Valor " + (i + 1) + ": ");

			Double valor = s.nextDouble();

			System.out.println();

			if (i >= 4) {
				if (valor == -1) {
					emExecucao = false;
				}

			}

			if (emExecucao) {
				soma += valor;
				i += 1;
			}
		}
		
		System.out.println("Soma: " + soma);
		calcular(soma, i);

	}

	private void calcular(Double soma, int i) {
		double media = soma / i;
		System.out.println("Média: " + media);
	}

}
