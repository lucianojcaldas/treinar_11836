package br.com.bancointer.view;

import java.util.Scanner;

import br.com.bancointer.model.conta.ContaCorrente;
import br.com.bancointer.model.conta.ContaInvestimento;
import br.com.bancointer.model.conta.ContaPoupanca;
import br.com.bancointer.model.core.Conta;
import br.com.bancointer.model.core.IContaPagavel;
import br.com.bancointer.model.core.IContaRentavel;

public class TelaBancoInter {

	Scanner teclado = new Scanner(System.in);

	public String recuperarMenu() {
		return "Informe\n\t"
				+ "0 - Sair\n\t"
				+ "1 - Criar Conta\n\t"
				+ "2 - Exibir Saldo\n\t"
				+ "3 - Depositar\n\t"
				+ "4 - Sacar\n\t"
				+ "5 - Exibir Limite De Crédito\n\t"
				+ "6 - Obter Rendimento\n\t"
				+ "7 - Realizar Pagamento\n\t"
				+ "8 - Cadastrar taxa de rendimento\n\t"
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
				exibirSaldo(c);
				break;
			case 3:
				depositar(c);
			case 4:
				sacar(c);
				break;
			case 5:
				exibirLimiteCredito(c);
				break;
			case 6:
				obterRendimento(c);
				break;
			case 7:
				realizarPagamento(c);
				break;
			case 8:
				cadastrarTaxaRendimento(c);
				break;
			default:
				break;

			}
		} while (!opcao.equals(0));
	}

	private void cadastrarTaxaRendimento(Conta c) {
		System.out.print("Informe a taxa de rendimento: ");
		ContaPoupanca.setTaxaRendimento(teclado.nextDouble());
		System.out.println("Taxa cadastrada com sucesso!");
	}

	private void realizarPagamento(Conta c) {
		if (c instanceof IContaPagavel) {
			((IContaPagavel)c).pagar();
		}
	}

	private void obterRendimento(Conta c) {
		if (c instanceof IContaRentavel) {
			((IContaRentavel)c).render();
		}
	}

	private void exibirLimiteCredito(Conta c) {
		if (c instanceof ContaCorrente) {
			System.out.println("Limite de crédito: " + ((ContaCorrente)c).getLimiteCredito());
		} else {
			System.out.println("Este tipo de conta nao possui limite de crédito, faça um empréstimo!");
		}
	}

	private void sacar(Conta c) {
		System.out.print("Informe o valor a ser sacado: ");
		Double valor = teclado.nextDouble();
		c.sacar(valor);
		System.out.println("Saque efetuado com sucesso!");
	}

	public String recuperarMenuCriarConta() {
		return "Informe\n\t"
				+ "1 - Conta Corrente\n\t"
				+ "2 - Conta Poupança\n\t"
				+ "3 - Conta Salário\n\t"
				+ "4 - Conta Investimento\n\t"
				+ "\n=> ";
	}
	
	private void criarConta(Conta conta) {
		System.out.print("Informe o numero da conta: ");
		Integer numeroConta = teclado.nextInt();
		conta.setNumero(numeroConta);
		System.out.print("Informe o numero da agencia: ");
		conta.setAgencia(teclado.nextInt());
		System.out.print("Informe o saldo da conta: ");
		conta.depositar(teclado.nextDouble());
	}
	
	private Conta criarConta() {
		System.out.print(recuperarMenuCriarConta());
		Integer opcao = teclado.nextInt();
		Conta c = null;
		switch (opcao) {
		case 1:
			c = criarContaCorrente();
			break;
		case 2:
			c = criarContaPoupanca();
			break;
		case 3:
			c = criarContaSalario();
			break;
		case 4:
			c = criarContaInvestimento();
			break;
		default:
			break;
		}
		return c;
		
	}

	private Conta criarContaCorrente() {
		ContaCorrente c = new ContaCorrente();
		criarConta(c);
		System.out.print("Informe a taxa de manutencao: ");
		c.setTaxaManutencao(teclado.nextDouble());
		System.out.print("Informe o limite de Crédito: ");
		c.setLimiteCredito(teclado.nextDouble());
		return c;
	}
	
	private Conta criarContaInvestimento() {
		ContaInvestimento c = new ContaInvestimento();
		criarConta(c);
		System.out.print("Informe a taxa de manutencao: ");
		c.setTaxaManutencao(teclado.nextDouble());
		System.out.print("Informe a taxa de rendimento: ");
		c.setTaxaRendimento(teclado.nextDouble());
		return c;
	}
	
	private Conta criarContaPoupanca() {
		ContaPoupanca c = new ContaPoupanca();
		criarConta(c);
		return c;
	}
	
	private Conta criarContaSalario() {
		ContaCorrente c = new ContaCorrente();
		criarConta(c);
		return c;
	}

	private void exibirSaldo(Conta conta) {
		if (conta != null) {
			System.out.println("Saldo atual: " + conta.recuperarSaldo());
		} else {
			System.out.println("Crie a conta primeiro.");
		}
	}

	private void depositar(Conta conta) {
		System.out.print("Informe o valor a ser depositado: ");
		Double valor = teclado.nextDouble();
		conta.depositar(valor);
	}

}

