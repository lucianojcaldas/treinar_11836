package br.com.bancointer.conta;

import br.com.bancointer.model.core.Conta;

public class ContaPoupanša extends Conta {
	private Double taxaRendimento;

	public ContaPoupanša() {
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
