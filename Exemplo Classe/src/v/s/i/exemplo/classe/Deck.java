package v.s.i.exemplo.classe;

public class Deck {
	// Guarda o n�mero de cartas no deck
	Integer numeroCartasnoDeck;
	// Mostra informa��es de uma carta especifica no Deck
	int[][] cartaEspecifica;

	public Deck() {
		// Deck come�a vazio
		numeroCartasnoDeck = 0;
		// M�ximo de cartas em Yugioh � 60 cartas,e em Magic e Pokemon � necess�rio ter
		// exatamente 60 cartas
		cartaEspecifica = new int[60][2];
	}

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
