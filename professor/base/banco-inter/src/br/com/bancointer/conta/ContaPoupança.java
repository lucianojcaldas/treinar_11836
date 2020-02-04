package br.com.bancointer.conta;

import br.com.bancointer.model.core.Conta;

public class ContaPoupança extends Conta {
	private Double taxaRendimento;

	public ContaPoupança() {
		System.out.println("Informe a taxa de Rendimento da Conta.");
		setTaxaRendimento(teclado.nextDouble());

	}

	public Double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(Double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}
}
