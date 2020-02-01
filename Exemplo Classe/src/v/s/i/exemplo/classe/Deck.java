package v.s.i.exemplo.classe;

public class Deck {
	// Guarda o número de cartas no deck
	Integer numeroCartasnoDeck;
	// Mostra informações de uma carta especifica no Deck
	int[][] cartaEspecifica;

	public Deck() {
		// Deck começa vazio
		numeroCartasnoDeck = 0;
		// Máximo de cartas em Yugioh é 60 cartas,e em Magic e Pokemon é necessário ter
		// exatamente 60 cartas
		cartaEspecifica = new int[60][2];
	}

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
