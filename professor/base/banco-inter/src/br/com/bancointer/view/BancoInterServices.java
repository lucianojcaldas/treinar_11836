package br.com.bancointer.view;

import java.util.Scanner;

import br.com.bancointer.model.Cliente;
import br.com.bancointer.model.core.Conta;

public class BancoInterServices {
	public Scanner teclado;

	public BancoInterServices(Scanner teclado) {
		this.teclado = teclado;
	}
	
	private Integer validaExistenciaConta(Integer opcao, Conta conta) {
		if (opcao != 1 && conta == null) {
			System.out.println("Voce não possui conta. Deseja criar uma conta agora? \n Informe S (Sim) ou N (não)");
			String criaConta = data.teclado.next();

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
		String nomeCliente = data.teclado.next();
		cliente.nome = nomeCliente;
		System.out.print("Digite a idade: ");
		int idadeCliente = data.teclado.nextInt();
		cliente.idade = idadeCliente;
		return cliente;
	}

	private Conta criarConta(Cliente cliente) {
		System.out.println("------------------------------------------------" 
	            + "\n                 Crindo Conta"
				+ "\n------------------------------------------------");
		Conta conta;
		// Criando a Conta
		conta = new Conta();
		System.out.print("Informe o numero da conta: ");
		conta.numero = data.teclado.nextInt();
		conta.cliente = cliente;
		System.out.print("Informe o numero da agencia: ");
		conta.agencia = data.teclado.nextInt();
		conta.saldo = 0d;
		return conta;
	}

	private void exibirSaldo(Conta conta) {
		if (conta == null) {
			System.out.println("Favor criar a conta primeiro. \n------------------------\n");
		} else {
			System.out.println("O Saldo da conta é: " + conta.saldo + "\n------------------------\n");
		}
	}

	private void transferir(Conta conta) {
		System.out.println("Digite o Valor que deseja transferir: ");
		Double valorTransferencia = data.teclado.nextDouble();
		System.out.println("digite a Conta de Destino: ");
		Integer contaDestino = data.teclado.nextInt();
		conta.transferir(valorTransferencia, contaDestino);
	}

	private void sacar(Conta conta) {
		System.out.println("Digite o Valor que deseja sacar: ");
		Double valorSaque = data.teclado.nextDouble();
		conta.saque(valorSaque);
	}

	private void depositar(Conta conta) {
		System.out.println("Digite o Valor que deseja depositar: ");
		Double valorDeposito = data.teclado.nextDouble();
		conta.depositar(valorDeposito);
	}


}