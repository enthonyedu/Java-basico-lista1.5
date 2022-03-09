package br.fai.ex04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main app = new Main();
		app.start();

	}

	private void start() {
		Scanner s = new Scanner(System.in);

		System.out.print("String: ");

		String texto = s.nextLine();

		int convertido = Integer.parseInt(texto);

		System.out.printf("Int: %d", convertido);

	}

}
