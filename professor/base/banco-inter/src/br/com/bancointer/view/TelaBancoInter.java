package br.com.bancointer.view;

import java.util.Scanner;

import br.com.bancointer.model.Cliente;
import br.com.bancointer.model.contas.ContaCorrente;
import br.com.bancointer.model.contas.ContaInvestimento;
import br.com.bancointer.model.contas.ContaPoupanca;
import br.com.bancointer.model.contas.ContaSalario;
import br.com.bancointer.model.core.Conta;

public class TelaBancoInter {

	Scanner teclado = new Scanner(System.in);

	public String recuperarMenu() {
		return "Informe\n\t0 - Sair" 
	                + "\n\t1 - Criar Conta" 
				    + "\n\t2 - Exibir Saldo" 
	                + "\n\t3 - Realizar Deposito"
				    + "\n\t4 - Realizar Saque" 
	                + "\n\t5 - Realizar Transferencia" 
				    + "\n=> ";
	}

	public void iniciar() {
		Integer opcao;
		Conta conta = null;
		do {
			System.out.print(recuperarMenu());
			opcao = teclado.nextInt();
			opcao = validaExistenciaConta(opcao, conta);
			switch (opcao) {
			case 0:
				break;
			case 1:
				Cliente cliente = criarCliente();
				conta = criarConta(cliente);
				
				//imprime informações da conta criada
				String nome = conta.getCliente().nome;
				int idade = conta.getCliente().idade;
				System.out.print("Cliente: "   + nome 
						        + "\n Idade: " + idade 
						        + "\n CC: "    + conta.getNumero() 
						        + "\n AG: "    + conta.getAgencia() 
						        + "\n Saldo: " + conta.getSaldo() 
						        + "\n------------------------\n");
				break;
			case 2:
				exibirSaldo(conta);
				break;
			case 3:
				depositar(conta);
				break;
			case 4:
				sacar(conta);
				break;
			case 5:
				transferir(conta);
				break;
			default:
				System.out.print("Favor digitar um numero valido"
						       + "\n-----------------------------\n");
				break;
			}
		} while (!opcao.equals(0));
	}

	private Integer validaExistenciaConta(Integer opcao, Conta conta) {
		if (opcao != 1 && opcao != 0 && conta == null) {
			System.out.println("Voce não possui conta. Deseja criar uma conta agora? \n Informe S (Sim) ou N (não)");
			String criaConta = teclado.next();

			if (criaConta.equals("S") || criaConta.equals("Sim") || criaConta.equals("s") || criaConta.equals("sim")) {
				opcao = 1;
			} else {
				System.out.println("Operação Cancelada.");
				opcao = 0;
			}
		}
		return opcao;
	}

	private Cliente criarCliente() {
		System.out.println("------------------------------------------------" 
	                 + "\n              Cadastrando Cliente"
				     + "\n------------------------------------------------");
		// Criando o Cliente
		Cliente cliente = new Cliente();
		System.out.print("Digite o nome do Cliente: ");
		String nomeCliente = teclado.next();
		cliente.nome = nomeCliente;
		System.out.print("Digite a idade: ");
		int idadeCliente = teclado.nextInt();
		cliente.idade = idadeCliente;
		return cliente;
	}

