package br.com.bancointer.model.contas;

import br.com.bancointer.model.core.Conta;
import br.com.bancointer.model.core.IContaPagavel;
import br.com.bancointer.model.core.IContaRentavel;

public class ContaInvestimento extends Conta implements IContaPagavel, IContaRentavel{

	private Double taxaManutencao;
	private Double taxaRendimento;

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

	@Override
	public void saque(Double ValorSaque) {
		this.saldo -= ValorSaque;
	}

	@Override
	public void render() {
		depositar(saldo * taxaRendimento);
	}

	@Override
	public void pagar() {
		saque(taxaManutencao);
	}

}
