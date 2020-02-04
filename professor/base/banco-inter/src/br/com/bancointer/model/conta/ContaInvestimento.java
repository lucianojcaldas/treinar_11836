package br.com.bancointer.model.conta;

import br.com.bancointer.model.core.Conta;

public class ContaInvestimento extends Conta {

	private Double taxaManutencao;
	private Double taxaRendimento;

	@Override
	public void sacar(Double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
		}
	}
	
	public Double getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(Double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}

	public Double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(Double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

}
