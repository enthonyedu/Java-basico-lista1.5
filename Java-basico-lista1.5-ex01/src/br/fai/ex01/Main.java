package br.fai.ex01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main app = new Main();
		app.start();

	}

	private Scanner scanner = new Scanner(System.in);

	private void start() {

		int[] valores = new int[4];

		int i = 0;

		while (i < 4) {

			System.out.print("Digite o valor " + (i + 1) + ": ");

			switch (i) {
			case 0:

				valores[0] = scanner.nextInt();

				break;

			case 1:
				valores[1] = scanner.nextInt();

				break;
			case 2:
				valores[2] = scanner.nextInt();

				break;

			case 3:

				valores[3] = scanner.nextInt();

				break;

			default:
				break;
			}

			i += 1;

		}

		calculos(valores);

	}

	private void calculos(int[] valores) {

		int maior = -1;
		int menor = 35345346;

		for (int i : valores) {

			maior = Math.max(i, maior);

		}

		for (int i : valores) {

			menor = Math.min(i, menor);

		}

		System.out.println("O menor valor é: " + menor);
		System.out.println("O maior valor é: " + maior);

		Classifica(maior);

	}

	private void Classifica(int maior) {
		if (maior > 50) {
			System.out.println("Valor muito alto");

		} else {
			System.out.println("Valor normal");
		}
	}

}
