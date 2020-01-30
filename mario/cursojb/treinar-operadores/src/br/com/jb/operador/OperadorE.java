package br.com.jb.operador;

public class OperadorE {
	public static void main(String[] args) {
		int idade = 17;
		boolean convidado = false;
		boolean podeEntrarNaFesta = !(idade >= 18 && convidado);
		System.out.println(podeEntrarNaFesta);
	}
}
