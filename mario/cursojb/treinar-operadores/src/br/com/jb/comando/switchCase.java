package br.com.jb.comando;

public class switchCase {
	public static void main(String[] args) {
		int i = 2;
		
		switch (i) {
		case 1:
			System.out.println("Case Um");
			break;
		case 2:
			System.out.println("Case Dois");
			break;
		case 3:
			System.out.println("Case Três");
			break;
		default:
			System.out.println("Case Nenhum Valor");
		}
	}
}
