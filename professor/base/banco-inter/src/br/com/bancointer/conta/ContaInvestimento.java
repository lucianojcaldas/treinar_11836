package br.com.bancointer.conta;

import br.com.bancointer.model.core.Conta;

public class ContaInvestimento extends Conta {
	private Double taxaRendimento;
	private Double taxaManutençao;

	public ContaInvestimento() {

		System.out.println("Informe a taxa de Manutenção da Conta.");
		setTaxaManutençao(teclado.nextDouble());
		System.out.println("Informe a taxa de Rendimento da Conta.");
		setTaxaRendimento(teclado.nextDouble());
	}

	public Double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(Double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

	public Double getTaxaManutençao() {
		return taxaManutençao;
	}

	public void setTaxaManutençao(Double taxaManutençao) {
		this.taxaManutençao = taxaManutençao;
	}

}
