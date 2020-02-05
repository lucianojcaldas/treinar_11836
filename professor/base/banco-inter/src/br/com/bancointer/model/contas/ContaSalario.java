package br.com.bancointer.model.contas;

import br.com.bancointer.model.core.Conta;

public class ContaSalario extends Conta {

	private Integer contadorSaque;

	public ContaSalario() {
		this.contadorSaque = 0;
	}

	@Override
	public void saque(Double ValorSaque) {
		if (this.saldo >= ValorSaque && contadorSaque < 2) {
			this.saldo -= ValorSaque;
			contadorSaque++;
		}

	}

}
