package br.com.bancointer.model.core;

import br.com.bancointer.model.Cliente;

public class Conta {

	public Double saldo;
	public Double limiteCredito;
	public Integer numero;
	public Integer agencia;
	public Cliente cliente;
	
	public void depositar(Double valor) {
		saldo += valor;
	}
	
	public Double recuperarSaldo() {
		return saldo + limiteCredito;
	}

}
