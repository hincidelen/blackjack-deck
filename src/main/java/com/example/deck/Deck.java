package com.example.deck;

import java.util.ArrayList;
import java.util.List;

public class Deck {

	private static final int DECK_SIZE = 52;
	private List<PlayingCard> cards;

	public Deck() {
		cards = new ArrayList<PlayingCard>(DECK_SIZE);
		for (int i = 0; i < Suit.values().length; i++) {
			for (int j = 0; j < Pip.values().length; j++) {
				Suit suitOfCard = Suit.values()[i];
				Pip pipOfCard = Pip.values()[j];
				cards.add(new PlayingCard(suitOfCard, pipOfCard));
			}
		}
	}

	public List<PlayingCard> getCards() {
		return cards;
	}

	public PlayingCard getRandomPlayingCard() {
		return cards.get(0 + (int) (Math.random() * 52));

	}
}
