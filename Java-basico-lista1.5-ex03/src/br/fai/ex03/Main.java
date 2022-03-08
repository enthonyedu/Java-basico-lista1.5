package br.fai.ex03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main app = new Main();
		app.start();

	}

	private void start() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Palavra ou frase: ");
		
		String texto = s.nextLine();
		
		System.out.println("Por caractere: ");
		
		char[] letras = texto.toCharArray();
		String TextoCompleto = "";	
		for (int i = letras.length -1; i >=  0; i--) {
			System.out.print(letras[i]);
			TextoCompleto += letras[i];
			
		}
		System.out.println();
		System.out.println("String: " + TextoCompleto);

	}

}
