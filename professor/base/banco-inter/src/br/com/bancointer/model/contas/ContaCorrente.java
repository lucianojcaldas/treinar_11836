package br.com.bancointer.model.contas;

import br.com.bancointer.model.core.Conta;
import br.com.bancointer.model.core.IContaPagavel;

public class ContaCorrente extends Conta implements IContaPagavel {

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

	@Override
	public Double getSaldo() {
		Double saldoOrigem = super.getSaldo();
		return saldoOrigem + limiteCredito;
	}

	@Override
	public void saque(Double ValorSaque) {
		if (saldo > (ValorSaque + 1)) {
			this.saldo -= (ValorSaque + 1);
		}
	}

	@Override
	public void pagar() {
		saque(taxaManutencao);
	}

}
