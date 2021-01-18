package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.deck.Deck;

public class BlackjackDeckTest {

	@Test
	public void testBlackjackDeckSize() {

		Deck deck = new Deck();
		assertEquals(52, deck.getCards().size());
	}

}
