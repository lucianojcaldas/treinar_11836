package br.com.maxdoliveira.view;

import java.util.Scanner;

public class Tela {
	
	Scanner teclado = new Scanner(System.in);
	public Integer numUm, numDois, operador; 
	
	public void iniciar() {
		
		System.out.print(" Favor entrar com o Primeiro Numero!");
		numUm = teclado.nextInt();
		System.out.print(" Favor entrar com o Segundo Numero!");
		numDois = teclado.nextInt();
		System.out.println("Qual operação deseja realizar?");
		operador = teclado.nextInt();
		
	}
}
