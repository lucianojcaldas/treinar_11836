package br.com.bancointer.model.conta;

import br.com.bancointer.model.core.Conta;

public class ContaPoupanca extends Conta {

	private Double taxaRendimento;

	public Double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(Double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}
	
}
