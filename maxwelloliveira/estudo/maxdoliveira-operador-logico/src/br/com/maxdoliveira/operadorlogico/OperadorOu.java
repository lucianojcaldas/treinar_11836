package br.com.maxdoliveira.operadorlogico;

public class OperadorOu {
	public static void main(String[] args) {
			int idade = 18;
			boolean convidado = false;
			boolean podeEntrarNaFesta = idade >= 18 || convidado;
			System.out.println(podeEntrarNaFesta);
	}
}