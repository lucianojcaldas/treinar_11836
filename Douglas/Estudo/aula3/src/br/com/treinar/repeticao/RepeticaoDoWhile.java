package br.com.treinar.repeticao;

public class RepeticaoDoWhile {
	public static void main(String[] args) {
		int contador = 10;
		do {
			System.out.println("Contador Vale ".concat(String.valueOf(contador)));
			contador++;
		} while (contador < 10);
		System.out.println("Fim do programa");
	}
}
