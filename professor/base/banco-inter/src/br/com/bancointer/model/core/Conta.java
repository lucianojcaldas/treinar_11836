package br.com.bancointer.model.core;

import br.com.bancointer.model.Cliente;
import java.util.Scanner;
public class Conta {

	private Double saldo;
	private Integer numero;
	private Integer agencia;
	private Cliente cliente;
	protected Scanner teclado = new Scanner(System.in);
	public Conta() {
		saldo = 0d;

	}

	public void depositar(Double valorDeposito) {
		saldo += valorDeposito;

	}

	public double recuperarSaldo() {
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
