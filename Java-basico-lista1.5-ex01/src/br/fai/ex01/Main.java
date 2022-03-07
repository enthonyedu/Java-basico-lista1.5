package br.fai.ex01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main app = new Main();
		app.start();

	}
	
	private void start () {
		Scanner scanner = new Scanner (System.in);
		
		int[] valores = new int[4];
		
		for (int i = 0; i < valores.length; i++) {
			
			System.out.println("Digite o valor "  + (i + 1) + ": ");
			
			valores[i] = scanner.nextInt();
			
		
		}
		
		calculo(valores);
		
	}

	private void calculo(int[] valores) {
		
		
		// TODO Auto-generated method stub
	}

}
