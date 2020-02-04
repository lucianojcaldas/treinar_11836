package br.com.bancointer.model.conta;

import br.com.bancointer.model.core.Conta;

public class ContaPoupanca extends Conta {

	private Double taxaRendimento;

	@Override
	public void sacar(Double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
		}
	}

	public Double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(Double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}
	
}
