package br.com.bancointer.conta;

import br.com.bancointer.model.core.Conta;

public class ContaInvestimento extends Conta {
	private Double taxaRendimento;
	private Double taxaManuten�ao;

	public ContaInvestimento() {

		System.out.println("Informe a taxa de Manuten��o da Conta.");
		setTaxaManuten�ao(teclado.nextDouble());
		System.out.println("Informe a taxa de Rendimento da Conta.");
		setTaxaRendimento(teclado.nextDouble());
	}

	public Double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(Double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

	public Double getTaxaManuten�ao() {
		return taxaManuten�ao;
	}

	public void setTaxaManuten�ao(Double taxaManuten�ao) {
		this.taxaManuten�ao = taxaManuten�ao;
	}

}
