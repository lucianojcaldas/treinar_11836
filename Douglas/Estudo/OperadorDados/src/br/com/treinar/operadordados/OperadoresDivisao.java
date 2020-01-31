package br.com.treinar.operadordados;

public class OperadoresDivisao {
	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		// Substracao
		float resultado = (float) a / b;
		System.out.println("Divisao de " + a + " / " + b + " = " + resultado);
		
		float resto= a % b;
		System.out.println("Resto da Divisao de " + a + " / " + b + " = " + resto);
	}
}
