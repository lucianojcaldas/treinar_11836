package br.com.bancointer.view;

import java.util.Scanner;

import br.com.bancointer.model.core.Conta;

public class TelaBancoInter {

	Scanner teclado = new Scanner(System.in);

	public void iniciar() {
		Integer opcao;
		Conta c = null;
		do {
			System.out.println(recuperarMenu());
			opcao = teclado.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("\n<----------------->\n");
				break;
			case 1:
				c = criarConta();
				break;
			case 2:
				exibirSaldo(c);
				break;
			case 3:
				fazerDeposito(c);
				break;
			default:
				System.out.println("Código inválido.");
				System.out.println("\n<----------------->\n");
				break;
			}
		} while (!opcao.equals(0));
	}

	public String recuperarMenu() {
		return "Informe:\n\t0 - Sair\n\t1 - Criar Conta\n\t2 - Exibir Saldo\n\t3 - Depositar\n=> ";
	}

	private Conta criarConta() {

		Conta conta = new Conta();
		System.out.print("Informe o número da conta: ");
		conta.setNumero(teclado.nextInt());
		System.out.print("Informe o número da agencia: ");
		conta.setAgencia(teclado.nextInt());
		System.out.print("Informe o Depósito inicial da conta: ");
		conta.depositar(teclado.nextDouble());
		System.out.println("Informe o limite de Crédito Inicial: ");
		conta.setLimiteCredito(teclado.nextDouble());
		System.out.println("Conta criada com sucesso.");
		System.out.println("\n<----------------->\n");
		return conta;
	}

	private void exibirSaldo(Conta conta) {
		if (conta == null) {
			System.out.println("Por favor crie a conta antes.");
		} else {
			System.out.println("Saldo atual: " + conta.recuperarSaldo());
		}
		System.out.println("\n<----------------->\n");
	}

	private void fazerDeposito(Conta conta) {
		if (conta == null) {
			System.out.println("Por favor crie a conta antes.");
		} else {

			System.out.println("Informe o valor do depósito a ser feito: ");
			conta.depositar(teclado.nextDouble());
			System.out.println("Depósito feito com sucesso!");
		}
		System.out.println("\n<----------------->\n");
	}

}
