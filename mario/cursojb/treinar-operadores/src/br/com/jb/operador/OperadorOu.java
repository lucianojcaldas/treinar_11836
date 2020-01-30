package br.com.jb.operador;

public class OperadorOu {
	public static void main(String[] args) {
		int idade = 17;
		boolean convidado = true;
		boolean podeEntrarNaFesta = idade >= 18 || convidado;
		System.out.println(podeEntrarNaFesta);
	}
}
