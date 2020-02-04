package br.com.bancointer.model.conta;

import br.com.bancointer.model.core.Conta;

public class ContaSalario extends Conta {

	private Integer contadorSaque;
	
	public ContaSalario() {
		this.contadorSaque = 0;
	}

	@Override
	public void sacar(Double valor) {
		if (super.saldo >= valor && contadorSaque < 2) {
			saldo -= valor;
			contadorSaque++;
		}
	}
	
}