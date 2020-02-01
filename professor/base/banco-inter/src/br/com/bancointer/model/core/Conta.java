package br.com.bancointer.model.core;

import br.com.bancointer.model.Cliente;

public class Conta {

	private Double saldo;
	public Double limiteCredito;
	public Integer numero;
	public Integer agencia;
	public Cliente cliente;
	
	public Conta() {
		saldo = 0d;
		limiteCredito = 0d;
	}

	public void depositar(Double valor) {
		saldo += valor;
	}
	
	public Double recuperarSaldo() {
		return saldo + limiteCredito;
	}

}
