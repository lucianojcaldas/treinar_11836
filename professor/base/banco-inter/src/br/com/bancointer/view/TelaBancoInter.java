package br.com.bancointer.view;

import java.util.Scanner;

import br.com.bancointer.conta.ContaCorrente;
import br.com.bancointer.conta.ContaInvestimento;
import br.com.bancointer.conta.ContaPoupança;
import br.com.bancointer.conta.ContaSalario;
import br.com.bancointer.model.core.Conta;

public class TelaBancoInter {
	private Integer tipoConta;
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
				if (c != null) {
					criarAtributosContaPai(c);
				}
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

	public Conta criarConta() {

		System.out.println(
				"Informe o tipo da conta a criar:\n\t0 - Conta Corrente\n\t1 - Conta Poupança\n\t2 - Conta Salário\n\t3 - Conta Investimento\n=> ");
		tipoConta = teclado.nextInt();
		switch (tipoConta) {
		case 0:
			System.out.println("Criada uma Conta Corrente.");
			ContaCorrente contaC = new ContaCorrente();
			return contaC;

		case 1:
			System.out.println("Criada uma Conta Poupança.");
			ContaPoupança contaP = new ContaPoupança();
			return contaP;
		case 2:
			System.out.println("Criada uma Conta Salário.");
			ContaSalario contaS = new ContaSalario();
			return contaS;
		case 3:
			System.out.println("Criada uma Conta Investimento.");
			ContaInvestimento contaI = new ContaInvestimento();
			return contaI;
		default:

			System.out.println("Código Inválido.");
			break;
		}
		return null;

	}

	public void criarAtributosContaPai(Conta conta) {
		System.out.print("Informe o numero da conta: ");
		Integer numeroConta = teclado.nextInt();
		conta.setNumero(numeroConta);
		System.out.print("Informe o numero da agencia: ");
		conta.setAgencia(numeroConta);
		System.out.print("Informe o saldo da conta: ");
		conta.depositar(teclado.nextDouble());
	}

	public void exibirSaldo(Conta conta) {
		if (conta == null) {
			System.out.println("Por favor crie a conta antes.");
		} else {
			System.out.println("Saldo atual: " + conta.recuperarSaldo());
		}
		System.out.println("\n<----------------->\n");
	}

	public void fazerDeposito(Conta conta) {
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
