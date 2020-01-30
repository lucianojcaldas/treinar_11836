package br.com.jb.operador;

public class Atividade1 {
	public static void main(String[] args) {
		int m = 135;
		int h = m / 60;
		int r = m % 60;
		String resultadoHoraMinuto = h +"h"+r+"m";
		System.out.println("Resultado = "+resultadoHoraMinuto);
	}
}
