package br.com.bancointer.conta;



import br.com.bancointer.model.core.Conta;

public class ContaCorrente extends Conta {
	private Double limiteCredito;
	private Double taxaManutencao;
	

	public ContaCorrente() {
		System.out.println("Informe a taxa de Manuten��o da Conta.");
		setTaxaManutencao(teclado.nextDouble());
		System.out.println("Informe o limite de Cr�dito.");
		setLimiteCredito(teclado.nextDouble());
	}

	public Double getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(Double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}

	public Double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(Double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
}
