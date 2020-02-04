package br.com.bancointer.model.core;

import br.com.bancointer.model.Cliente;

public class Conta {

	private Double saldo;
	private Integer numero;
	private Integer agencia;
	private Cliente cliente;
	private String tipo;

	public Conta(Double saldo) {
		this();
		this.depositar(saldo);
	}

	public Conta() {
		saldo = 0d;
	}

	public void depositar(Double valor) {
		saldo += valor;
	}

	public void saque(Double valor) {
		saldo -= valor;
	}

	public void transferir(Double valor, Integer contaDestino) {
		saldo -= valor;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


}
