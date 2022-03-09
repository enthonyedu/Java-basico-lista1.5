package br.fai.ex05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main app = new Main();
		app.start();

	}

	private void start() {
		Scanner s = new Scanner(System.in);

		System.out.print("Frase: ");

		String valor = s.nextLine();

		if (valor.isEmpty()) {
			System.out.println("Nada foi digitado");
		} else {
			String[] palavras = valor.split(" ");
			System.out.println("Penultima palavra: " + palavras[palavras.length - 2]);

			if (palavras.length > 4) {
				System.out.println("Texto muito longo");
			}
		}

	}

}
