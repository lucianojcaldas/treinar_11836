package pt.com.i9.bfg.model;

public class Matematica {
	public Double numero1;
	public Double numero2;
	public Double largura;
	public Double altura;

	public void soma(Double altura) {
		altura = numero1 + numero2;
	}

	public Double area() {
		return altura * largura;
	}

}
