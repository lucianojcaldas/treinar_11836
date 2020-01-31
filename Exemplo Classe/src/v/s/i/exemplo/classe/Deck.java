package v.s.i.exemplo.classe;

public class Deck {
	// Deck come�a vazio
	Integer numeroCartasnoDeck = 0;
	// M�ximo de cartas em Magic,yugioh,pokemon � 60 cartas
	int[][] cartaEspecifica = new int[60][2];

	public void colocarCartaNoDeck(Integer numeroDentroDaExpansao, Integer numeroDaExpansao) {
		// Cada carta � identificada pela sua expans�o e seu n�mero dentro de sua
		// expans�o
		cartaEspecifica[numeroCartasnoDeck][0] = numeroDaExpansao;
		cartaEspecifica[numeroCartasnoDeck][1] = numeroDentroDaExpansao;
		// Carta catalogada no deck com sucesso,n�mero de cartas no deck aumenta por
		// consequ�ncia
		numeroCartasnoDeck++;
	}
}
