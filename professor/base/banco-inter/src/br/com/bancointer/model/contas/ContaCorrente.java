package br.com.bancointer.model.contas;

import br.com.bancointer.model.core.Conta;

public class ContaCorrente extends Conta {

	private Double limiteCredito;
	private Double taxaManutencao;

	public Double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(Double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public Double getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(Double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}

	public Double recuperaSaldo() {
		return this.getSaldo() + limiteCredito;
	}
}
