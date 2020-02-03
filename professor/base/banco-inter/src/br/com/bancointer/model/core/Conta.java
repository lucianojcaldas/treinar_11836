package br.com.bancointer.model.core;

import br.com.bancointer.model.Cliente;

public class Conta {

	private Double saldo;
	private Double limiteCredito;
	private Integer numero;
	private Integer agencia;
	private Cliente cliente;

	public Conta() {
		saldo = 0d;
		limiteCredito = 0d;
	}

	public void depositar(Double valorDeposito) {
		saldo += valorDeposito;

	}

	public double recuperarSaldo() {
		return saldo + limiteCredito;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(Double limiteCredito) {
		this.limiteCredito = limiteCredito;
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
