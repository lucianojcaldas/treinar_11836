package pt.com.i9.view;

import java.util.Scanner;

import pt.com.i9.bfg.model.Armas;

public class MenuArmas {

	Scanner in = new Scanner(System.in);

	public void Menu() {

		Armas ak = new Armas();
		ak.nomeArma = "Ak47";
		ak.carregador = 30;
		ak.rate = 7.1;
		ak.firePower = 9;

		Armas famas = new Armas();
		famas.nomeArma = "Fama";
		famas.carregador = 35;
		famas.rate = 6.3;
		famas.firePower = 7;

		Armas m4 = new Armas();
		m4.nomeArma = "colt";
		m4.carregador = 25;
		m4.rate = 8.2;
		m4.firePower = 8;

		Armas bfg = new Armas();
		bfg.nomeArma = "BFG!";
		bfg.carregador = 30;
		bfg.rate = 7.1;
		bfg.firePower = 9;

		Integer op = null;;
//ciclo para escolher arma
		
			System.out.println("Escolha a sua arma!");
			System.out.print("\t0 - Sair\n\t1 - Ak47\n\t2 - Fama\n\t3 - Colt\n\t4 - BFG\n=>");
			op = in.nextInt();
			switch (op) {
			case 1:
				System.out.println("Voce escolheu Ak47");
				break;
			case 2:
				System.out.println("Voce escolheu Fama");
				break;
			case 3:
				System.out.println("Voce escolheu Colt");
				break;
			case 4:
				System.out.println("Voce escolheu BFG!");
				break;
			default:
				System.out.println("Nao escolheu nehuma arma");

			}

		
	}
}
