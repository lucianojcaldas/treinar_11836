package br.com.bancointer.principal;

import br.com.bancointer.view.TelaBancoInter;

public class Principal {

	public static void main(String[] args) {
		TelaBancoInter banco = new TelaBancoInter();
		banco.iniciar();
		System.out.println(
				"------------------------------------------------\n    Muito Obrigado por utilizar o Banco Inter\n------------------------------------------------");
	}

}