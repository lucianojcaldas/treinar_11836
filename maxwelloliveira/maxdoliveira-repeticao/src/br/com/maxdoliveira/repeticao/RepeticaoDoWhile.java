package br.com.maxdoliveira.repeticao;

public class RepeticaoDoWhile {
	public static void main(String[] args) {
		int contador = 0;
		do {
			System.out.println("Contador vale: ".concat(String.valueOf(contador)));
			contador++;
		} while (contador < 10);
		System.out.println("Fim do Programa");
	}
}
