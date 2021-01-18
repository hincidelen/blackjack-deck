package com.example.card;

import com.example.card.enums.Pip;
import com.example.card.enums.Suit;

public class PlayingCard {

	public PlayingCard(Suit suit, Pip pip) {
		super();
		this.suit = suit;
		this.pip = pip;
	}

	private Suit suit;
	private Pip pip;

	public Suit getSuit() {
		return suit;
	}

	public Pip getPip() {
		return pip;
	}

	@Override
	public String toString() {
		return "PlayingCard [suit=" + suit + ", pip=" + pip + "]";
	}
}
