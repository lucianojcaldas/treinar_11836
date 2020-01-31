package v.s.i.exemplo.classe;

public class Deck {
	// Deck começa vazio
	Integer numeroCartasnoDeck = 0;
	// Máximo de cartas em Magic,yugioh,pokemon é 60 cartas
	int[][] cartaEspecifica = new int[60][2];

	public void colocarCartaNoDeck(Integer numeroDentroDaExpansao, Integer numeroDaExpansao) {
		// Cada carta é identificada pela sua expansão e seu número dentro de sua
		// expansão
		cartaEspecifica[numeroCartasnoDeck][0] = numeroDaExpansao;
		cartaEspecifica[numeroCartasnoDeck][1] = numeroDentroDaExpansao;
		// Carta catalogada no deck com sucesso,número de cartas no deck aumenta por
		// consequência
		numeroCartasnoDeck++;
	}
}
