package br.com.bancointer.view;

import java.util.Scanner;

import br.com.bancointer.model.core.Conta;

public class TelaBancoInter {

	Scanner teclado = new Scanner(System.in);

	public String recuperarMenu() {
		return " Informe\n\t" 
				+ "0 - Sair\n\t" + "1 - Criar Conta\n\t" 
				+ "2 - Exibir Saldo\n\t" 
				+ "3 - Depositar\n\t"
				+ "\n=> ";
	}

	public void iniciar() {
		Integer opcao;
		Conta c = null;
		do {
			System.out.print(recuperarMenu());
			opcao = teclado.nextInt();

			switch (opcao) {
			case 1:
				c = criarConta();
				break;
			case 2:
				exebirSaldo(c);
				break;
			case 3:
				depositar(c);
				break;
			default:

				break;
			}

		} while (!opcao.equals(0));
	}

	private Conta criarConta() {
		Conta conta = new Conta();
		System.out.print("Informe o numero da conta: ");
		conta.numero = teclado.nextInt();
		System.out.print("Informe o numero da agencia: ");
		conta.agencia = teclado.nextInt();
		System.out.print("Informe o saldo da conta: ");
		conta.saldo = teclado.nextDouble();
		return conta;
	}

	private void exebirSaldo(Conta conta) {
		if (conta != null) {
			System.out.println("Saldo atual: " + conta.saldo);
		} else {
			System.out.println("Crie a conta primeiro");
		}
	}

	private void depositar(Conta conta) {
		System.out.println("Informe o valor a depositar");
		Double valor = teclado.nextDouble();
		conta.depositar(valor);
	}
}
