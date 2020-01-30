package br.com.bancointer.view;

import java.util.Scanner;

public class TelaBancoInter {

	Scanner teclado = new Scanner(System.in);
	
	public void iniciar() {
		Integer opcao;
		do {
			System.out.print("Informe\n\t0 - Sair\n\t1 - Criar Conta\n=> ");
			opcao = teclado.nextInt();
		} while (!opcao.equals(0));
	}

}