	private Conta criarConta(Cliente cliente) {
		String tipoConta;
		Conta conta = null;
		System.out.print("------------------------------------------------" 
                         + "\nQual o Tipo de Conta que seja criar: "
				         + "\n\t 1 - Conta Corrente"
				         + "\n\t 2 - Conta Investimento"
				         + "\n\t 3 - Conta Poupança"
				         + "\n\t 4 - Salario"
				         + "\n------------------------------------------------"
				         + "\n=>");
		tipoConta = teclado.next();
		
		switch (tipoConta) {
		case "1":
			System.out.println("------------------------------------------------" 
	                       + "\n             Crindo Conta Corrente"
				           + "\n------------------------------------------------");
			Conta contaCorrente;
			// Criando a Conta
			contaCorrente = new ContaCorrente();
			contaCorrente.setTipo("1");

			System.out.print("Informe o numero da conta: ");
			contaCorrente.setNumero(teclado.nextInt());
			contaCorrente.setCliente(cliente);

			System.out.print("Informe o numero da agencia: ");
			contaCorrente.setAgencia(teclado.nextInt());

			System.out.print("Informe o Limite de Crédito: ");
			((ContaCorrente) contaCorrente).setLimiteCredito(teclado.nextDouble());

			System.out.print("Informe a taxa de Manutenção: ");
			((ContaCorrente) contaCorrente).setTaxaManutencao(teclado.nextDouble());

			System.out.println("Deseja inserir um saldo a conta? (S) Sim - (N) Não");
			if (teclado.next().equals("S") || teclado.next().equals("Sim") || teclado.next().equals("SIM")
					|| teclado.next().equals("sim") || teclado.next().equals("sIM")) {
				System.out.println("Digite o valor que deseja depositar: ");
				contaCorrente.depositar(teclado.nextDouble());
			} else {
				contaCorrente.depositar(0d);
			}
			conta = contaCorrente;
			break;
		case "2":
			System.out.println("------------------------------------------------" 
                           + "\n             Crindo Conta Investimento"
			               + "\n------------------------------------------------");
			Conta contaInvestimento;
			// Criando a Conta
			contaInvestimento = new ContaInvestimento();
			contaInvestimento.setTipo("2");
			
			System.out.print("Informe o numero da conta: ");
			contaInvestimento.setNumero(teclado.nextInt());
			contaInvestimento.setCliente(cliente);

			System.out.print("Informe o numero da agencia: ");
			contaInvestimento.setAgencia(teclado.nextInt());

			System.out.println("Informe a Taxa de Manutenção: ");
			((ContaInvestimento) contaInvestimento).setTaxaManutencao(teclado.nextDouble());

			System.out.println("Informe a Taxa de Rendimento: ");
			((ContaInvestimento) contaInvestimento).setTaxaRendimento(teclado.nextDouble());

			System.out.println("Deseja inserir um saldo a conta? (S) Sim - (N) Não");
			if (teclado.next().equals("S") || teclado.next().equals("Sim") || teclado.next().equals("SIM")
					|| teclado.next().equals("sim") || teclado.next().equals("sIM")) {
				System.out.println("Digite o valor que deseja depositar: ");
				contaInvestimento.depositar(teclado.nextDouble());
			} else {
				contaInvestimento.depositar(0d);
			}
			conta = contaInvestimento;
			break;
		case "3":
			System.out.println("------------------------------------------------" 
                           + "\n             Crindo Conta Poupança"
			               + "\n------------------------------------------------");
			Conta contaPoupanca;
			// Criando a Conta
			contaPoupanca = new ContaPoupanca();
			contaPoupanca.setTipo("3");

			System.out.print("Informe o numero da conta: ");
			contaPoupanca.setNumero(teclado.nextInt());
			contaPoupanca.setCliente(cliente);

			System.out.print("Informe o numero da agencia: ");
			contaPoupanca.setAgencia(teclado.nextInt());

			System.out.println("Informe a Taxa de Rendimento: ");
			((ContaPoupanca) contaPoupanca).setTaxaRendimento(teclado.nextDouble());

			System.out.println("Deseja inserir um saldo a conta? (S) Sim - (N) Não");
			if (teclado.next().equals("S") || teclado.next().equals("Sim") || teclado.next().equals("SIM")
					|| teclado.next().equals("sim") || teclado.next().equals("sIM")) {
				System.out.println("Digite o valor que deseja depositar: ");
				contaPoupanca.depositar(teclado.nextDouble());
			} else {
				contaPoupanca.depositar(0d);
			}
			conta = contaPoupanca;
			break;
		case "4":
			System.out.println("------------------------------------------------" 
                           + "\n             Crindo Conta Salario"
			               + "\n------------------------------------------------");
			Conta contaSalario;
			// Criando a Conta
			contaSalario = new ContaSalario();
			contaSalario.setTipo("4");

			System.out.print("Informe o numero da conta: ");
			contaSalario.setNumero(teclado.nextInt());
			contaSalario.setCliente(cliente);

			System.out.print("Informe o numero da agencia: ");
			contaSalario.setAgencia(teclado.nextInt());

			contaSalario.depositar(0d);

			conta = contaSalario;
			break;
		default:
			break;
		}		
		return conta;
		
	}

	private void exibirSaldo(Conta conta) {
		if (conta == null) {
			System.out.println("Favor criar a conta primeiro. \n------------------------\n");
		} else {
				System.out.println("O Saldo da conta é: " + conta.getSaldo() + "\n------------------------\n");

		}
	}

	private void transferir(Conta conta) {
		System.out.println("Digite o Valor que deseja transferir: ");
		Double valorTransferencia = teclado.nextDouble();
		System.out.println("digite a Conta de Destino: ");
		Integer contaDestino = teclado.nextInt();
		conta.transferir(valorTransferencia, contaDestino);
	}

	private void sacar(Conta conta) {
		System.out.println("Digite o Valor que deseja sacar: ");
		Double valorSaque = teclado.nextDouble();
		conta.saque(valorSaque);
	}

	private void depositar(Conta conta) {
		System.out.println("Digite o Valor que deseja depositar: ");
		Double valorDeposito = teclado.nextDouble();
		conta.depositar(valorDeposito);
	}

}
