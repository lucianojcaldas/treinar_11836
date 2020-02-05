package br.com.bancointer.model.core;

import br.com.bancointer.model.Cliente;

public abstract class Conta {

	protected Double saldo;
	private Integer numero;
	private Integer agencia;
	private Cliente cliente;

	public Conta(Double saldo) {
		this();
		depositar(saldo);
	}

	public Conta() {
		saldo = 0d;
	}
	
	public abstract void sacar(Double valor) ;

	public void depositar(Double valor) {
		saldo += valor;
	}

	public Double recuperarSaldo() {
		System.out.println("log de acesso - alguem recuperou saldo");
		return saldo;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
