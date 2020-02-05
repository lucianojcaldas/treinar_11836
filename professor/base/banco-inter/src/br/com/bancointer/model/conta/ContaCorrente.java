package br.com.bancointer.model.conta;

import br.com.bancointer.model.core.Conta;
import br.com.bancointer.model.core.IContaPagavel;

public class ContaCorrente extends Conta implements IContaPagavel {

	private Double limiteCredito;
	private Double taxaManutencao;
	
	@Override
	public void sacar(Double valor) {
		if ((saldo + limiteCredito) >= (valor + 1)) {
			this.saldo -= (valor + 1);
		}
	}
	
	@Override
	public Double recuperarSaldo() {
		System.out.println(this.saldo);
		Double saldoOrigem = super.recuperarSaldo();
		return saldoOrigem + limiteCredito;
	}

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
	public void pagar() {
		sacar(taxaManutencao);
	}
	
}
