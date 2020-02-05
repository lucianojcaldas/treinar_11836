package br.com.bancointer.model.contas;

import br.com.bancointer.model.core.Conta;
import br.com.bancointer.model.core.IContaRentavel;

public class ContaPoupanca extends Conta implements IContaRentavel{

	private static Double taxaRendimento;

	static {
		taxaRendimento = 0d;
	}
	
	public static Double getTaxaRendimento() {
		return taxaRendimento;
	}

	public static void setTaxaRendimento(Double taxaRendimento) {
		ContaPoupanca.taxaRendimento = taxaRendimento;
	}

	@Override
	public void saque(Double ValorSaque) {
		if (this.saldo >= ValorSaque) {
			this.saldo -= ValorSaque;
		}
	}

	@Override
	public void render() {
		depositar(saldo * taxaRendimento);
		
	}

}
