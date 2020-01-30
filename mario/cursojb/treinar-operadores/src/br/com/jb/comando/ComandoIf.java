package br.com.jb.comando;

public class ComandoIf {
	public static void main(String[] args) {
		boolean podeEntrar = false;
		if (podeEntrar) {
			System.out.println("Entrou...");
		} else {
			System.out.println("Não entrou...");
			System.out.println("Vazouuuu...");
		}
		
		if (podeEntrar)
			System.out.println("Entrou...");
		else
			System.out.println("Não entrou...");

		System.out.println("Vazouuuu...");
	}
}
